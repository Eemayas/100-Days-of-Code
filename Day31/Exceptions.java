public class Exceptions {
    public static void main(String[] args) {
        int i = 4;
        int arr[] = { 3, 4, 5 };
        try {
            int j = 18 / i;
            System.out.println(arr[9]);
            System.out.println(j);
        } catch (ArithmeticException e) {
            System.err.println("Cannot Divide by zero");
        } catch (Exception e) {
            System.err.println("Error:\t" + e);
        }

        System.out.println("Hellosss");

    }
}
