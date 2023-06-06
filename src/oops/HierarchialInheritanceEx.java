

	//Hierarcharical inheritance

package oops;

	//Parent class
	class Animal2
	{
		void eat()
		{
			System.out.println("Animal is eating");
		}
	}

	//Hierarchy -1
	class Dog2 extends Animal2
	{
		void bark()
		{
			System.out.println("Dog is barking");
		}
	}

	//Hierarchy -2
	class Cat2 extends Animal2
	{
		void meow() {
			System.out.println("meow");
		}
	}


	public class HierarchialInheritanceEx {

		public static void main(String[] args) {

			//object for hierarchy 1
			Dog2 d = new Dog2();
			d.bark();
			d.eat();
			
			//object for hierarchy 2
			Cat2 c = new Cat2();
			c.meow();
			c.eat();
			
		}

	}

