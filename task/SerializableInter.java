package task;

import java.io.Serializable;

public class SerializableInter implements Serializable {
    int a = 12;
    int b= 22;
}
class Child extends SerializableInter {
    int c = 5;
    int d = 12;
    int e = 66;

    public static void main(String[] args) {
      SerializableInter OBJ = new SerializableInter();

    }
}