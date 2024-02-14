// This is a Java code example that demonstrates the usage of the 'var' keyword,
// which is a new feature in Java 10 for type inference.

class VarTypes { // A class named 'VarTypes' is defined here.

    // 'var' cannot be used as a type name, so the following line is not valid:
    // var num = 80; // VarTypes.java:2: error: 'var' is not allowed here

    public static void main(String[] args) { // The 'main' method is defined here.
        var a = 9; // Here, 'var' is used to declare an integer variable 'a' and assign the value 9
                   // to it.
                   // This is valid in Java 10 and later versions.

        // The following line will result in a runtime error because 'var' cannot be
        // used on a variable
        // without an initializer.
        // var d;

        String var = "Prashant"; // Here, 'var' is not used, but a regular variable declaration is done.

        // Both of the following lines are the same, and they declare an array of
        // integers with a length of 10.
        int num[] = new int[10];
        var nums = new int[10];
    }
}