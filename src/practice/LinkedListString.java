package practice;
import java.util.LinkedList;
import java.util.ArrayList;

public class LinkedListString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		LinkedList<String> namesLinkedList = new LinkedList<>();
		namesLinkedList.add("hello");
		namesLinkedList.add("meow");
		namesLinkedList.add("john");
		namesLinkedList.add("Paul");
		System.out.println(namesLinkedList.get(2));
		namesLinkedList.add(1,"James");
		System.out.println("After inserting at index 1 " + namesLinkedList);
		
		
		System.out.println("Inside Linked list" + namesLinkedList);
		ArrayList<String> namesArrayList = new ArrayList<> ();
		namesArrayList.add("henry");
		namesArrayList.add("VITAMIN");
		namesArrayList.add("TABLET");
	   namesArrayList.add(1,"Swizz");
	   System.out.println("after inserting at index 1" + namesArrayList);
		
		System.out.println("Inside Linked list" + namesArrayList);
		

	}
 
}
