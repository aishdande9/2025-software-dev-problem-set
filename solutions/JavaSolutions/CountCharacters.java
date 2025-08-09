import java.util.HashMap;
import java.util.Map;

public class CountCharacters {
    public static void main(String[] args) {
        String name = "My Name Is my Is Aishwarya";
        Map<String,Integer> freq = new HashMap<>();
        String[] wordCount = name.toLowerCase().split(" ");
        System.out.println(wordCount.length);

        for(String c:wordCount){
            if(freq.containsKey(c)){
                freq.put(c, freq.get(c)+1);

                }else{
                freq.put(c,1);
            }
        }
        System.out.println(freq);
    }
}
