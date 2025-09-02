import java.util.Arrays;
import java.util.Scanner;

public class ValidSudoku {
    public static void main(String[] args) {

            Scanner scan = new Scanner(System.in);
        System.out.println("Enter word?");
            String s = scan.nextLine();

            String[] word = s.split("\\s'");
        for (String words : word) {
            System.out.println(words);
        }
            // Write your code here.
            scan.close();
        }
    }


