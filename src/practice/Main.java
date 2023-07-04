package practice;



import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input
        System.out.println("Input Description:");
        System.out.println("To take an integer value");

        System.out.println("\nEnter the integer value:");
        int number = scanner.nextInt();

        // Output
        System.out.println("\nOutput Description:");
        System.out.println("Print the integer value");

        System.out.println("\nSample Output:");
        System.out.println(number);

        scanner.close();
    }
}

