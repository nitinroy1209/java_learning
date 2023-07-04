package com.guvi.pack1;
import com.google.www.pack.A;
import com.google.www.pack.*;
import com.google.www.pack.subpack.*;
public class AcessingPackage {
	public static void main(String str[])
	{
	A obj= new A();
			obj.msg();
			B obj1= new B();
			obj1.msg1();
			
			

			//using a fully qualified name instead of importing the package
			com.google.www.pack.A obj3 = new com.google.www.pack.A();
			obj3.msg();
			SubpackageEx obj4=new SubpackageEx();
			obj4.message3();
	}
}
