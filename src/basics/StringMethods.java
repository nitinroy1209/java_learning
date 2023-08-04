package basics;

import java.util.Arrays;

public class StringMethods {


	public static void main(String[] args) {

		String str= "java";

		str=str.concat(" is a programming language");

		//System.out.println(str);
		//System.out.print(str);

		String str1= str.toUpperCase();
		//System.out.println(str1);

		String str2= str1.toLowerCase();
		//System.out.println(str2);

		char str3= str.charAt(3);
		//System.out.println(str3);
		System.out.println(str.charAt(3));

		String str4= str.replace("a", "e");
		//System.out.println(str4);

		String str5= str.replace("is", "was");
		//System.out.println(str5);

		boolean str6= str.contains("is");
		//System.out.println(str6);

		boolean str7= str.contains("was");
		//System.out.println(str7);

		String str8="";
		boolean emptyString= str8.isEmpty();
		//System.out.println(emptyString);

		String str9 ="hello";
		String str10="Hello";

		boolean equalString= str9.equals(str10);
		//System.out.println("Equals-->"+equalString);

		boolean equalIgnoresString= str9.equalsIgnoreCase(str10);
		//System.out.println("Equals Ignores case-->"+equalIgnoresString);

		//end index is exlusive and begining index is inclusive. It will print from 1 to 9
		String str11= str.substring(2, 10);
		//System.out.println("Substring-->"+str11);

		String str12= str.substring(2);
		//System.out.println("Substring without end index-->"+str12);

		int lengthOfString= str9.length();
		//System.out.println(lengthOfString);

		int ch=str9.indexOf("o");
		//System.out.println("Index of -->"+ch);
		
		
		
		
		
		    //System.out.println("Length: " + str.length());
	        //System.out.println("Is Empty? " + str.isEmpty());
	        //System.out.println("Character at index 4: " + str.charAt(4));
	        //System.out.println("Index of 'o': " + str.indexOf('o'));
	        //System.out.println("Last Index of 'o': " + str.lastIndexOf('o'));
	        //System.out.println("Starts with 'Hello': " + str.startsWith("Hello"));
	        //System.out.println("Ends with 'World!': " + str.endsWith("World!"));
	        //System.out.println("Equals 'Hello, World!': " + str.equals("Hello, World!"));
	        //System.out.println("Equals Ignore Case 'hello, world!': " + str.equalsIgnoreCase("hello, world!"));
	        //System.out.println("Trimmed string: " + str.trim());
	        //System.out.println("Replaced 'o' with 'a': " + str.replace('o', 'a'));
	        System.out.println("Split string at ',': " + Arrays.toString(str.split(",")));
	        //System.out.println("Substring from index 7 to 12: " + str.substring(7, 12));
	        //System.out.println("Reversed string: " + str.reverse());
	        //System.out.println("Is Palindrome? " + str.isPalindrome());
	    












	}

}



