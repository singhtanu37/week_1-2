import java.util.Scanner;

class ArithmeticOperations {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter first number: ");
            int num1 = input.nextInt();

            System.out.print("Enter second number: ");
            int num2 = input.nextInt();

            int sum = num1 + num2;
            int diff = num1 - num2;
            int product = num1 * num2;
            double division = (double) num1 / num2;

            System.out.println("Sum = " + sum);
            System.out.println("Difference = " + diff);
            System.out.println("Product = " + product);
            System.out.println("Division = " + division);
        }
    }
}