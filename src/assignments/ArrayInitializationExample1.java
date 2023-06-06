package assignments;

public class ArrayInitializationExample1 
{
	public static void main(String[] args) {
		int[] numbers = new int[3]; // Allocate memory for an array of three integers

		numbers[0] = 10; // Initialize the first element
		numbers[1] = 20; // Initialize the second element
		numbers[2] = 20;// just checking
		numbers[3]=40;//if i give extra index then error ArrayIndexBooundsException
		// Print the values of the array
		for (int i = 0; i < numbers.length; i++) {
			System.out.println("Element at index " + i + ": " + numbers[i]);
		}
	}
}





