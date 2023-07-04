package practice;
import java.util.Scanner;

public class Pattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();

        char[][] positions = Pattern(n);

        // Print the matrix
        for (char[] row : positions) {
            for (char position : row) {
                System.out.print(position + " ");
            }
            System.out.println();
        }
    }

    public static char[][] Pattern(int n) {
        char[][] matrix = new char[n][n];

        // Initialize the matrix with 'C' for children
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = 'C';
            }
        }

        // Determine positions based on pattern
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j || i + j == n - 1) {  // Diagonals
                    matrix[i][j] = 'M';  // Male position
                } else if (i == 0 || j == 0 || i == n - 1 || j == n - 1) {  // Borders
                    matrix[i][j] = 'F';  // Female position
                }
            }
        }

        return matrix;
    }
}
