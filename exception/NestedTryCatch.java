package exception;

public class NestedTryCatch {
    public static void main(String[] args) {
        //String s1 = "aarya";
        //String s2 = "aar";
        try
        {
            String s1 = "Aarya";
            System.out.println(s1.length());

            try {
                String s2 = null;
                System.out.println(s2.toUpperCase());
            }
            catch (NullPointerException np)
            {
                System.out.println("Null pointer will occure here : "+np.getMessage());
            }
        }
        catch (IllegalArgumentException ill) {
            System.out.println("Illegal input : "+ill.getMessage());

        }

        System.out.println("Outside the nested try catch");
    }
}
