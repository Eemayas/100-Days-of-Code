class A {
    int age;

    public void show() {
        System.out.println("in show");
    }

    class C {
        public void config() {
            System.out.println("in config C");
        }
    }

    static class B {
        public void config() {
            System.out.println("in config static B");
        }
    }
}

public class InnerClass {
    public static void main(String[] args) {
        A obj = new A();
        obj.show();

        A.C obj2 = obj.new C();
        obj2.config();

        A.B obj1 = new A.B();
        obj1.config();

    }
}
