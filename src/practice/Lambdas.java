package practice;

public class Lambdas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cat myCat = new Cat();//
		myCat.print();//
		printThing(myCat);
		
		
		static void printThing(Printable thing)//Printable is any object which implement the printable Interface 
		{
			thing.print();
			
		}

	}

}
