public class TypeConversion {
    public static void main(String[] args) {
        byte b = 127;
        int a = 257;

        // casting(explicitly)
        b = (byte) a;
        System.out.println(b); // will print 1 as a* range of byte==>257%256

        // conversion(implicitly)
        a = b;
        System.out.println(a);

        float f = 5.6f;
        int x1 = (int) f; // will lose the value after the point
        System.out.println(x1); // will print 5

        // Type Promotion
        byte b1 = 10;
        byte b2 = 30;
        int result = b1 * b2;
        System.out.println("Type promotion example : " + result);// will print 30
    }
}
