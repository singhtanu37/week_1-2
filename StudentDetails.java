import java.util.Scanner;

class StudentDetails {
    public static void main(String[] args) {
	
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter student name: ");
            String name = input.nextLine();

            System.out.print("Enter roll number: ");
            int rollNo = input.nextInt();

            System.out.print("Enter percentage: ");
            double percentage = input.nextDouble();

            System.out.println("Name: " + name);
            System.out.println("Roll No: " + rollNo);
            System.out.println("Percentage: " + percentage);
        }
    }
}
