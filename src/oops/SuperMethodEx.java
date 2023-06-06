


package oops;

//super can be used to invoke immediate parent class method.

//base class or super class
class Car1
{
	String carColor="black";

	void displayColor()
	{
		System.out.println("The car color in super class is "+carColor);
	}
}

//child class or derived class
class Maruthi extends Car1
{
	String carColor="red";

	void displayColor()
	{
		System.out.println("The car color in child class is "+carColor);
	}

	void getAllCarData()
	{
		displayColor();
		super.displayColor();
	}
}



public class SuperMethodEx 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		Maruthi mar = new Maruthi();
		mar.getAllCarData();
	}

}


