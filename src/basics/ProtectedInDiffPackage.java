---------------------------------------------------------------------------
package basics;  //different package

import oops.ProtectedEx3;

//ProtectedEx3 --> Parent class or base class
//ProtectedInDiffPackage --> Sub class or derived class or child class
public class ProtectedInDiffPackage extends ProtectedEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ProtectedInDiffPackage obj1= new ProtectedInDiffPackage();
		obj1.displayValue();
	}

}