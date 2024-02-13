import java.util.ArrayList; // Importing ArrayList class
import java.util.List; // Importing List interface
import java.util.Collections; // Importing Collections class
import java.util.Comparator; // Importing Comparator interface

class Student implements Comparable<Student> { // Defining a Student class that implements Comparable interface
    int age; // Declaring age variable
    String name; // Declaring name variable

    public Student(int age, String name) { // Constructor to initialize age and name
        this.age = age; // Initializing age
        this.name = name; // Initializing name
    }

    @Override
    public String toString() { // Overriding toString method to provide a meaningful representation of the
                               // object
        return "Student [age=" + age + ", name=" + name + "]"; // Returning a string representation of the object
    }

    @Override
    public int compareTo(Student that) { // Overriding compareTo method to define a natural ordering for Student objects
        if (this.age > that.age) { // If the age of the current object is greater than the age of the argument
                                   // object
            return 1; // Returning a positive value
        } else {
            return -1; // Otherwise, returning a negative value
        }
    }
}

public class ComparatorComparable { // Defining a ComparatorComparable class
    public static void main(String[] args) { // Main method
        List<Integer> nums = new ArrayList<Integer>(); // Creating a list of integers

        nums.add(45); // Adding an integer to the list
        nums.add(73); // Adding an integer to the list
        nums.add(79); // Adding an integer to the list
        nums.add(82); // Adding an integer to the list
        nums.add(23); // Adding an integer to the list
        nums.add(95); // Adding an integer to the list

        // Sorting the list of integers in ascending order
        Collections.sort(nums);
        System.out.println(nums);

        // Defining a custom comparator for integers based on the last digit
        Comparator<Integer> com = new Comparator<Integer>() {
            public int compare(Integer i, Integer j) { // Overriding compare method to define the custom ordering
                if (i % 10 > j % 10) { // If the last digit of the first integer is greater than the last digit of the
                                       // second integer
                    return 1; // Returning a positive value
                } else {
                    return -1; // Otherwise, returning a negative value
                }
            }
        };

        // Sorting the list of integers using the custom comparator
        Collections.sort(nums, com);
        System.out.println(nums);

        List<Student> studs = new ArrayList<Student>(); // Creating a list of Student objects
        studs.add(new Student(21, "Prashant")); // Adding a Student object to the list
        studs.add(new Student(12, "Navin")); // Adding a Student object to the list
        studs.add(new Student(18, "John")); // Adding a Student object to the list
        studs.add(new Student(20, "Parul")); // Adding a Student object to the list

        Comparator<Student> studscom = new Comparator<Student>() {
            public int compare(Student i, Student j) { // Overriding compare method to define the custom ordering
                if (i.age > j.age) { // If the age of the first Student object is greater than the age of the second
                                     // Student object
                    return 1; // Returning a positive value
                } else {
                    return -1; // Otherwise, returning a negative value
                }
            }
        };

        Comparator<Student> studscomlamda = (Student i, Student j) -> i.age > j.age ? 1 : -1;

        // Sorting the list of Student objects using the custom comparator
        Collections.sort(studs, studscom);
        for (Student stud : studs) // Printing the sorted list of Student objects
            System.out.println(stud);

        Collections.sort(studs, studscom); // Sorting the list of Student objects again
        for (Student stud : studs) // Printing the sorted list of Student objects
            System.out.println(stud);
    }
}