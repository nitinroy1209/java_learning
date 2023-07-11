package assignments;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class ListAssignment {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(20);
        numbers.add(40);
        numbers.add(50);
        numbers.add(40);
        numbers.add(70);
        numbers.add(70);
        numbers.add(10);
        numbers.add(15);

        // Create a HashSet to store unique elements
        HashSet<Integer> uniqueNumbers = new HashSet<>(numbers);

        // Convert the HashSet back to a list
        List<Integer> uniqueElements = new ArrayList<>(uniqueNumbers);

        // Print the unique elements
        for (Integer element : uniqueElements) {
            System.out.println(element);
        }
    }
}
