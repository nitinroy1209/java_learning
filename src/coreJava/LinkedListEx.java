package coreJava;
import java.util.*;

public class LinkedListEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//LinkedList with heterogenous data
		LinkedList ll = new LinkedList();
		
		//LinkedList with homogenous data
		LinkedList<String> ll1 = new LinkedList<String>();
		
		ll.add("Java");
		ll.add(true);
		ll.add(null);
		ll.add(25);
		ll.add(67.6);
		
		System.out.println("Linked List values"+ ll);
		

	}

}
