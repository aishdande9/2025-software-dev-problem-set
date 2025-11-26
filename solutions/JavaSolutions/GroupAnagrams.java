import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupAnagrams {
    public static void main(String[] args) {
String[] strs = {"eat","tea","tan","ate","nat","bat"};


//Output: [["bat"],["nat","tan"],["ate","eat","tea"]]
        System.out.println(groupAnagrams(strs));
    }public static List<List<String>> groupAnagrams(String[] strs) {

        HashMap<String,List<String>> freq = new HashMap<>();

        for(String s:strs){

            char[] c = s.toCharArray();
            Arrays.sort(c);
            String sortedS = new String(c);
            if(!freq.containsKey(sortedS)){
                freq.put(sortedS,new ArrayList<>());
            }

            freq.get(sortedS).add(s);
        }

        return new ArrayList<>(freq.values());

    }

}

