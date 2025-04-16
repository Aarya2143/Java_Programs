package constructor;
/*
class student{
    int rollno ;
    int age;
    String name;
    char div;

    student(int rollno,int age,String name,char div)
    {
        this.rollno=rollno;
        this.age=age;
        this.div=div;
        this.name=name;
    }

    public static void main(String[] args) {
     student mitali = new student(1,18,"mitali",'A');
        System.out.println("roll no:"+mitali.rollno+" "+"age:"+mitali.age+" "+"division:"+mitali.div+" "+"name:"+mitali.name);

        student vinay = new student(2,19,"vinay",'B');
        System.out.println("roll no:"+vinay.rollno+" "+"age:"+vinay.age+" "+"division:"+vinay.div+" "+"name:"+vinay.name);

        student raj = new student(3,19,"raj",'c');
        System.out.println("roll no:"+raj.rollno+" "+"age:"+raj.age+" "+"division:"+raj.div+" "+"name:"+raj.name);
    }
}
*/
// -------------------------------------- 7 -------------------------------------------------
/*
class employees{
    double id;
    String name;
    int Salary;
    int age;

    employees(int id,String name, int Salary, int age){
        this.id=id;
        this.age=age;
        this.name=name;
        this.Salary=Salary;
    }
    void vinod(){
        System.out.println("id: "+1+"name: "+"vinod"+"age: "+42+"salary: "+500000);
    }
    void aarya(){
        System.out.println("id: "+2+"name: "+"aarya"+"age: "+24+"salary: "+5050000);
    }
    void nari(){
        System.out.println("id: "+3+"name: "+"nari"+"age: "+56+"salary: "+45000);
    }

    public static void main(String[] args) {
        employees emp = new employees(1,"sara",45000,56);
        emp.aarya();
        emp.vinod();
        emp.nari();
    }
}
*/
/*----------------------------------------------- 6 ----------------------------------
class add{
    int a;
    int b;


    add(int a, int b){
        this.a=a;
        this.b=b;
       int c =  a + b;
    }
    void add(){
        System.out.println("No1 :"+a+" "+"No2: "+b);
        int c =  a + b;
    }

    public static void main(String[] args) {
        add u = new add(12,12);
        u.add();
    }
}
*/
/*---------------------------------------------------- 5 ----------------------------------------
class indian{
    int a ;
    int b;
    String c ;

    public indian(int a, int b, String c){
        this.c=c;
        this.b=b;
        this.a=a;
    }
    void disp(){
        System.out.println("Integer Fisrt: "+a+" "+"Integer second: " +b+" "+"String Third: "+c);
    }

    public static void main(String[] args) {
        indian i = new indian(12,56,"carry");
        i.disp();
    }
}
*/

/* ---------------------------------------- 4 --------------------------------
class indian{
    int age;
    int weight;

    indian(int age,int weight){
        this.age=age;
        this.weight=weight;
    }
    void print(){
        System.out.println("First:"+age+" "+"Second:"+weight);
    }

    public static void main(String[] args) {
        indian in = new indian(12,24);
        in.print();
    }
}
*/
/* ------------------------------------------ 3 ------------------------------------------
class indian{
    int a;
    double b;

    indian(int a, double b)
    {
        this.a=a;
        this.b=b;
    }
    void disp(){
        System.out.println("int 1:"+a+" "+"int 2:"+b);
    }

    public static void main(String[] args) {
        indian ind = new indian(12,6.3);
        ind.disp();
    }
}
*/

/* -------------------------------------------- 2 ----------------------------------------
class indians{
    String a;
    int b ;
    float f;

    indians(int b, String a, float f)
    {
        this.a=a;
        this.b=b;
        this.f=f;
    }
    void show()
    {
        System.out.println("First int"+b+"Second String: "+a+"Third float: "+f);
    }

    public static void main(String[] args) {
        indians ind = new indians(14,"a2",4.3f);
        ind.show();
    }
}
*/

/* -------------------------------------------------- 1 -----------------------------------------
public class indian {
    int i;
    int j;
    String k;
    float l;

    indian(int i,int j,String k, float l){
        this.i=i;
        this.j=j;
        this.k=k;
        this.l=l;
    }

    void show(){
        System.out.println("first int: "+i+"second int: "+j+"Third String: "+k+"Fourth float: "+l);

    }
    public static void main(String[] args) {
        indian ind = new indian(12,56,"Aarya",63.1f);
        ind.show();
    }
}
*/

/* --------------------------------------------- Example --------------------------------

public class indian {
    int SrNo;
    String name;
    int age;
    String District;
    String city;
    long adharNo;

   indian(int SrNo, String name, int age, String District, String city, long adharNo)
    {
        this.SrNo = SrNo;
        this.name = name;
        this.age = age;
        this.District = District;
        this.city= city;
        this.adharNo=adharNo;
    }

    public static void main(String[] args) {
       indian aarya = new indian(1, " Aarya",22," Ahmednagar"," ahmednagar", 850674472);
        System.out.println("Sr no: "+aarya.SrNo +"Name: "+aarya.name+"age is: "+aarya.age+"disctrict :"+aarya.District+
                             "CITY:"+aarya.city+"adhar no:"+aarya.adharNo);


        indian xyz = new indian( 2," xyz", 25," nagar"," nagar", 850676672);
        System.out.println("Sr no: "+xyz.SrNo +"Name: "+xyz.name+"age is: "+xyz.age+"disctrict :"+xyz.District+
                "CITY:"+xyz.city+"adhar no:"+xyz.adharNo);
    }
}
*/