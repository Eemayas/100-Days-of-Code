class Calculator {

    int a;// instance variable ⇒ stored in heap

    // method declaration stored in heap but the defination is in their own stack
    public int add(int num1, int num2) {
        // num1 and num2 are local variable ⇒ stored in stack
        System.out.println("ADD");
        return num1 + num2;
    }

    // Overloading the add Function
    public int add(int num1, int num2, int num3) {
        System.out.println("ADD");
        return num1 + num2;
    }
}

public class Method {
    public static void main(String[] args) {
        // Calculator is called refrenced variable
        Calculator Cal = new Calculator();// stored in stack with address of new instance of Calculator in Heap

        int result = Cal.add(2, 3);

        System.out.println(result);

        result = Cal.add(2, 3, 7);

        System.out.println(result);
    }

}