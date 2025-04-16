package array;

public class SwappingTwoEle {
    public static void main(String[] args) {
        int[] arr = {50,62};

        int temp = 0;
        if(arr[0]<arr[1])
        {
            System.out.println("swap");
            temp = arr[0];
            arr[0] = arr[1];
            arr[1] = temp;
        }
        else {
            System.out.println("dont swap");
        }

        for (int i=0; i<arr.length; i++){
            System.out.println("index: "+i+"  Element: "+arr[i]);
        }
    }
}
