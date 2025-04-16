package blocks_practice;

public class ChildParentExecution
{
    static
    {
        System.out.println("Static Block 1");
    }

    {
        System.out.println("Instance Block 1");
    }

    ChildParentExecution(){
        System.out.println("Constructor 1");
    }
}

class Child extends  ChildParentExecution
{

    static
    {
        System.out.println("Static Block 2");
    }

    {
        System.out.println("Instance Block 2");
    }

    Child()
    {
        System.out.println("Constructor 2");
    }


    public static void main(String[] args) {
        Child c = new Child();
    }
}

/*
OutPut:
Static Block 1
Static Block 2
Instance Block 1
Constructor 1
Instance Block 2
Constructor 2
*/