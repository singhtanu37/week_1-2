import java.util.Scanner;

class OperatorPrecedenceDemo {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter a number: ");
            int a = input.nextInt();

            int result1 = a + 10 * 2;
            int result2 = (a + 10) * 2;

            System.out.println("Result without brackets: " + result1);
            System.out.println("Result with brackets: " + result2);
        }
    }
}
