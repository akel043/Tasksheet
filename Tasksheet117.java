import java.util.*;

public class Tasksheet117 {
    public static void main(String[] args) {
      
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter the first number: ");
        int num1 = Integer.parseInt(scanner.nextLine()); // experiment lang po this //#10 ahaha

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();


        System.out.print("Enter the third number: ");
        int num3 = scanner.nextInt();


        // Check if all numbers are equal
        if (num1 == num2 && num2 == num3) {
            System.out.println("All numbers are equal.");
        } else {
           
            int largest = num1;

            if (num2 > largest) {
                largest = num2;
            }
            if (num3 > largest) {
                largest = num3;
            }

           
            System.out.println("The largest number is: " + largest);
        }

   
        scanner.close();
    }
}
