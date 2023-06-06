package oops;  //final class

//If we declare a class ad final, we cannot inherit that specific class 

final class VehicleFinal
{
	void displayVehicleColor()
	{
		System.out.println("The vehicle color is black");
	}
}

public class FinalClassEx //extends VehicleFinal 
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		VehicleFinal obj = new VehicleFinal();
		obj.displayVehicleColor();

	}

}
