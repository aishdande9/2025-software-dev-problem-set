import java.util.Scanner;

public class Lexographic {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter A");
        String A=sc.next();
        System.out.println("Enter B");
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        String c = A+B;
        System.out.println(c.length());
        if (A.compareTo(B) > 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        System.out.println(A.substring(0,1).toUpperCase()+A.substring(1).toLowerCase()+" "+B.substring(0,1).toUpperCase()+B.substring(1).toLowerCase());

    }
}

