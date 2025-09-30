import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CountStrings {
    public static void main(String[] args) {
        String[] strs = {"bin","can","bin","bin","eat"};
        System.out.println(stringCount(strs));
    }
    public static List<String> stringCount(String[] strs){
        HashMap<String,Integer> freq = new HashMap<>();
        List<String> result = new ArrayList<>();
    for(String i:strs){
        if (freq.containsKey(i)) {

            freq.put(i,freq.get(i)+1);
        }else{
            freq.put(i,1);
        }
    }
       for(Map.Entry<String,Integer> map: freq.entrySet()){
           result.add(map.getKey()+"  "+map.getValue());
       }
        return result;
    }
}
