package coreJava; //
import java.util.*;

public class HashSetExample {

	public static void main(String[] args) {
 
		HashSet h1=new HashSet();
		
		HashSet h2=new HashSet(100);
		
		HashSet h3 =new HashSet(100,(float)0.90);
		
	
		h1.add(15);
		h1.add(12.5);
		h1.add("guvi");
		h1.add(false);
		h1.add(null);
		h1.add("python");
		System.out.println(h1);// o/p doesn't maintain order
		System.out.println("Size is " +h1.size());//6
		
		h1.add("java");
		System.out.println("after adding element -->"+h1);
		
		h1.remove("python");
		System.out.println("after removing one element -->"+ h1);
		
		System.out.println(h1.isEmpty());//false
		
		System.out.println(h1.contains("C++"));//false
		System.out.println(h1.contains(15)); //true
		
		System.out.println("----------------------------");
		//for each
		for(Object val:h1)
		{
			System.out.println(val);
		}
		System.out.println("----------------------------");
		//Iterator
		
		Iterator it=h1.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
			
		}
		System.out.println("----------------------------");
		
		HashSet<Integer> h4=new HashSet<Integer>();
		HashSet<Integer> h5=new HashSet<Integer>();
		System.out.println("before add -->"+h4);
		
		h4.add(10);
		h4.add(34);
		h4.add(23);
		h4.add(35);
		h5.addAll(h4);
		h5.add(39);
		System.out.println("after add all elements--> "+h4);
		System.out.println("after add all elements--> "+h5);
		
		//h5.removeAll(h4);
		System.out.println("after removing all elements -->"+h5);
		
		//System.out.println(h5.containsAll(h4));
		
		h5.retainAll(h4);
		System.out.println("After retaining-->"+h5);
		
		
	}

}