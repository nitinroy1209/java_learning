package practice;
import java.util.Set;
import java.util.ArrayList.*;
import java.util.*;

public class HashSetUsingAdvancedForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Set<String> name = new HashSet<>();//what class of things is going to be held as element of set answer is String
		//variables for the set is name 
		//instantiate it with its implementing class Whisch is HashSet
		
		name.add("John");
		name.add("Butterscotch");
		name.add("Strawberry");
		name.add("Vanilla");
		name.add("Ice CReam");
		System.out.println(name);
		
		name.add("John");//does not allow duplicates//does not maintain insertion order
		
		name.remove("John");//in remove fuction we need to pass string in hash set while in list we pass particular index
		System.out.println("after removing John" +name);
		
		System.out.println(name.size());
		
		//name.clear();
		//System.out.println(name);
		
		//I want to loop through each Sting inside my name set i am using Advanced for loop
		
		//for(String names : name)//each String names inside my set of name i wnat to do the following
		{
		
		//printout each names here i will do SOPLN
			//System.out.println(names);
			
			//ADVANCED FOR LOOP USING LAMDAS: i want to go through name in each set and for each element in my set
			//pass in forEach function 
			//name.forEach(System.out::println);
			// can use name.iterator to give iterator object to use through the set
			//declare object it will be Iterator of Strings because are set is a set of string ,give it a name mango
			//iterator of String and give it a name as nameIterator and initialize it to names.Iterator
			
			Iterator<String> nameIterator = name.iterator();
			//to use this to iterator to our set we will use while loop has next item
			while(nameIterator.hasNext())
			{
				System.out.println(nameIterator.next());
			}
			
			List<Integer> numberL = new ArrayList<>();
			numberL.add(4);
			numberL.add(3);
			numberL.add(3);
			numberL.add(3);
			numberL.add(4);
			System.out.println(numberL);
			
			//getting rid of duplicates
			Set<Integer> num1 = new HashSet<>(numberL);
			//num1.addAll(numberL);
			System.out.println(num1);
				// in treeset it print from a to z alphabetical order
		//linkedhash set print exact same order as it is given
				
	

	}

}
}
