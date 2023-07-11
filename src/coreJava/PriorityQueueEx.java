package coreJava;  //priority queue
import java.util.*;

public class PriorityQueueEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PriorityQueue pq= new PriorityQueue();
	    pq.add("A");
		pq.add("C");
		pq.add("B");
		pq.add("E");
		pq.offer("D");
		pq.offer("C");
		//pq.offer(true);
		 
		System.out.println(pq);
		
		//to fetch the head element . //A //It will throw NoSuchElement Exception
		//System.out.println(pq.element());
		
		//System.out.println(pq.peek());//A //It will throw Null
		
		//It will throw NoSuchElement Exception
		System.out.println(pq.remove());
		//System.out.println(pq);
		
		
		//It will return Null
		//System.out.println(pq.poll());
		System.out.println(pq);
		
		

	}

}