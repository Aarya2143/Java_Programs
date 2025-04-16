package task;

import java.util.HashMap;

class AccessModifiers {
    class abc {
        void add(){
            System.out.println("add");
        }
        public void main(String[] args) {
            System.out.println("hwlo");
            abc o = new abc();
            o.add();
        }
    }
    public void main(String[] args) {
        System.out.println("hi");
        abc o = new abc();
        o.add();

    }
    HashMap obj = new HashMap();
}
