package string;

public class AddSpaceUsingTRIM_REPLACE {

        public static void main(String[] args) {
            String a = "Aarya sanjay jadhav";
            String b = a.trim();
            String c = b.replace(""," ").trim();

            System.out.println("ORIGINAL STRING:"+a);
            System.out.println("Replaced and Trim STRING:"+c);
        }
    }

