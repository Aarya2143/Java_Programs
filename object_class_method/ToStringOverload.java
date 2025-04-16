package object_class_method;

public class ToStringOverload {
    String name;
    int age;

    ToStringOverload(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "ToStringOverload{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public static void main(String[] args) {
        ToStringOverload s1 = new ToStringOverload("fft",5);
        ToStringOverload s2 = new ToStringOverload("fbhj",59);
        System.out.println(s1);
        System.out.println(s2);
    }
}
