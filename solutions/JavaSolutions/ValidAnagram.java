import java.util.Arrays;

public class ValidAnagram {
    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";
        System.out.println(isAnagram(s,t));
    }

     public static boolean isAnagram(String s,String t){
        char[] c = s.toCharArray();
        char[] v = t.toCharArray();

        Arrays.sort(c);
        Arrays.sort(v);

        if(Arrays.equals(c,v)){
            return true;
        }else {
            return false;
        }
    }
}
