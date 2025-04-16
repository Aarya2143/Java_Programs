package anonymous;

interface AnonymousImplementInterface {
    public static void main(String[] args) {
        Runnable rn = new Runnable() {
            @Override
            public void run() {
                System.out.println("Anonymous implements an interface");
            }
        };
        Thread t = new Thread(rn);
        t.start();
    }
}
