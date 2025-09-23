import java.util.Stack;

public class ReverseWords {
    public static void main(String[] args) {
        String word = "this is beautiful";
        System.out.println(wordReverse(word));
    }

    public static String wordReverse(String word) {
        String rev = "";
        String[] str = word.split(" ");
        for(int i=0;i<str.length;i++){
            //System.out.println(str[i]);
            rev = str[i]+"\s"+rev;
        }
        return rev;
    }
}