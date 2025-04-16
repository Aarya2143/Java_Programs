package task;

public class MethodStringPractice {
    public static void main(String[] args) {
        String s1 ="";
        String s2 = "Java programming lang";
        String s5 = "Javaa";
        String s3 = " java ";
        System.out.println(s1.isEmpty());
        System.out.println(s2.length());
        System.out.println(s2.replace("J","j"));
        System.out.println(s2.toUpperCase());
        String s4 = s2.toUpperCase();
        System.out.println(s2.toLowerCase());
        System.out.println(s2.charAt(5));
        System.out.println(s3.trim());
        System.out.println(s2.substring(6));
        System.out.println(s2.substring(3,10));
        System.out.println(s2.contains("Java"));
        System.out.println(s2.compareTo(s5));
        System.out.println(s2.compareToIgnoreCase(s5));
        System.out.println(s2.equals(s5));
        System.out.println(s2.equalsIgnoreCase(s4));
        System.out.println(s2.startsWith("Java")); // true
        System.out.println(s2.endsWith("program"));
        System.out.println(s2.indexOf("i"));
        System.out.println(s2.lastIndexOf("m"));
        String [] s10 = s2.split(" ");
        System.out.println(s10.length);
    }
}
