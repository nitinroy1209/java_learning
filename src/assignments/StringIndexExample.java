package assignments;

public class StringIndexExample {
	public static void main(String[] args) {
		String text = "Hello, world!";

		try {
			// Trying to access characters using invalid indices
			char character1 = text.charAt(15);  // Index out of bounds
			char character2 = text.charAt(-1);  // Negative index
		} catch (StringIndexOutOfBoundsException e) {

			System.out.println("String index out of bounds exception occurred!");
		}
	}
}
