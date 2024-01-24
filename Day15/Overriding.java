class Calc {
    public int add(int n1, int n2) {
        return n1 + n2;
    }

    public void config() {
        System.out.println("In class A ==>config()");
    }
}

class AdvCalc extends Calc {
    public int add(int n1, int n2) {
        return n1 + n2 + 2;
    }
}

public class Overriding {
    public static void main(String[] args) {
        AdvCalc obj = new AdvCalc();
        System.out.println(obj.add(5, 5));
    }
}
