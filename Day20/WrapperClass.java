public class WrapperClass {
    public static void main(String[] args) {
        int num = 7;
        Integer num1 = new Integer(8);// boxing

        Integer num2 = 7; // autoboxing

        int num3 = num1.intValue(); // boxing

        int num4 = num1; // autounboxing

        System.err.println(num1);
        System.err.println(num2);
        System.err.println(num3);
        System.err.println(num4);

        String str = "12";
        int num5 = Integer.parseInt(str);
        System.err.println(num5);


        String str1=Integer.toString(23); //convert number into string
        System.err.println(str1);



    }

}