import java.util.HashMap;

public class FirstNonRepeatingCharacter {
    public static void main(String[] args) {
        String str = "aaabcccd";

        HashMap<String,Integer> freq = new HashMap<>();
     for(int i=0;i<str.length();i++){
         String c = String.valueOf(str.charAt(i));
         if(freq.containsKey(c)){
             freq.put(c, freq.get(c)+1);
         }else{
             freq.put(c,1);
         }

        }
        System.out.println(freq);
   char res = '\0';
     for(int i=0;i<str.length();i++){
         String c = String.valueOf(str.charAt(i));
         if(freq.get(c)==1){
             res = str.charAt(i);
             break;


         }
     }


         System.out.println("first non repeating character"+"------> "+res);



    }
}
