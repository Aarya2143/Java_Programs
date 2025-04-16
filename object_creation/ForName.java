package object_creation;

public class ForName {

        void show() {
            System.out.println("Object creation using 'Class.ForName' keyword");
        }

        public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException
        {
            ForName s = (ForName)
                    Class.forName("object_creation.ForName").newInstance();
            s.show();
        }
    }

