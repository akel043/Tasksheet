import java.util.*;
public class Tasksheet119{
    
        int sum(int a, int b) {
			
			return a+b;
		}
		
		
		int difference(int a, int b) {
			
			return a-b;
		}
		
		int product(int a, int b) {
			
			return a*b;
		}
		
		
		double quotient(double a, double b) {
			if(b==0)
				{System.out.println("\n\"Zero is invalid input for division\"");}
			 return a/b;
		}
	

		 public static  void main(String[] args) {
			Tasksheet119 Grade = new Tasksheet119();
						 
				Scanner scanner = new Scanner(System.in);		 
			
			System.out.println("Input your first num:");
			int a = scanner.nextInt();
			
			System.out.println("Input your first Second num:");
			int b = scanner.nextInt();
			
			System.out.println("Result for Addition: "+Grade.sum(a, b));
			System.out.println("Result for Subtraction: "+Grade.difference(a, b));
			System.out.println("Result for Multiplication :"+Grade.product(a, b));
			System.out.println("Result for Division: "+Grade.quotient(a, b));
			
		 } 
    }
