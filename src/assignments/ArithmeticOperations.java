package assignments;

public class ArithmeticOperations 
{



	public int addition(int num1, int num2) {
		int sum = num1 + num2;
		System.out.println("Sum: " + sum);
		return sum;
	}

	public int subtraction(int num1, int num2) {
		int difference = num1 - num2;
		System.out.println("Difference: " + difference);
		return difference;
	}

	public  int division(int num1, int num2) {
		int quotient = num1 / num2;
		System.out.println("Quotient: " + quotient);
		return quotient;
	}

	public int multiplication(int num1, int num2) {
		int product = num1 * num2;
		System.out.println("Product: " + product);
		return product;
	}

	public int modulus(int num1, int num2) {
		int remainder = num1 % num2;
		System.out.println("Remainder: " + remainder);
		return remainder;
	}

	public static void main(String[] args)
	{
		ArithmeticOperations obj=new ArithmeticOperations ();
		int result=obj.addition(5,9);
		int result1=obj.subtraction(10,6);
	}
}







