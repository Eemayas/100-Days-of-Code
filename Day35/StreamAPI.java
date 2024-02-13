import java.util.Arrays; // Import the Arrays class from the java.util package
import java.util.List; // Import the List interface from the java.util package
import java.util.stream.Stream; // Import the Stream interface from the java.util.stream package

public class StreamAPI { // Begin the StreamAPI class
   public static void main(String[] args) { // Begin the main method
       List<Integer> nums = Arrays.asList(4, 5, 9, 8, 6, 3); // Create a list of integers

       int sum = 0; // Initialize a sum variable
       for (int n : nums) { // Iterate through the list of integers
           if (n % 2 == 0) { // If the number is even
               n = n * 2; // Multiply the number by 2
               sum += n; // Add the number to the sum
           }
       }
       System.out.println(nums); // Print the original list of integers
       System.out.println("-----------------"); // Print a line to separate the output
       System.out.println(sum); // Print the sum
       System.out.println("-----------------"); // Print a line to separate the output
       nums.forEach(n -> System.out.println(n)); // Iterate through the list of integers and print each one

       Stream<Integer> s1 = nums.stream(); // Create a stream from the list of integers
       // s1.forEach(n->System.out.println(n)); // Uncomment this line to print the stream (this will cause an error since a stream can only be consumed once)
       Stream<Integer> s2 = s1.filter(n -> n % 2 == 0); // Create a new stream that only contains even numbers
       System.out.println("-----------------"); // Print a line to separate the output
       s2.forEach(n -> System.out.println(n)); // Iterate through the stream of even numbers and print each one

       int result = nums.stream() // Create a stream from the list of integers
               .filter(n -> n % 2 == 0) // Create a new stream that only contains even numbers
               .map(n -> n * 2) // Multiply each number in the stream by 2
               .reduce(0, (c, e) -> c + e); // Calculate the sum of all the numbers in the stream
       System.out.println("-----------------"); // Print a line to separate the output
       System.out.println(result); // Print the sum of all the even numbers multiplied by 2

       
   }
} 