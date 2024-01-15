public class Array {
    public static void main(String[] args) {
        // ⇒ content of the array is not known
        // ⇒ you cannot change the sized dynamically.
        // ⇒ initially all the value is 0.
        // ⇒ length is fixed
        int num1[] = new int[4];

        // ⇒ content of the array is known
        int num[] = { 1, 2, 3 };

        for (int i = 0; i < 3; i++) {
            System.out.println(num[i]);
        }
    }
}
