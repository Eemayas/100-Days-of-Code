public class Inheritance {
    public static void main(String[] args) {
        VAdvCalc obj = new VAdvCalc();

        System.out.println("Addition :\t" + obj.add(5, 6));
        System.out.println("Substraction :\t" + obj.sub(5, 6));
        System.out.println("Multiplication :\t" + obj.multi(5, 6));
        System.out.println("Division :\t" + obj.div(5, 6));
        System.out.println("Power :\t" + obj.power(5, 6));

        // + " " + obj.sub(6, 5));
    }
}
