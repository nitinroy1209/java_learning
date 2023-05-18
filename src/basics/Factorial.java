package basics;

public class Factorial {
	


		public static void main(String[] args) {

			//3!=3*2*1 =6
			//4!=4*3*2*1=24
			
			int factorialNumber=5; //5! = 5*4*3*2*1
			int factorialResult=1;
			
			for(int i=1;i<=factorialNumber;i++)
			{
				factorialResult= factorialResult*i;
				//1=1*1
				//2=1*2
				//6=2*3
				//24=6*4
				//120 =24*5
			}
			System.out.println("Factorial of "+factorialNumber+" is: "+factorialResult);
			
		}

}
