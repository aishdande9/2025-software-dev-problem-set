import java.util.Arrays;

public class CountVowels {
    public static void main(String[] args) {
        int count = 0;
        String vowels = "aeiou";
        String value = "Aishwarya";
        for(char c:value.toLowerCase().toCharArray()){
            if(vowels.contains(String.valueOf(c))){
               count++;
            }
        }
        System.out.println(count);
    }
}
