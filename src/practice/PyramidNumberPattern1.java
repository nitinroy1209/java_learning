package practice;
import java.util.Scanner;

public class PyramidNumberPattern1 

{

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        int numRows = scanner.nextInt();
	        scanner.close();

	        for (int i = 0; i <= numRows; i++) {
	            // Print spaces
	            for (int j = 1; j <= numRows - i; j++) {
	                System.out.print(" ");
	            }

	            // Print descending numbers
	            for (int j = i; j >= 1; j--) {
	                System.out.print(j);
	            }

	            // Print ascending numbers
	            for (int j = 1; j <= i-1; j++) {
	                System.out.print(j);
	            }

	            System.out.println();
	        }
	    }
	}
