package practice;
//ALL THE METHODS FOLLOW CAMEL CASING
//STRING IS IMMUTABLE AND STRINGBUFFER IS MUTABLE
public class StringBuilderP {
	public static void main(String[] args)
	{ 
	//1st way ,Noramlly stick with 1sr and second way
	StringBuilder sb=new StringBuilder();//we ARE NOT CREATING OBJECT TO THIS CLASS StringBuilderP BUT INFACT StringBuilder is a class and we have created object to this class
	sb.append("Hello");
	sb.append("World");

	System.out.println("String builder is mutable-->"+sb);
	//System.out.println(sb.toString());// To print the same given we use toString method
	 
	//2nd way
	StringBuilder sb1=new StringBuilder("Hello");//parameterized Constructor,THere is another constructor in String builder class public StringBuilder(String str){super(str)By default
    sb1.append(" world");
    
    System.out.println("Second way of  creating String builder and which is mutable-->"+sb1);
	//3rd way of creating StringBuilder
    
    StringBuilder sb2=new StringBuilder(2);//pass the length of string builder object it will create the String builder object with 20 characters ,The default character lenth is 16 character
	 sb2.append("java  ");
	 sb2.append("langauge  ");
	 System.out.println("Second way of  creating String builder and which is mutable-->"+sb2);
	 //other methods
	 sb.insert(1,"java");//iT ACCEPTS TWO ARGUMENTS,ONE IS WHERE AT WHAT INDEX VALUE SHOULD BE INSERTED,At index 1 it will insert java and push the other character at end.
	 System.out.println("After Inserting java using insert method" +sb);
	 sb.delete(1,5 );//last index is exclusivedelete until 4th index but need to mention last index at 5 and ACCEPTS TWO ARGUMENTS START INDEX AND END INDEX
	 System.out.println("After deleting java from Hjavaelloworld in sb--> : " +sb);
	 
	sb.replace( 5, 10,"java");//  FOR REPLACE METHOD RETURN TYPE IS STRING BUILDER SO IT WAS ABLE TO CAPTURE THE CHANGES AND ABLE TO PRINT ITAND WE ARE Tring to replace world with java
	 System.out.println("After replacing-->"+sb);
	 
	 //if i want to extract hello from hellojava in sb
	// sb.substring(0, 5);
	 //Return type is String and Return a string so we need to store in a variable,because we are extracting a part of the string
	 String sub=sb.substring(0, 5);//FOR SUBSTRING RETURN TYPE IS STRING AND SO STRING IS IMMUTABLE WE NEED TO STORE IT
	 System.out.println(sub);
	 
			 System.out.println("Another way is it will return a string and will use SOPLN and will print " + sb.substring(0, 5));
			 String sub1=sb.substring(5);
            System.out.println("Extracting  Hello from sb --> " +sub1);
            
            sb.reverse();
            System.out.println("reversing " +sb);
            char ch=sb.charAt(1);//It returns a character so weed to store in a char variable
            System.out.println("CharAt" + ch  );
			 
            System.out.println("Length of the sb-->"+sb.length());
            
            // CAPACITY METHOD --LET US KNOW THE NO OF CHARACTERS,DEFAULT CAPACITY IS 16
            StringBuilder sb4=new StringBuilder();
            System.out.println("Default Capacity-->" +sb4.capacity());
            sb4.append("Hello");
            System.out.println(" Capacity AFTER APPENDING-->" +sb4.capacity());
            
            
            //EnsureCapacity//ensur capacity take one argument and which is called AS Minimun Capacity
            StringBuilder sb5 = new StringBuilder();
            sb5.ensureCapacity(20);
           
            System.out.println("capacity after pending " +sb5.capacity);
            
}

}
   