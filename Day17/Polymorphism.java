class A {
    public void show() {
        System.out.println("in show A");
    }
}

class B extends A {
    public void show() {
        System.out.println("in show B");
    }
}

class C extends A {
    public void show() {
        System.out.println("in show C");
    }
}

class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("Dog barks");
    }
}

// Example of method overloading:
class Calculator {
    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }
}

public class Polymorphism {
    public static void main(String[] args) {
        A obj = new A();
        obj.show(); // Output: in show A

        obj = new B(); // reference is A (we can use reference of parents) and create object of B and
                       // assign to parents reference variable.
        obj.show(); // Output: in show B

        obj = new B(); // reference is A (we can use reference of parents) and create object of C and
                       // assign to parents reference variable.
        obj.show(); // Output: in show C

        // Example of run-time polymorphism:
        Animal animal = new Dog();
        animal.sound(); // This will call the sound() method of the Dog class

    }
}
