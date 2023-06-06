package oops;

class Bank
{
	void interest()
	{
		System.out.println("Interest rate is 7");
	}
}


class HDFC extends Bank
{
	void interest()
	{
		System.out.println("Interest rate is 8");
	}
}

class ICICI extends Bank
{
	void interest()
	{
		System.out.println("Interest rate is 9");
	}
}

class Axis extends Bank
{
	void interest()
	{
		System.out.println("Interest rate is 10");
	}
}


public class MethodOverridingEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HDFC obj= new HDFC();
		obj.interest();
		
		ICICI obj1 = new ICICI();
		obj1.interest();
		
		Axis obj2 = new Axis();
		obj2.interest();

	}

}