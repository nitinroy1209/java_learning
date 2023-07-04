package practice;








import java.util.Scanner;

public class AlphabetPyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numRows = scanner.nextInt();
        scanner.close();

        int currentAlphabet = 65; // ASCII value of 'A'
        int spaceCount = numRows - 1;

        for (int i = 1; i <= numRows; i++) {
            for (int j = 1; j <= spaceCount; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print((char) currentAlphabet);
                currentAlphabet++;
            }

            System.out.println();
            currentAlphabet = 65; // Reset to 'A' for the next row
            spaceCount--;
        }
    }
}
