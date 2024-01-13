public class LogicalOperators {
    public static void main(String[] args) {
        int x = 7;
        int y = 5;
        int a = 5;
        int b = 9;

        boolean result = x > y && a < b;
        System.out.println("The logical AND operator: " + result);// true

        result = x > y || a < b;
        System.out.println("The logical OR operator: " + result);// true

        System.out.println("The logical NOT operator: " + !result);// false
    }
}
