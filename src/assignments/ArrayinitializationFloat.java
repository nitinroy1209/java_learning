package assignments;

public class ArrayinitializationFloat {
	public static void main(String[] args) {
		float[] numbers = new float[3]; // Allocate memory for an array of three floats

		numbers[0] = 3.14f; // Initialize the first element
		numbers[1] = 2.718f; // Initialize the second element

		// Print the values of the array
		for (int i = 0; i < numbers.length; i++) {
			System.out.println("Element at index " + i + ": " + numbers[i]);
		}
	}
}

