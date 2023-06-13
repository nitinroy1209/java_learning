package oops;

//Here vehicleName and price are instance variables and its value is dependent on the objects we create for that class
//whereas vehicleType is static variable which means that its value is unique for all the complete class irrespective of the objects we create for the class
//We can access a static variable using classname.variablename (because static variable are class level variables)

class VehicleDetails1
{
	String vehicleName;
	int price;
	static String vehicleType;
	
	void displayData()
	{
		System.out.println(vehicleName+":"+price+":"+vehicleType);
	}
	
	
	//static method can have only static members inside it and thats the reason vehicleName and price are displaying error
	
	//compiler would get confused to which instance of the variable is called and thats the reason non-static or instance variables are not allowed inside a static method
	static void displayData1(VehicleDetails1 obj)//HERE OBJ IS A LOCAL OBJECT JUST AS WE CREATED FOR THIS LOCAL VARIABELE IN CONSTRUCTOR..VERY IMPORTANT
	{
		System.out.println("inside static method");

		System.out.println(obj.vehicleName+":"+obj.price+":"+vehicleType);
		System.out.println(vehicleType);

	}
}


public class StaticMethodEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		VehicleDetails1 obj1 = new VehicleDetails1();
		obj1.vehicleName="Yamaha Ray";
		obj1.price=90000;
		//obj1.vehicleType="2 Wheeler";
		
	
		
		VehicleDetails1 obj2 = new VehicleDetails1();
		obj2.vehicleName="Honda Activa";
		obj2.price=85000;
		//obj2.vehicleType="4 Wheeler";
		
		
		//accessing a sttaic variable
		VehicleDetails1.vehicleType="6 wheeler";
		
		obj1.displayData();
		
		obj2.displayData();
		
		//accessing a static method
		VehicleDetails1.displayData1(obj1);
		
		
		
		

	}

}
