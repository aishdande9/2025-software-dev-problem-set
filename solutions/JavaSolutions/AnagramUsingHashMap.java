import java.util.Arrays;
import java.util.HashMap;

public class AnagramUsingHashMap {
    public static void main(String[] args) {
        String a = "listen";
        String b = "silent";
        System.out.println(a + " and " + b + " are anagrams? " + isAnagram(a, b));
    }
    public static boolean isAnagram(String s, String t) {
        HashMap<Character,Integer> freq = new HashMap<>();

        if(s.length() != t.length()){
            return false;
        }
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(freq.containsKey(c)){
                freq.put(c,freq.get(c)+1);
            }else{
                freq.put(c,1);
            }
        }

        for(int i=0;i<t.length();i++){
char c = t.charAt(i);
if(!freq.containsKey(c)){
    return false;
}
int newCount = freq.get(c);
if(newCount == 0){
    return false;
}
freq.put(c,newCount-1);

        }
        for(int count: freq.values()){
            if(count !=0){
                return false;
            }
        }
        return true;
    }


}