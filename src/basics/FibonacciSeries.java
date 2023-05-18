package basics;

public class FibonacciSeries
{

	public static void main(String[] args) 
	{
		int numTerms = 10;  // Assuming we want to generate 10 terms

		int prev = 0;
		int curr = 1;

		System.out.println(prev);
		System.out.println(curr);

		for (int i = 2; i < numTerms; i++) {
			int nextNum = prev + curr;
			System.out.println(nextNum);

			prev = curr;
			curr = nextNum;
		}	
	}









}
