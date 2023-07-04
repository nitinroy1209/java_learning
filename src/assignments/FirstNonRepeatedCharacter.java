package assignments;


	import java.util.HashMap;
	import java.util.Map;
	public class FirstNonRepeatedCharacter {
	    public static char findFirstNonRepeatedChar(String str) {
	        Map<Character, Integer> charCounts = new HashMap<>();

	        // Count the occurrences of each character in the string
	        for (char c : str.toCharArray()) {
	            charCounts.put(c, charCounts.getOrDefault(c, 0) + 1);
	        }

	        // Find the first non-repeated character
	        for (char c : str.toCharArray()) {
	            if (charCounts.get(c) == 1) {
	                return c;
	            }
	        }

	        // If no non-repeated character is found, return a default value
	        return '\0';
	    }

	    public static void main(String[] args) {
	        String input = "hello world";
	        char firstNonRepeatedChar = findFirstNonRepeatedChar(input);

	        if (firstNonRepeatedChar != '\0') {
	            System.out.println("First non-repeated character: " + firstNonRepeatedChar);
	        } else {
	            System.out.println("No non-repeated characters found.");
	        }
	    }
	}
