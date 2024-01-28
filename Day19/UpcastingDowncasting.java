class A {
    public void show1() {
        System.out.println("In show A");
    }
}

class B extends A {
    public void show2() {
        System.out.println("In show B");
    }
}

public class UpcastingDowncasting {
    public static void main(String[] args) {
        double d = 4.5;
        int i = (int) d; // explicit typecasting

        int i1 = 5;
        double d1 = i1; // implicit type conversion

        System.out.println(i);

        A obj = (A) new B(); // upcasting
        obj.show1();

        A obj1 = new B(); // upcasting
        // obj1.show2(); // you get error and you are not able to call show2() because
        // with parennts reference specialised method of child is not visible here we
        // downcastig to use show2() method
        ((B) obj).show2(); // downcasting
    }
}
