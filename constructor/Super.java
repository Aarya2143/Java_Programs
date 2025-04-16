package constructor;
/*
// a - d
class Test1{
    Test1(){
        System.out.println("A");
    }
    Test1(int a){
        System.out.println("B");
    }
}
class  Test2 extends Test1{
    Test2(){
        super(45);
        System.out.println("C");
    }
    Test2(int b){
        System.out.println("D");
    }

    public static void main(String[] args) {
        Test2 obj = new Test2(2);
    }
}
*/

// ---------------------------------- def - para - def -----------------------------------
/*
class ConstrctorChaning
{
    ConstrctorChaning(){
        System.out.println("default constructor 1");
    }

    ConstrctorChaning (int k, byte b){
        System.out.println("Parameterized constructor");
    }
}
class UsingSuper extends ConstrctorChaning
{
    UsingSuper(){
        System.out.println("default constructor 2");
    }

    UsingSuper(int a, int c){
        System.out.println("parameterized constructor 2");
    }
}
class Uix extends UsingSuper
{
    Uix()
    {
        super(12,25);
        System.out.println("default constructor 3");
    }
    Uix(String s, int t)
    {
        System.out.println("parameterized constructor 3");
    }

    public static void main(String[] args) {
        Uix obj = new Uix();
    }
}
*/
//----------------------------------- para - def - para ------------------------------------
/*
class abc
{
    abc(){
        System.out.println("default constructor 1");
    }

    abc(int k, byte b){
        System.out.println("Parameterized constructor");
    }
}
class xyz extends abc
{
    xyz(){
        System.out.println("default constructor 2");
    }

    xyz(int a, int c)
    {
        System.out.println("parameterized constructor 2");
    }
}
class Uix extends xyz
{
    Uix()
    {
        super(2,4);
        System.out.println("default constructor 3");
    }
    Uix(String s, int t)
    {
        System.out.println("parameterized constructor 3");
    }

    public static void main(String[] args) {
        Uix obj = new Uix();
    }
}
*/
/* ---------------------------------------- 2 DEFAULT AND 1 PARAMETERIZED ---------------------------------
class abc
{
    abc(){
        System.out.println("default constructor 1");
    }

    abc(int k, byte b){
        System.out.println("Parameterized constructor");
    }
}
class xyz extends abc
{
    xyz(){
        System.out.println("default constructor 2");
    }

    xyz(int a, int c){
        System.out.println("parameterized constructor 2");
    }
}
class Uix extends xyz
{
    Uix()
    {
        System.out.println("default constructor 3");
    }
    Uix(String s, int t)
    {
        System.out.println("parameterized constructor 3");
    }

    public static void main(String[] args) {
        Uix obj = new Uix("AAR",12);
    }
}
*/
//----------------------------------------- ALL PARAMETERIZED -----------------------------
/*
class abc
{
    abc(){
        System.out.println("default constructor 1");
    }

    abc(int k, byte b){
        System.out.println("Parameterized constructor 1");
    }
}
class xyz extends abc
{
    xyz(){
        System.out.println("default constructor 2");
    }

    xyz(int a, char c){
        super(25,(byte) 129);
        System.out.println("parameterized constructor 2");
    }
}
class Uix extends xyz
{
    Uix()
    {
        System.out.println("default constructor 3");
    }
    Uix(String s, int t)
    {
        super(12,'a');
        System.out.println("parameterized constructor 3");
    }

    public static void main(String[] args) {
        Uix obj = new Uix("name",22);
    }
}
*/
// --------------------------------------------- ALL Default Constructor calling -------------------------------
/*
class abc
{
    abc(){
        System.out.println("default constructor 1");
    }

    abc(int k, byte b){
        System.out.println("Parameterized constructor");
    }
}
class xyz extends abc
{
    xyz(){
        System.out.println("default constructor 2");
    }

    xyz(int a, int c){
        System.out.println("parameterized constructor 2");
    }
}
class Uix extends xyz
{
    Uix()
    {
        System.out.println("default constructor 3");
    }
    Uix(String s, int t)
    {
        System.out.println("parameterized constructor 3");
    }

    public static void main(String[] args) {
        Uix obj = new Uix();
    }
}
*/
//---------------------------------------- 2 ----------------------------------
/*
class ABC{
    ABC(){
        System.out.println("default constructor 1");
    }

    ABC (int a, byte b){
        System.out.println("parameterized constructor1");
    }

}

class superconst extends ABC{

    superconst(int a, int b){
        super(12, (byte) 26);
        System.out.println("parametrized constructor2");
    }

    superconst(){
        System.out.println("default constructor 2");
    }

    public static void main(String[] args) {
        superconst obj =new superconst(12,26);
    }
}
*/

/* --------------------------------- 1 --------------------------------------
public class Super {

    Super(int a, int b){
        System.out.println(a+b);
    }
}

class add extends Super{

    add(int a,int b,int c){
        super(2,4);
        System.out.println(a+b+c);
    }
}

class div extends add
{
    div(int a){
        super(12,12,2);
        System.out.println(a+a);
    }

    public static void main(String[] args) {
        div obj = new div(12);
    }
}
*/
