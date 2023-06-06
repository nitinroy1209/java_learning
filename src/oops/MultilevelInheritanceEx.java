//multilevel inheritance example

package oops;



	//parent class
	class Animal1
	{
		String animalName="dog";
		
		void eat()
		{
			System.out.println("Animal is eating");
		}
	}

	//sub class for Animal1 but parent class for Cat
	class Dog1 extends Animal1
	{
		void bark()
		{
			System.out.println("Dog is barking");
		}
	}

	//subclass for Dog1
	class Cat1 extends Dog1
	{
		void meow()
		{
			System.out.println("meow");
		}
	}

	public class MultilevelInheritanceEx {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			Cat1 c = new Cat1();
			c.meow();
			c.bark();
			c.eat();
			System.out.println(c.animalName);

		}

	}


