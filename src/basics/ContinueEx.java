


package basics;

//continue statement is used to skip that particular iteration and go to the beginning of the next iteration

public class ContinueEx {

	public static void main(String[] args) {

		for(int i=1; i<=10;i++)
		{
			if(i==5)
			{
				continue;
			}

			System.out.println(i);
		}
	}

}



