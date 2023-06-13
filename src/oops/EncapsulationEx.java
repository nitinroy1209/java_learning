package oops;

class EmployeeDetails
{
	//private variable for data hiding
	private String employeeName;
	private int employeeAge;
	
	//Setter methods
	public void setEmployeeName(String name) {
		employeeName = name;
	}
	
	public void setEmployeeAge(int age) {
		employeeAge = age;
	}
	
	//getter methods
	public String getEmployeeName() {
		return employeeName;
	}
	
	public int getEmployeeAge() {
		return employeeAge;
	}
	
	
}

public class EncapsulationEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EmployeeDetails emp = new EmployeeDetails();
		emp.setEmployeeName("Arun");
		emp.setEmployeeAge(30);
		
		System.out.println(emp.getEmployeeName());
		
		System.out.println(emp.getEmployeeAge());
		
		

	}

}
