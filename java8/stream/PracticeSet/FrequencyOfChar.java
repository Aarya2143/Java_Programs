package java8.stream.PracticeSet;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FrequencyOfChar {
    public static void main(String[] args) {
        String s = "pragramming";

        Map<Character, Integer> freq = new HashMap<>();
        for(char ch : s.toCharArray()){
            if(freq.containsKey(ch)){
                freq.put(ch, freq.get(ch) + 1);
            }else {
                freq.put(ch,1);
            }
        }
for (Map.Entry<Character, Integer> entry : freq.entrySet()){
    System.out.println(entry.getKey()+ " : "+entry.getValue());
}

/*Map<Character, Long> cha = s.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(
                        Function.identity(),
                        Collectors.counting()
                ));

        cha.forEach((ch, count) -> System.out.println("Charcter: "+ch +
                "  Count : "+ count));*/

     /*   String str = "programming";
        str.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(c->c,Collectors.counting()))
                .entrySet().stream()
                .sorted((e1,e2) -> e2.getKey().compareTo(e1.getKey()))
                .forEach(e -> System.out.println(e.getKey()+ " : "+e.getValue()));*/
    }
}
