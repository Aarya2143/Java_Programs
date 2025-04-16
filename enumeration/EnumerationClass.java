package enumeration;

public enum EnumerationClass  //extend abc ----------Enum neither inherit from another class
{
    Value1 (10,20),
    Value2 (30,40);

    int a ;
    int b;

    EnumerationClass(int a, int b) {
        this.a = a;
        this.b = b;
    }

    void add(){
        int c = a+b;
        System.out.println(c);
    }

    public static void main(String[] args) {
        EnumerationClass obj = EnumerationClass.Value1;
        EnumerationClass obj1 = EnumerationClass.Value2;
        obj.add();
        obj1.add();
    }
}
class abc //extends EnumerationClass -------- nor can get extended
{

}