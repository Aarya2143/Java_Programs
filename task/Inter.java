package task;

public interface Inter {
   static final int x =12;
   // int y ;

    void mian();
}
class de implements Inter
{

    int b;
    int c;
    @Override
    public void mian() {
        int k = b+c;
        System.out.println(k);
    }

    public static void main(String[] args) {
        de o = new de();
        o.mian();

    }
}
