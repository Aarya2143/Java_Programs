package anonymous;

interface Using_Anonymous {
    void pro();
    void con();
}

public class Annonymous implements Using_Anonymous
{

    @Override
    public void pro() {
        System.out.println("Provide implementation of interface method");
    }

    @Override
    public void con() {

    }

    public static void main(String[] args) {
        Annonymous obj = new Annonymous();
        obj.pro();
    }
}

class TestSample
{
    Using_Anonymous obj = new Using_Anonymous() {
        @Override
        public void pro() {
            System.out.println("Interfaces extend method");
        }

        @Override
        public void con() {
            System.out.println("Interface extend method");
        }
    };
}
