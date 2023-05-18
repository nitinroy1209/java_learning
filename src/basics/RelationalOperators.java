package basics;

public class RelationalOperators {

	public static void main(String[] args)
	{
		int a=10;
		int b = 15;

		if (a > b) {
            System.out.println( "a is greater than b " + (a > b));
        }

        if (a < b) {
            System.out.println("a is less than b " + (a < b));
        }

        if (a >= b) {
            System.out.println("a is greater than or equal to b " + (a >= b));
        } else {
            System.out.println("a is not greater than or equal to b " + (a >= b));
        }

        if (a <= b) {
            System.out.println("a is less than or equal to b " + (a <= b));
        } else {
            System.out.println("a is not less than or equal to b " + (a <= b));
        }

        if (a == b) {
            System.out.println("a is equal to b " + (a == b));
        } else {
            System.out.println("a is not equal to b " + (a == b));
        }

        if (a != b) {
            System.out.println("a is not equal to b" + (a != b));
        } else {
            System.out.println("a is equal to b" + (a != b));
        }
    }
}