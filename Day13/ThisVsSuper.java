// Every class in Java extends Object class
class A extends Object { // super class
    public A() {
        System.out.println("In constructor A");
    }

    public A(int n) {
        System.out.println("In Parameterized A");
    }
}

class B extends A {
    public B() {
        super(); // it is present even though you havenot mentioned
        System.out.println("In constructor B");
    }

    public B(int n) {
        // super(); //will call the default constructor of super class i.e A
        // super(n);// will call the parameterized constructor of super class i.e A
        this();
        System.out.println("In Parameterized B ");
    }
}

public class ThisVsSuper {
    public static void main(String[] args) {
        // B obj = new B();
        B obj1 = new B(5);
    }
}
