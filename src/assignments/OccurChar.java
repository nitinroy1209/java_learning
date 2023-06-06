package assignments;

public class OccurChar {
	
	public static void main(String args[])
	{
		String str="nitin";
		char ch='i';
		int count=0;
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i) == ch)
			{
				count++;
				
			}
		}
		
		System. out. println ("The character " +ch+ " has repeated " +count+ "times"); ;
		
	}

}
