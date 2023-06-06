package assignments;

public class ReverseString {
	public static void main (String args[]) 
	{
		String name="flower";
		String reverse="";
		int nlength=name.length();
		for(int i=nlength-1; i>=0; i-- )
		{
			reverse=reverse+name.charAt(i);
			
		}
		System.out.println("reverse string is : " +reverse);
		
	}

}
