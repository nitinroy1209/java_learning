package oops;

//Here vehicleName and price are instance variables and its value is dependent on the objects we create for that class
//whereas vehicleType is static variable which means that its value is unique for all the complete class irrespective of the objects we create for the class
//We can access a static variable using classname.variablename (because static variable are class level variables)

class VehicleDetails
{
	String vehicleName;
	int price;
	static String vehicleType;
	
	void displayData()
	{
		System.out.println(vehicleName+":"+price+":"+vehicleType);
	}
}


public class StaticVarEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		VehicleDetails obj1 = new VehicleDetails();
		obj1.vehicleName="Yamaha Ray";
		obj1.price=90000;
		//obj1.vehicleType="2 Wheeler";
		
	
		
		VehicleDetails obj2 = new VehicleDetails();
		obj2.vehicleName="Honda Activa";
		obj2.price=85000;
		//obj2.vehicleType="4 Wheeler";
		VehicleDetails.vehicleType="6 wheeler";
		
		
		//VehicleDetails.vehicleType="6 wheeler";
		
		obj1.displayData();
		
		obj2.displayData();
		
		
		
		

	}

}
