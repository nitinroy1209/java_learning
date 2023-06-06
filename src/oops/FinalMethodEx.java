package oops;   //final method

//When we add final keyword to the method, then that method cannot be overrided in the subclass

class VehicleColor
{
	final void displayVehicleColor()
	{
		System.out.println("The vehicle color is black");
	}
}

public class FinalMethodEx extends VehicleColor   {
	
	//void displayVehicleColor()
	{
		System.out.println("The vehicle color is white");
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FinalMethodEx obj= new FinalMethodEx();
		obj.displayVehicleColor();

	}

}
