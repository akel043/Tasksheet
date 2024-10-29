package Tasksheet121;

 import static java.lang.Math.*;

    public class Task119 {

    public static int add(int a, int b) {
        return addExact(a, b);
    }

    public static int subtract(int a, int b) {
        return subtractExact(a, b);
    }

    public static int multiply(int a, int b) {
        return multiplyExact(a, b);
    }

    public static int divide(int a, int b) {
        return floorDiv(a, b);
    }

    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 5;

        int additionResult = add(num1, num2);
        int subtractionResult = subtract(num1, num2);
        int multiplicationResult = multiply(num1, num2);
        int divisionResult = divide(num1, num2);

        System.out.println("Addition result: " + additionResult);
        System.out.println("Subtraction result: " + subtractionResult);
        System.out.println("Multiplication result: " + multiplicationResult);
        System.out.println("Division result: " + divisionResult);
    }
}

