package java8.stream.CollectorsMethod;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupByExample {
    private String name ;
    private int qty;
    private BigDecimal salary;

    public GroupByExample(String name, int qty, BigDecimal salary) {
        this.name = name;
        this.qty = qty;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }
}

class Another{
    public static void main(String[] args) {
        List<GroupByExample> samp = Arrays.asList(
                new GroupByExample("samir",12,new BigDecimal(45000)),
                new GroupByExample("vivek",32,new BigDecimal(35000)),
                new GroupByExample("kailas",38,new BigDecimal(12000)),
                new GroupByExample("vaivalya",43,new BigDecimal(23000)),
                new GroupByExample("kavya",32,new BigDecimal(89000)),
                new GroupByExample("virendre",34,new BigDecimal(50000)),
                new GroupByExample("kavstrubh",40,new BigDecimal(37000)));

        Map<String, Long> str = samp.stream().collect(
                Collectors.groupingBy(GroupByExample::getName,Collectors.counting()));
        System.out.println(str);
    }
}