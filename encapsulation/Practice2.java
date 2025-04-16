package encapsulation;

public class Practice2 {
    private String Email;
    private String pass;

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }
}
class Demo
{
    public static void main(String[] args) {
      Practice2 user1 = new Practice2();
      user1.setEmail("jaarya19@gamil");
      user1.setPass("AaryA21");
        System.out.println("first user: "+user1.getEmail()+ " "+"PASS USER1: "+ user1.getPass());

      Practice2 user2 = new Practice2();
      user2.setEmail("ankita@77");
      user2.setPass("gsy585");
        System.out.println("Second user: "+user2.getEmail()+" "+"PASS USER2: "+user2.getPass());
    }
}
