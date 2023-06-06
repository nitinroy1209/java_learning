package oops;

//super can be used to refer immediate parent class instance variable.

//baseclass or super class
class Car
{
	String carColor="black";
	
}

class Mahindra extends Car
{
	String carColor="Red";
	
	void displayColor()
	{
		System.out.println("The car color in the child class is-->"+carColor);
		System.out.println("The car color in the super class is -->"+super.carColor);
	}
	
}


public class SuperVariableEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Mahindra mahindra = new Mahindra();
		mahindra.displayColor();

	}

}