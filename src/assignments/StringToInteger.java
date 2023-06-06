package assignments;

public class StringToInteger
{
	public static void main (String args[])
	{
		
		//The Integer.parseInt() method is specifically designed to convert a valid numeric string representation into an integer value. It expects the input string to be a sequence of numeric characters without any additional non-numeric characters, such as letters or symbols.

		//If you try to pass a string that cannot be parsed as a valid integer, such as "abc", to the parseInt() method, it will throw a NumberFormatException. The method assumes that the string represents a valid integer and cannot interpret or convert non-numeric characters.
	String s="121";
	String s1="12345";
	String s3="1234567";
	double value1=Double.parseDouble(s3);
	int value=Integer.parseInt(s);
	int val=Integer.valueOf(s1);
	//System.out.println("value" +value);
	//System.out.println("val" + val);
	//System.out.println("val: " + val);
	 System.out.println("value: " + value);
     System.out.println("val: " + val);
     System.out.println("String to double :" +value);
}
}





