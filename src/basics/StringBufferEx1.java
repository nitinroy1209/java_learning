package basics;

public class StringBufferEx1 
{




	public static void main(String[] args) {

		// StringBuffer is a mutable (values are changeable) version of the String class
		// The default number of characters for StringBuffer is 16

		// First way of creating StringBuffer
		StringBuffer sb = new StringBuffer();
		sb.append("Hello");
		sb.append("world");

		System.out.println("sb --> " + sb);

		// Second way of creating StringBuffer
		StringBuffer sb1 = new StringBuffer("Hello");
		sb1.append("world");

		System.out.println("Second way of creating StringBuffer --> " + sb1);

		// Third way of creating StringBuffer
		StringBuffer sb2 = new StringBuffer(20);
		sb2.append("java");
		sb2.append("language");
		System.out.println("Third way of creating StringBuffer --> " + sb2);

		// Other StringBuffer methods

		sb.insert(1, "java");
		System.out.println("After Inserting in sb --> " + sb);

		// beginIndex is inclusive and the endIndex is exclusive
		sb.delete(1, 5);
		System.out.println("After deleting in sb --> " + sb);

		sb.replace(5, 10, "java");
		System.out.println("After replacing in sb --> " + sb);


		String sub = sb.substring(0, 5);
		System.out.println("Extracting Hello from sb --> " + sub);
		System.out.println("Extracting Hello from sb --> " + sb.substring(0, 5));

		String sub1 = sb.substring(5);
		System.out.println("Extracting Hello from sb --> " + sub1);

		// sb.reverse();
		// System.out.println("reversing sb --> " + sb);

		char ch = sb.charAt(1);
		System.out.println("charAt --> " + ch);

		System.out.println("Length of sb --> " + sb.length());

		StringBuffer sb4 = new StringBuffer();
		System.out.println("Default capacity --> " + sb4.capacity());
		sb4.append("Hello");
		System.out.println("Capacity after appending Hello --> " + sb4.capacity());
		sb4.append("java is my favorite language");
		System.out.println("After inserting characters more than 16 --> " + sb4.capacity());
		/*
		 * new capacity = (old capacity * 2) + 2;
		 * newCapacity = (16 * 2) + 2 = 34
		 */

		// ensureCapacity
		StringBuffer sb5 = new StringBuffer();
		System.out.println("Default capacity in sb5 --> " + sb5.capacity()); // 16
		sb5.append("Hello");
		System.out.println("Capacity after appending Hello in sb5 --> " + sb5.capacity()); // 16
		sb5.append("java is my favorite language");
		System.out.println("After inserting characters more than 16 in sb5 --> " + sb5.capacity()); // 34

		sb5.ensureCapacity(15);
		System.out.println("Checking the capacity when the minimum capacity (15) < current capacity (34) --> " + sb5.capacity());

		sb5.ensureCapacity(50);
		System.out.println("Checking the capacity when the minimum capacity (50) > current capacity (34) --> " + sb5.capacity());
		/*
		 * new capacity = (old capacity * 2) + 2;
		 * newCapacity = (34 * 2) + 2 = 70
		 */


	}
}






