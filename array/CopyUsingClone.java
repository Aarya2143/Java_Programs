package array;

public class CopyUsingClone{
    public static void main(String[] args) {
        int [] oArray = {1,2,3,4,5};
        int [] nArray = oArray.clone();

        System.out.println("Element In oArray[]: ");
        for(int i =0; i < oArray.length; i++)
        {
            System.out.println(oArray[i]);
        }

        System.out.println("Element In nArray[]: ");
        for(int i=0; i < nArray.length; i++)
        {
            System.out.println(nArray[i]);
        }
    }
}
