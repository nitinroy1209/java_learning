package assignments;
public class StringImmutableExample {
    public static void main(String[] args) {
        String str1 = "Hello";
        str1.concat(" World");

        System.out.println("str1: " + str1); // Output: Hello
        //System.out.println("str2: " + str2); // Output: Hello World
    }
}
