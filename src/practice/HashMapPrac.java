package practice;
import java.util.HashMap;

public class HashMapPrac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//map does not care about the exact same order 
		//it cares about key value pair
		HashMap<String,Integer> tm = new HashMap<>();
		tm.put("owl", 1);
		tm.put("oo", 5);
		tm.put("ol", 1);
		tm.put("ow", 1);
		System.out.println(tm);
		
	
		System.out.println(tm.get("owl"));
		System.out.println(tm.containsKey("ow"));
		System.out.println(tm.containsValue(1));
		
		tm.put("owl", 2000);
		System.out.println(tm);
		tm.replace("ol", 000);
		System.out.println(tm);
		tm.putIfAbsent("ow", 19888);//it wont update the value 
		System.out.println(tm);
		//tm.putIfAbsent("jerry", 9000);//putif will put if not present key
		//System.out.println(tm);
		
		tm.remove("owl");
		System.out.println(tm);
		
	}

}
