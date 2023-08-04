package practice;
import java.util.Scanner;





public class PyramidNumberPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numRows = scanner.nextInt();
        //scanner.close();

        int currentValue = numRows * 2 - 1;

        for (int i = 1; i <= numRows; i++) {
            for (int j = 1; j <= i - 1; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= currentValue; j++) {
                System.out.print(currentValue);
            }

            System.out.println();
            currentValue -= 2;
        }
    }
}
