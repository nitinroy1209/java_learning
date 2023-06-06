package assignments;

public class DuplicateCharacterInString {

	public static void main(String[] args) {
		String str = "nitin";
		int strLength = str.length();
		System.out.println("Length of the given string is: " + strLength);
		int duplicateCount = 0;

		for (int i = 0; i < strLength ; i++) {
			char currentChar = str.charAt(i);


			for (int j = 0; j < strLength; j++) {
				char nextChar = str.charAt(j);

				if (currentChar == nextChar ) {
					System.out.println("Number of duplicate characters: " + duplicateCount);
					duplicateCount++;
					break;

				}
			}
		}

		System.out.println("Number of duplicate characters: " + duplicateCount);
	}
}
