import java.util.ArrayList;

public class DifferenceArraysArrayLists {
    public static void main(String[] args) {
        System.out.println("Array Example:");
        arrayExample();
        
        System.out.println("\nArrayList Example:");
        arrayListExample();
    }
    
    public static void arrayExample() {
        // Declare and initialize an array
        int[] numbers = new int[5];
        
        // Assign values
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
        numbers[3] = 4;
        numbers[4] = 5;
        
        // Access and print elements
        System.out.println("Third element: " + numbers[2]);
        
        // Iterate through the array
        System.out.println("All elements:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
        System.out.println("Array length: " + numbers.length);
    }
    
    public static void arrayListExample() {
        // Declare and initialize an ArrayList
        ArrayList<Integer> numbers = new ArrayList<>();
        
        // Add elements
        numbers.add(10);
        numbers.add(9);
        numbers.add(8);
        numbers.add(7);
        numbers.add(6);
        
        // Access and print elements
        System.out.println("Third element: " + numbers.get(2));
        
        // Iterate through the ArrayList
        System.out.println("All elements:");
        for (int number : numbers) {
            System.out.println(number);
        }
        
        // ArrayLists can dynamically resize while Arrays are a fixed size
        numbers.add(5); // This is fine, ArrayList grows automatically
        
        // Remove an element
        numbers.remove(1); // Removes the element at index 1
        
        System.out.println("After removing second element:");
        System.out.println(numbers);
        
        // Get the size of the ArrayList
        System.out.println("Size of ArrayList: " + numbers.size());
    }
}
