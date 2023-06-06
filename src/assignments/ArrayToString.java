package assignments;
import java.util.Arrays;
public class ArrayToString 
{
	
	public static void main (String args[])
	{
		String str []= {"java", "is", "my" , "favourite" ,"language"};
		//convert array to string
		//using toString method
		String str1=Arrays.toString(str) ;
		//System.out.println(str1);
		
		//using join method
		
		String str2=String.join ( "  ", str);
		System. out.println (str2) ;
		
	
	}
	
		
		
		
	}


