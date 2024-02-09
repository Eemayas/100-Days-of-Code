// Normal interface for vehicles
interface Vehicle {
    void start(); // Method to start the vehicle

    void stop(); // Method to stop the vehicle
}

// Implementing the Vehicle interface with Car class
class Car implements Vehicle {
    @Override
    public void start() {
        System.out.println("Car started");
    }

    @Override
    public void stop() {
        System.out.println("Car stopped");
    }
}

// Functional interface for performing calculations
@FunctionalInterface
interface Calculator {
    int calculate(int a, int b); // Method to perform calculation
}

// Marker interface indicating printable objects
interface Printable {
}

// Implementing class for printable objects
class Book implements Printable {
    private String title; // Title of the book

    public Book(String title) {
        this.title = title;
    }

    // Method to print the book title
    public void print() {
        System.out.println("Printing book: " + title);
    }
}

// Main class to demonstrate interfaces and implementations
public class Interfaces {
    public static void main(String[] args) {
        Car car = new Car();
        car.start();
        car.stop();

        // Lambda expression implementing Calculator interface for addition
        Calculator addition = (a, b) -> a + b;
        System.out.println("Addition: " + addition.calculate(10, 20));

        // Lambda expression implementing Calculator interface for subtraction
        Calculator subtraction = (a, b) -> a - b;
        System.out.println("Subtraction: " + subtraction.calculate(50, 30));

        Book book = new Book("Java Programming");
        if (book instanceof Printable) {
            book.print();
        } else {
            System.out.println("Cannot print this object");
        }
    }
}
