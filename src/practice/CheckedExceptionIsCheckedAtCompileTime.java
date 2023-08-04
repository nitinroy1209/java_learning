package practice;

public class CheckedExceptionIsCheckedAtCompileTime {
// can use throws or use try catch block
	public static void main(String[] args) throws FileNotFoundException{
		// TODO Auto-generated method stub
		//once throw is used in main method the program dies immediately all i see is stack trace line while compiling
		readFile(myfile.txt);
		//file notfound exception at compiletime

	}
	private static void readFile(String fileName) throws FileNotFoundException
	
	FileReader reader = new FileReader(fileName);//since this line was throwing exception i have declare throws write before the curly braces in function
// after that where we are calling the method it is causing error
// here now ecxeption is get thrown to where it is called since here it is not causing exception after using throws keyword

}


