package encapsulation;

public class AchieveSecurity {
    private String userid ;
    private long password;

    public String getId(){
        return userid;
    }

    public void setId(String userid) {
        this.userid =userid;
    }

    public long getPassword() {
        return password;
    }

    public void setPassword(long password){
        this.password=password;
    }
}

class Another
{
    public static void main(String[] args) {

       AchieveSecurity aarya = new AchieveSecurity();
        aarya.setId("jadhavaarya19@gmail.com ");
        aarya.setPassword(212003);

       System.out.println("User Id: "+aarya.getId()+" "+"Password: "+aarya.getPassword());

       AchieveSecurity pratik = new AchieveSecurity();
        pratik.setId("pratikk21@gmail.com ");
        pratik.setPassword(5845248);

        System.out.println("User Id: "+pratik.getId()+" "+"Password: "+pratik.getPassword());
    }
}