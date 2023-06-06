 package practice;

public class SwapStringPrac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      String str1="nitin";//Created a String variable/object to store the String literal or String value
      String str2="bro";////Created a String variable/object to store the String literal or String value
      String temp=str1;//Created a String Temporay variable to store thevalue of str1 to temp
      str1=str2;//initializing the str2 value to str1;
      str2=temp;//now assign back temp to str2
      System.out.println("swap two string: "+str1+" "+str2 );//if there is a gap between variable then only you will  get output like that and use +after string str1 and + after str1 if there is any string which you want to concatenate.
      
	}

}
