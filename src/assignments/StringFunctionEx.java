package assignments;

public class StringFunctionEx {

	private String str;

	public StringFunctionEx(String str) {
		this.str = str;
	}

	public int length() {
		return str.length();
	}

	public boolean isEmpty() {
		return str.isEmpty();
	}

	public char charAt(int index) {
		return str.charAt(index);
	}

	public int indexOf(char ch) {
		return str.indexOf(ch);
	}

	public int lastIndexOf(char ch) {
		return str.lastIndexOf(ch);
	}

	public boolean startsWith(String prefix) {
		return str.startsWith(prefix);
	}

	public boolean endsWith(String suffix) {
		return str.endsWith(suffix);
	}

	public boolean equals(String other) {
		return str.equals(other);
	}

	public boolean equalsIgnoreCase(String other) {
		return str.equalsIgnoreCase(other);
	}

	public String trim() {
		return str.trim();
	}

	public String replace(char oldChar, char newChar) {
		return str.replace(oldChar, newChar);
	}

	public String[] split(String regex) {
		return str.split(regex);
	}

	public String substring(int beginIndex, int endIndex) {
		return str.substring(beginIndex, endIndex);
	}

	// Additional custom methods

	public String reverse() {
		StringBuilder sb = new StringBuilder(str);
		return sb.reverse().toString();
	}

	public boolean isPalindrome() {
		String reversed = reverse();
		return str.equalsIgnoreCase(reversed);
	}




	public static void main(String[] args) {
		StringFunctionEx strFunc = new StringFunctionEx("Hello, World!");

		//System.out.println("Length: " + strFunc.length());
		//System.out.println("Is Empty? " + strFunc.isEmpty());
		//System.out.println("Index of 'o': " + strFunc.indexOf('o'));
		//System.out.println("Last Index of 'o': " + strFunc.lastIndexOf('o'));
		//System.out.println("Starts with 'Hello': " + strFunc.startsWith("Hello"));
		//System.out.println("Ends with 'World!': " + strFunc.endsWith("World!"));
		//System.out.println("Equals 'Hello, World!': " + strFunc.equals("Hello, World!"));
		//System.out.println("Equals Ignore Case 'hello, world!': " + strFunc.equalsIgnoreCase("hello, world!"));
		//System.out.println("Trimmed string: " + strFunc.trim());
		//System.out.println("Replaced 'o' with 'a': " + strFunc.replace('o', 'a'));
		//System.out.println("Split string at ',': " + Arrays.toString(strFunc.split(",")));
		System.out.println("Substring from index 7 to 12: " + strFunc.substring(7, 12));
		System.out.println("Reversed string: " + strFunc.reverse());
		System.out.println("Is Palindrome? " + strFunc.isPalindrome());
	}
}

