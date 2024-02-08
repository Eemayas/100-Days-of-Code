@FunctionalInterface
interface A {
    void show(int i);
}

@FunctionalInterface
interface B {
    int add(int i, int j);
}

public class Lambda {
    public static void main(String[] args) {

        // // code without lymbda
        // A obj = new A() {
        // public void show() {
        // System.out.println("in Show");
        // }
        // };

        // // Code with lymda and their variation
        // A obj = (int i) -> {
        // System.out.println("in Show" + i);
        // };

        // // Removing the Curly bracket and the data type of formal parameter
        // A obj = (i) -> System.out.println("in Show" + i);

        // if you have only one paramter you can simply write like this
        A obj = i -> System.out.println("in Show" + i);

        obj.show(2);

        // // code without lymbda
        // B obj1 = new B() {
        // public int add(int i, int j) {
        // return i + j;
        // }
        // };

        // // Code with lymda with return value
        B obj1 = (int i, int j) -> i + j;

        int result = obj1.add(8, 9);
        System.out.println("The sum is " + result);
    }
}
