package encapsulation;

public class Practice1 {
    private int age ;
    private String name ;
    private long adharNo ;
    private String city;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getAdharNo() {
        return adharNo;
    }

    public void setAdharNo(long adharNo) {
        this.adharNo = adharNo;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public static void main(String[] args) {
        Practice1 obj = new Practice1();
        obj.setAge(12);
        obj.setCity("pune");
        obj.setName("vishakha");
        obj.setAdharNo(2554622);
        System.out.println("name is: "+obj.getName()+" "+ "city is: "+obj.getCity() +" "+
                            "age is: "+obj.getAge() +" "+ "AdharNO: "+obj.getAdharNo());
    }
}
