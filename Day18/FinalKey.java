final class A{

}
// class B extends A{  //The type B cannot subclass the final class A

// }

class Calc {
    final public void show() {
        System.out.println("In calc Show()");
    }

    public void add(int n1, int n2) {
        System.out.println("Addition : " + (n1 + n2));
    }
}

class AdvCalc extends Calc {
    // public void show() {  //Cannot override the final method from Calc

    // }
}

public class FinalKey {

    public static void main(String[] args) {
        final int num = 0;
        // num =9; //error: cannot assign a value to final variable num
        Calc obj = new Calc();
        obj.add(2, 3);
    }
}