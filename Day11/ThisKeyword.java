public class ThisKeyword {
    private int myVariable;

    // Constructor
    public ThisKeyword(int myVariable) {
        // Use 'this' to refer to the instance variable
        this.myVariable = myVariable;
    }

    // Method to set the value of myVariable
    public void setMyVariable(int myVariable) {
        // Use 'this' to differentiate between instance variable and method parameter
        this.myVariable = myVariable;
    }

    // Method to display the value of myVariable
    public void displayMyVariable() {
        // Use 'this' to refer to the instance variable in this method
        System.out.println("myVariable: " + this.myVariable);
    }

    public static void main(String[] args) {
        // Create an instance of MyClass
        ThisKeyword myObject = new ThisKeyword(10);

        // Display the initial value of myVariable
        myObject.displayMyVariable();

        // Set a new value using the method
        myObject.setMyVariable(20);

        // Display the updated value of myVariable
        myObject.displayMyVariable();
    }
}
