package assignments;

public class RemoveCharacter {


	public static void main(String[] args) {
		String originalString = "Hello, how are you?";
		char characterToRemove = 'o';
		String resultString = "";

		for (int i = 0; i < originalString.length(); i++) {
			char currentChar = originalString.charAt(i);

			if (currentChar != characterToRemove) {
				resultString += currentChar;
			}
		}

		System.out.println("Original string: " + originalString);
		System.out.println("Character to remove: " + characterToRemove);
		System.out.println("Resulting string: " + resultString);
	}
}


