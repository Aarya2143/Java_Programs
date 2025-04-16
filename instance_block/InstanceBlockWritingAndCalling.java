package instance_block;

//RULES :
/*
// Need to create object for calling Instance Block
// Instance block execute top to bottom
// and then constructor executed
// if we use two constructor and 2 instance block  first execute instance block then constructor
*/

public class InstanceBlockWritingAndCalling {

    InstanceBlockWritingAndCalling(int a, int b){
        System.out.println("This is a constructor 1");
    }

    // Instace Block no need to writed return type/keyword/name
    {
        System.out.println("This Is A Instance Block 1");
    }

    InstanceBlockWritingAndCalling(){
        System.out.println("This is a constructor 2");
    }

    public static void main(String[] args) {
        InstanceBlockWritingAndCalling obj  = new InstanceBlockWritingAndCalling();
        InstanceBlockWritingAndCalling oj  = new InstanceBlockWritingAndCalling(23,8);

    }
}
