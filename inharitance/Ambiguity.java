package inharitance;

public interface Ambiguity {
    public void add();
}
interface parent2{
    public void add();
}
class child implements Ambiguity,parent2{

    @Override
    public void add() {
        System.out.println("which class method it is");
    }

    public static void main(String[] args) {
        child c = new child();
        c.add();
    }
}