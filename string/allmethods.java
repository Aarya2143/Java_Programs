package string;

public class allmethods {
    public static void main(String[] args) {

    }
}

// ----------------------------------------- int length() ----------------------------------------
/*
public class metodsOfString {


    public static void main(String[] args) {
        String s = "Java Programming lang";
        System.out.println("string length is " + s.length());        //21
    }
}
*/

// ---------------------------------------- Char char At (int i) -----------------------------------
/*
public class charat {
    public static void main(String[] args) {
        String s = "Java Programming Language";
        System.out.println("charachter at position: " + s.charAt(3));   // a
    }
}
*/

// ------------------------------------------ string substring ----------------------------------------
/*
class strsubstr{
    public static void main(String[] args) {
        String s = " java programming ";
        System.out.println("substring is:"+s.substring(2));   //ava Programming
    }
}
*/

// -------------------------------------- string substring(int i, int j) -----------------------------
/*
class substr{
    public static void main(String[] args) {
        String s = "java programming";
        System.out.println("String Substring is: "+s.substring(2,6)); // va p (start index: with 0/ end index: with 1 count)
    }
}
*/

// ------------------------------------  String concat( String str) ------------------------------------
/*
class concat{
    public static void main(String[] args) {
        String s = "Java";
        System.out.println("The full string is: "+s.concat(" Programming"));  // Java Programming
    }
}
*/

//------------------------------------  int indexOf (String s) ----------------------------------------

/*
class firstindex {
    public static void main(String[] args) {
        String s = "java programming";
        System.out.println("INDEX of programming: " + s.lastIndexOf("a"));
    }
}
*/

//------------------------------------ int indexOf (String s, int i) ---------------------------------------
/* (use to find middel char index)
class midindex{
    public static void main(String[] args) {
        String s = "java program";
        System.out.println("index of: "+ s.indexOf("a",2));    //3
    }
}
*/

//----------------------------------- Int lastIndexOf( String s) ---------------------------------------------
/*
class lastindex{
    public static void main(String[] args) {
        String s = "Java Programming";
        System.out.println("last index is: "+ s.lastIndexOf("m"));   //12
    }
}
*/

//----------------------------------- boolean equals( Object otherObj) ---------------------------------------
//  Checking equality of Strings
/*
class booleanequ{
    public static void main(String[] args) {
       boolean s1 = "Geeks".equals("geekS");
        System.out.println("check equality: "+s1);
        s1 = "Geeks".equals("Geeks");
        System.out.println("check eqality: "+s1);
    }
}
*/

// ------------------------------------ equals ignore case -----------------------------------------
/*
class booleqlignore{
    public static void main(String[] args) {
        boolean s1 = "java".equalsIgnoreCase("programming");    //False
        System.out.println("string is eql to java: "+s1);
    }
}
*/
/*
class boolignoreeql{
    public static void main(String[] args) {
        boolean s1 = "JAVA".equalsIgnoreCase("java");
        System.out.println("the JAVA is equal to java: "+s1 );      //True
    }
}
*/

// --------------------------------------- DIFF between ASCII Value --------------------------------------
/*
class compareto{
    public static void main(String[] args) {
        String s1 = "java";
        String s2 = "java";
        int out1 = s1.compareTo(s2);
        System.out.println("the difference between ASCII value is= " + out1);    //0
    }
}
*/
/*
class compareto{
    public static void main(String[] args) {
        String s1 = "java";
        String s2 = "prog";
        int out1 = s1.compareTo(s2);
        System.out.println("the difference between ASCII value is= " + out1);    //-6
    }
}
*/

//--------------------------------------------- Lower case ----------------------------------------------
/*
class lowecase{
    public static void main(String[] args) {
        String s = "JAVA PROGRAM";
        System.out.println(s.toLowerCase());          //java program
    }
}
*/

//--------------------------------------------- Upper case -------------------------------------------------

/*
class uppercase{
    public static void main(String[] args) {
        String s = "java array";
        System.out.println(s.toUpperCase());            // JAVA ARRAY
    }
}
*/

//-------------------------------------------- Trim the word ----------------------------------------------

/*
class trim{
    public static void main(String[] args) {
        String s = " Java Program ";
        System.out.println("trim ords: "+s.trim()+" , " +"length of: " + s.length());   //14
        String k = s.trim();
        System.out.println("length of trim: "+k.length());                              //12
    }
}
*/

//----------------------------------------------- Replace String --------------------------------

/*
class replace{
    public static void main(String[] args) {
        String s = "PAVA PROGRAMMING";
        System.out.println("REPLACED STRING: "+ s.replace("P","J"));  // JAVA PROGRAMMING
    }
}
*/
//-------------------------------------------- Split method ------------------------------
/*
class WordCount{
    public static void main(String[] args) {
        String s = "java is a programming language";
        String [] s2 = s.split(" ");                         // split the space
        System.out.println(s2.length);
    }
}
*/




