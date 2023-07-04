package practice;

import java.util.Scanner;

public class AlphabetPyramidPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numRows = scanner.nextInt();
        scanner.close();

        int currentCharValue = 65; // ASCII value of 'A'

        for (int i = 1; i <= numRows; i++) {
            for (int j = 1; j <= numRows - i; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= 2 * i - 1; j++) {
                char currentChar = (char) currentCharValue;
                System.out.print(currentChar);
            }

            System.out.println();
            currentCharValue++;
        }
    }
}
