import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupA {
    public static void main(String[] args) {
       String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        System.out.println(groupAnagrams(strs));
    }
        public static List<List<String>> groupAnagrams(String[] strs) {
            HashMap<String,List<String>> freq = new HashMap<>();
            for(String s:strs){
                char[] c = s.toCharArray();
                Arrays.sort(c);
                String sorted = new String(c);
                if(!freq.containsKey(sorted)){
                    freq.put(sorted,new ArrayList<>());
                }
                freq.get(sorted).add(s);
            }

           return new ArrayList<>(freq.values());
        }
    }

