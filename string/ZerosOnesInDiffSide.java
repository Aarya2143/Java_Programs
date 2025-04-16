package string;

public class ZerosOnesInDiffSide {

    public static void main(String[] args) {
        String input = "101010";

        String right = movezeroright(input);
        System.out.println("Zeros to right: "+right);
    }

    public static String movezeroright(String s){
        StringBuilder nonzero = new StringBuilder();
        int zeros =0;
        for(char c: s.toCharArray()){
            if(c=='0'){
                zeros++;
            }else {
                nonzero.append(c);
            }
        }
        for(int i=0; i<zeros; i++){
            nonzero.append("0");
        }
        return nonzero.toString();
    }
}
