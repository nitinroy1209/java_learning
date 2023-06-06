package assignments;

public class StringtoCharArray {
	


	  public static void main(String args[]) {
	    String str = "nitin"; // Given String

	    // Creating array of string length
	    char[] arr = new char[str.length()];

	    // Copy character by character into array
	    for (int i = 0; i < str.length(); i++) {
	      arr[i] = str.charAt(i);
	    }

	    // Printing the character array
	    //for (char x : arr) {
	      //System.out.println(x);
	    
	    for (int i = 0; i < arr.length; i++) {
	        char x = arr[i];
	        System.out.println(x);
	    }

	    
	    }
	  }
	



