package task;

public class overriding1 {
    void show() {
        System.out.println("parent method");

    }
}
    class c extends overriding1 {
        public static void main(String[] args) {
            c cc = new c();
            cc.show();
        }

        void show() {
            //child cc = new child();
            //cc.show();
            System.out.println("child method");

      }
}


