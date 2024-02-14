// Define a sealed class A with two permitted subclasses: B and C
sealed class A permits B, C {
}

// Define a non-sealed class that extends sealed class A
non-sealed class B extends A {
}

// Define another non-sealed class C that extends sealed class A
non-sealed class C extends A {
}

// Define a regular class D
class D {
}

sealed interface X permits Y {
}

non-sealed interface Y extends X {
}

// Define a public class with a main method for executing the program
public class SealedClass {
    public static void main(String[] args) {
        // The main method is the entry point of a Java application
        // This is where the program starts executing
    }
}
