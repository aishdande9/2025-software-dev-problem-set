public class Validpalindrome {
    public static void main(String[] args) {
       String s = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(s));
    }
    public static boolean isPalindrome(String s) {
        String word = s.toLowerCase().replaceAll("[\\s,:]","");
        System.out.println(word);
String str = s.toLowerCase().replaceAll("[\\s,:]","");
String rev = "";

for(int i=0;i<str.length();i++){
    rev = str.charAt(i)+rev;


}
        System.out.println(rev);

if(word.equals(rev)){
    return true;

}
return false;
    }
}
