package assignments;

public class ArrayInitializeStringExample {

	public static void main(String[] args) {
		String[] strings = new String[3]; // Allocate memory for an array of three strings

		strings[0] = "Hello"; // Initialize the first element
		strings[1] = "World"; // Initialize the second element

		// Print the values of the array
		for (int i = 0; i < strings.length; i++) {
			System.out.println("Element at index " + i + ": " + strings[i]);
		}
	}
}
