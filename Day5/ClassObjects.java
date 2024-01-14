class Calculator {

    int a;

    public int add(int num1, int num2) {
        System.out.println("ADD");
        return num1 + num2;
    }
}

public class ClassObjects {
    public static void main(String[] args) {
        // Calculator is called refrenced variable
        Calculator Cal = new Calculator();

        int result = Cal.add(2, 3);

        System.out.println(result);
    }

}
