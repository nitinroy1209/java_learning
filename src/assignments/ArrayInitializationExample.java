package assignments;

public class ArrayInitializationExample {


	public static void main(String[] args) {
		char[] characters = new char[3]; // Allocate memory for an array of three characters

		characters[0] = 'A'; // Initialize the first element
		characters[1] = 'B'; // Initialize the second element

		// Print the values of the array
		for (int i = 0; i < characters.length; i++) {
			System.out.println("Element at index " + i + ": " + characters[i]);
		}
	}
}



