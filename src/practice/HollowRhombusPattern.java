package practice;

	
	
	
	import java.util.Scanner;

	public class HollowRhombusPattern {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter the number of rows: ");
	        int numRows = scanner.nextInt();
	        scanner.close();

	        for (int i = 1; i <= numRows; i++) {
	            for (int j = 1; j <= numRows - i; j++) {
	                System.out.print(" ");
	            }

	            if (i == 1 || i == numRows) {
	                for (int j = 1; j <= numRows; j++) {
	                    System.out.print("*");
	                }
	            } else {
	                System.out.print("*");
	                for (int j = 1; j <= numRows - 2; j++) {
	                    System.out.print(" ");
	                }
	                System.out.print("*");
	            }

	            System.out.println();
	        }
	    }
	}



