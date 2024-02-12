// A simple class with a single integer field 'count' and a synchronized method 'increment' to increase the count by 1
class Counter {
    int count; // This is an integer field named 'count'

    public synchronized void increment() { // A synchronized method to ensure thread safety
        count++; // Increase the count by 1
    }
}

// A class to demonstrate the race condition problem
public class RaceCondition {

    public static void main(String[] args) throws InterruptedException { // The main method from where the execution
                                                                         // begins

        Counter c = new Counter(); // Create an instance of the Counter class

        // Two runnable objects created for two threads to execute the increment method
        // concurrently
        Runnable obj1 = () -> {
            for (int i = 1; i <= 1000; i++) {
                c.increment(); // Call the increment method
            }
        };

        Runnable obj2 = () -> {
            for (int i = 1; i <= 1000; i++) {
                c.increment(); // Call the increment method
            }
        };

        Thread t1 = new Thread(obj1); // Create a new thread for the first runnable object
        Thread t2 = new Thread(obj2); // Create a new thread for the second runnable object

        t1.start(); // Start the first thread
        t2.start(); // Start the second thread

        t1.join(); // Wait for the first thread to finish execution
        t2.join(); // Wait for the second thread to finish execution

        System.out.println(c.count); // Print the final value of the 'count' field
    }
}