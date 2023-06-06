package assignments;

public class ArrayinitializationBoolean {
	public static void main(String[] args) {
		boolean[] flags = new boolean[3]; // Allocate memory for an array of three booleans

		flags[0] = true; // Initialize the first element
		flags[1] = false; // Initialize the second element

		// Print the values of the array
		for (int i = 0; i < flags.length; i++) {
			System.out.println("Element at index " + i + ": " + flags[i]);
		}
	}
}

