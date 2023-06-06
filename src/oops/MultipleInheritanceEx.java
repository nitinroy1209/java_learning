


	
	
	//multiple inheritance
	//why it is supported in java. Here the compiler will confuse which sleep() to call
	package oops;

	//multiple inheritance --> able to inherit 2 classes at a time which is not possible in java
	class A
	{
		void sleep()
		{
			System.out.println("Sleep method in A class");
		}
	}

	class B
	{
		void sleep()
		{
			System.out.println("Sleep method in B class");
		}
	}



	public class MultipleInheritanceEx extends A,B {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			MultipleInheritanceEx multiple = MultipleInheritanceEx();
			multiple.sleep();
			

		}


