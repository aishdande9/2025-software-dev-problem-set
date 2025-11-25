import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";
        System.out.println(isAnagram(s,t));
    }




    public static boolean isAnagram(String s, String t) {
char[] c = s.toCharArray();
char[] ch = t.toCharArray();

        Arrays.sort(c);
        Arrays.sort(ch);
if(Arrays.equals(c,ch)){
    return true;
}

return false;
    }
}
