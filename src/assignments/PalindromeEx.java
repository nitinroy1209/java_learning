package assignments;


class PalindromeString
{
	public void checkPalindrome(String str )
	{
		String inputString=str;
		String reverse="";
		int getLength= inputString.length();
		System.out.println("Length of the String-->"+getLength);

		// To reverse liril --> 

		for (int i=getLength-1; i>=0; i--)
		{
			reverse = reverse+ inputString.charAt(i);

			/*first iteration
				//i=4,4>=0
				//reverse= ""+l 
				//reverse=l
			 * 
			 * 
			 * Second iteration
			 * i=3, 3>=0
			 * reverse= l+i
			 * reverse=li
			 * 
			 * third iteration
			 * i=2; 2>=0
			 * reverse=li+r
			 * reverse=lir
			 * 
			 * fourth iteration
			 * i=1; i>=0
			 * reverse=lir+i
			 * reverse=liri
			 * 
			 * fifth iteration
			 * i=0;0>=0
			 * reverse=liri+l
			 * reverse=liril
			 * 
			 */
		}

		if (reverse.equals(inputString))
		{
			System.out.println("The given String "+inputString+" is a palindrome String");
		}
		else
		{
			System.out.println("The given String "+inputString+" is not a palindrome String");
		}

	}

}

public class PalindromeEx {


	public static void main(String[] args) {

		PalindromeString palindrome= new PalindromeString();
		palindrome.checkPalindrome("liril");
		palindrome.checkPalindrome("madam");
		palindrome.checkPalindrome("sir");
		palindrome.checkPalindrome("java");

	}

}

