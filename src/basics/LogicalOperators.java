package basics;

public class LogicalOperators {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			/*
			 * &&
			 * ||
			 * !
			 *
			 */
			
			int a=15, b=20, c=5;
			boolean val= false;
			
			System.out.println("Not Operator-->"+!val);
			if ((a >b) && (b>c))
			{
				System.out.println("If block");
			}
			else if ((a >b) || (b>c))
			{
				System.out.println("Inside Else if");
				
			}
			else
			{
				System.out.println("Else block");
			}

		}

	}


