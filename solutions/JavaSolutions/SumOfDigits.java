public class SumOfDigits {
    public static void main(String[] args) {
        int num = 1234;
        int sum = 0;
 int temp = num;
 while(temp != 0){
     int lastDigit = temp%10;
     sum += lastDigit;
  temp = temp/10;
 }

        System.out.println(sum);
    }




}
