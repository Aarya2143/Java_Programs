package encapsulation;

public class GetterSetter
{
    private  int srno;
    private String name;
    private float weight;
    private boolean condition;

    public int getSrno() {
        return srno;
    }

    public void setSrno(int srno) {
        this.srno = srno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public boolean isCondition() {
        return condition;
    }

    public void setCondition(boolean condition) {
        this.condition = condition;
    }
}
class UAE{
    public static void main(String[] args) {
        GetterSetter devid = new GetterSetter();
        devid.setSrno(1);
        devid.setName("devid zah");
        devid.setWeight(56.3f);
        devid.setCondition(true);

        GetterSetter charli = new GetterSetter();
        charli.setSrno(2);
        charli.setName("charli chow");
        charli.setWeight(50.2f);
        charli.setCondition(false);

        System.out.println("devid's data");
        System.out.println("sr no of devid: "+devid.getSrno()+" "+"weight of devid: " +devid.getWeight()+" "
                           +"Name of devid: "+devid.getName()+" "+"condition of devid: "+devid.isCondition());

        System.out.println("charli's data");
        System.out.println("sr no of charli: "+charli.getSrno()+" "+"weight of charli: " +charli.getWeight()+" "
                +"Name of charli: "+charli.getName()+" "+"condition of charli: "+charli.isCondition());
    }
}
