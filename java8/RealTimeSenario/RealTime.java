package java8.RealTimeSenario;

import java.util.*;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;

class Employee{
    int id;
    String name;
    int age;
    String gender;
    String department;
    int yearOfJoining;
    double salary;

    public Employee(int id, String name, int age, String gender, String department, int yearOfJoining, double salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.department = department;
        this.yearOfJoining = yearOfJoining;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getYearOfJoining() {
        return yearOfJoining;
    }

    public void setYearOfJoining(int yearOfJoining) {
        this.yearOfJoining = yearOfJoining;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", department='" + department + '\'' +
                ", yearOfJoining=" + yearOfJoining +
                ", salary=" + salary +
                '}';
    }
}

class Result {
    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<Employee>();

        employeeList.add(new Employee(111, "Jiya Brein", 32, "Female", "HR", 2011, 25000.0));
        employeeList.add(new Employee(122, "Paul Niksui", 25, "Male", "Sales And Marketing", 2015, 13500.0));
        employeeList.add(new Employee(133, "Martin Theron", 29, "Male", "Infrastructure", 2012, 18000.0));
        employeeList.add(new Employee(144, "Murali Gowda", 28, "Male", "Product Development", 2014, 32500.0));
        employeeList.add(new Employee(155, "Nima Roy", 27, "Female", "HR", 2013, 22700.0));
        employeeList.add(new Employee(166, "Iqbal Hussain", 43, "Male", "Security And Transport", 2016, 10500.0));
        employeeList.add(new Employee(177, "Manu Sharma", 35, "Male", "Account And Finance", 2010, 27000.0));
        employeeList.add(new Employee(188, "Wang Liu", 31, "Male", "Product Development", 2015, 34500.0));
        employeeList.add(new Employee(199, "Amelia Zoe", 24, "Female", "Sales And Marketing", 2016, 11500.0));
        employeeList.add(new Employee(200, "Jaden Dough", 38, "Male", "Security And Transport", 2015, 11000.5));
        employeeList.add(new Employee(211, "Jasna Kaur", 27, "Female", "Infrastructure", 2014, 15700.0));
        employeeList.add(new Employee(222, "Nitin Joshi", 25, "Male", "Product Development", 2016, 28200.0));
        employeeList.add(new Employee(233, "Jyothi Reddy", 27, "Female", "Account And Finance", 2013, 21300.0));
        employeeList.add(new Employee(244, "Nicolus Den", 24, "Male", "Sales And Marketing", 2017, 10700.5));
        employeeList.add(new Employee(255, "Ali Baig", 23, "Male", "Infrastructure", 2018, 12700.0));
        employeeList.add(new Employee(266, "Sanvi Pandey", 26, "Female", "Product Development", 2015, 28900.0));
        employeeList.add(new Employee(277, "Anuj Chettiar", 31, "Male", "Product Development", 2012, 35700.0));

        Map<String, Long> malefemale = employeeList.stream()
                .collect(Collectors.groupingBy(Employee::getGender,Collectors.counting()));

        System.out.println("Total No of male female is: "+malefemale);

        System.out.println("=======================================================================");

        employeeList.stream()
                .map(Employee::getDepartment)
                .distinct()
                .forEach(s -> System.out.println("Department: "+s));

        System.out.println("=======================================================================");

        double avgFemaleAge = employeeList.stream()
                .collect(Collectors.averagingDouble(Employee::getAge));
        System.out.println("Avg age of female is: " +avgFemaleAge);

        double avgMaleAge = employeeList.stream()
                .collect(Collectors.averagingDouble(Employee::getAge));
        System.out.println("Avg age of male is: "+avgMaleAge);

        System.out.println("=======================================================================");

        Optional<Employee> maxsalary = employeeList.stream()
                .reduce(BinaryOperator.maxBy(Comparator.comparingDouble(Employee::getSalary)));
        System.out.println(maxsalary);

        System.out.println("=======================================================================");

        employeeList.stream()
                .filter(e -> e.yearOfJoining>2015)
                .map(Employee::getName)
                .forEach(s -> System.out.println(s));

        System.out.println("=======================================================================");

        Map<String, Long> noOfEmp = employeeList.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment,Collectors.counting()));
        Set<Map.Entry<String , Long>> empDep = noOfEmp.entrySet();
        for(Map.Entry<String, Long> entry : empDep){
            System.out.println(entry.getKey()+ " - "+ entry.getValue());
        }

        System.out.println("=======================================================================");

        Map<String, Double> avgSalary = employeeList.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment,Collectors.averagingDouble(Employee::getSalary)));
        System.out.println("Averaging salary is: "+avgSalary);

        System.out.println("=======================================================================");

        Optional<Employee> youngestEmployee = employeeList.stream()
                .filter(s -> s.getGender()=="Male" && s.getDepartment()=="Product Development")
                .min(Comparator.comparingInt(Employee::getAge));
        System.out.println(youngestEmployee);

        System.out.println("=======================================================================");

        Optional<Employee> MostExperience = employeeList.stream()
                .sorted(Comparator.comparingInt(Employee::getYearOfJoining)).findFirst();
        System.out.println("High Experience person is : "+MostExperience);

        System.out.println("=======================================================================");

        Map<String, Long> MFSaleDept = employeeList.stream()
                .filter(s -> s.getDepartment() == "Sales And Marketing")
                .collect(Collectors.groupingBy(Employee::getGender,Collectors.counting()));
        System.out.println("Total male female in Sales And Marketing dept: " + MFSaleDept);

        System.out.println("=======================================================================");

        Map<String, Double> f = employeeList.stream()
                .collect(Collectors.groupingBy(Employee::getGender,Collectors.averagingDouble(Employee::getSalary)));
        System.out.println(f);

        System.out.println("=======================================================================");

        Map<String, List<Employee>> empListByDept = employeeList.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment));
        Set<Map.Entry<String, List<Employee>>> entrySet = empListByDept.entrySet();

        for(Map.Entry<String, List<Employee>> entry : entrySet){

            System.out.println(entry.getKey()+" - "+entry.getValue());
        }

        System.out.println("=======================================================================");

        DoubleSummaryStatistics totalAvgSalary = employeeList.stream()
                .collect(Collectors.summarizingDouble(Employee::getSalary));
        System.out.println("Avg Salary: "+totalAvgSalary.getAverage());
        System.out.println("Total salary: "+totalAvgSalary.getSum());

        System.out.println("=======================================================================");

        Map<Boolean, List<Employee>> partitoned = employeeList.stream()
                        .sorted(Comparator.comparing(Employee::getDepartment))
                        .collect(Collectors.partitioningBy(s -> s.getAge() >= 25));

        List<Employee> lessthan = partitoned.get(true);
        List<Employee> greterthan = partitoned.get(false);

        System.out.println("----------------------- less than 25 -------------------------");
        lessthan.forEach(s -> System.out.println(s.getName()+ " - "+ s.getAge()));
        System.out.println("----------------------- greater than 25 ----------------------");
        greterthan.forEach(e -> System.out.println(e.getName()+" - "+e.getAge()));

        System.out.println("=======================================================================");

        Optional<Employee> oldestEmp = employeeList.stream()
                .collect(Collectors.maxBy(Comparator.comparingInt(Employee::getAge)));

        Employee oldOne = oldestEmp.get();
        System.out.println("Name: "+oldOne.getName());
        System.out.println("Department: "+oldOne.getDepartment());
        System.out.println("Age: "+oldOne.getAge());
    }
}