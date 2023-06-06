package assignments;

public class WordCounter {


	public static void main(String[] args) 
	{
		String sentence = "A QUICK BROWN FOX";

		int wordCount = 0;
		for (int i = 0; i < sentence.length(); i++) {
			if (sentence.charAt(i) == ' ') {
				wordCount++;
			}
		}
		wordCount++; // Increment wordCount for the last word

		System.out.println("Number of words: " + wordCount);
	}
}


