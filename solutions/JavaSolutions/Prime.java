import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.println("enter the num");
        int num = scr.nextInt();

        if(num == 0){
            System.out.println("not a valid number");
        }
        int count = 0;
     for(int i = 1; i<=num;i++){
         if(num%i==0){
             count ++;
         }
     }

     if(count == 2){
         System.out.println("number is prime");
     }else{
         System.out.println("number is not prime");
     }


    }
}
