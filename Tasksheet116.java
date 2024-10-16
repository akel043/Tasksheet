import java.util.*;

public class Tasksheet116 {
    public static void main(String[] args) {
     
        Scanner scanner = new Scanner(System.in);

      
        System.out.print("Enter you Input: ");
        String input = scanner.nextLine();

      
        StringBuilder reversedWord = new StringBuilder(input);

 
        reversedWord.reverse();

        if (input.equals(reversedWord.toString())) {
            System.out.println("The input string is a palindrome.");
        } else {
            System.out.println("The input string is not a palindrome.");
        }

       
        scanner.close();
    }
}
