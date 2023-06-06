package oops;


	//parent class or super class
	class Animal
	{
		String animalName="dog";
		
		void eat()
		{
			System.out.println("Animal is eating");
		}
	}

	//child class or sub class (extends is the keyword used to inherit the parent class
	class Dog extends Animal
	{
		void bark()
		{
			System.out.println("Dog is barking");
		}
		
	}

	public class SingleInheritanceEx {
		
		public static void main(String args[])
		{
			Dog d = new Dog();
			
			d.bark();
			
			d.eat();
			System.out.println(d.animalName);
		}

	}


