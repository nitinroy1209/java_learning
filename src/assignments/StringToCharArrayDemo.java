package assignments;

public class StringToCharArrayDemo {
	    public static void main(String[] args) {
	        String string1 = "Hello, World!";
	        char[] charArray = string1.toCharArray();

	        System.out.println("Original String: " + string1);
	        System.out.print("Character Array: ");
	        //for (char c : charArray) {
	          //  System.out.print(c + " ");
	        
	        for (int i = 0; i < charArray.length; i++) {
	            char c = charArray[i];
	            System.out.print(c + " ");
	        }

	        }
	    }
	}

