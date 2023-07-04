package practice;
import java.util.Scanner;


public class HalfPyramidPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();

        generateHalfPyramid(rows);
    }

    public static void generateHalfPyramid(int rows) {
        int num = 1;
        for (int i = 1; i <= rows; i++) {
            StringBuilder pattern = new StringBuilder();
            int currNum = i % 2 == 0 ? 2 : 1;
            for (int j = 1; j <= i; j++) {
                pattern.append(currNum);
                currNum += 2;
                if (currNum > 9) {
                    currNum = 1;
                }
            }
            System.out.println(pattern);
        }
    }
}
