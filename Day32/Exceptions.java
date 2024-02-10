class EemayasException extends Exception {
    public EemayasException(String string) {
        super(string);
    }
}

public class Exceptions {
    public static void main(String[] args) {
        int i = 19;
        int j = 0;
        int arr[] = { 3, 4, 5 };
        try {
            j = 18 / i;
            if (j == 0) {
                throw new EemayasException("Custom Exception:Value is Zero");
            }
        } catch (EemayasException e) {
            j = 18 / 1;
            System.err.println("Custom Exception Catch Block\t" + e);
        } catch (Exception e) {
            System.err.println("Error:\t" + e);
        }

        System.out.println("Hellosss");

    }
}
