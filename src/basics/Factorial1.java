package basics;

public class Factorial1 {
	public static int factorial(int n) {
		if (n == 0)
			return 1;
		else
			return n * factorial(n - 1);
	}

	public static void main(String[] args) {
		int number = 5; // Replace with the desired number
		int result = factorial(number);
		System.out.println("Factorial of " + number + " is: " + result);
	}

}
