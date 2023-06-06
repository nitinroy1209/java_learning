package assignments;

public class ExtractNumericFromString  
{
	public static void main (String args[])
	{


		String str = "abc123def";
		String numericString = str.replaceAll("\\D+", "");
		System.out.println(numericString);
		

	}
}
