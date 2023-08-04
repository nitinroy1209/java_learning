package coreJava;
import java.util.*;

public class TreeMapOwn {

	public static void main(String[] args) {
		
		
		
		
		
		      
		      
		      TreeSet t1 = new TreeSet();
		      TreeSet t9= new TreeSet();
		      
		      
		   
		   
		      t9.add(89);
		      t9.add(79);
		      t1.add(69);
		      t1.add(39);
		      
		      t1.add(78);
		    System.out.println(t1);
		    System.out.println(t9);
		    
		    
		    t9.retainAll(t1);
		    System.out.println(t9);
		    System.out.println(t1);
		    }
		

	}


