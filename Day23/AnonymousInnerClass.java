class A {
    void show() {
        System.out.println("in showA()");
    }
}

class AnonymousInnerClass {
    public static void main(String[] args) {
        A obj = new A() {
            // overridding with anonymous inner class
            void show() {
                System.out.println("Inside the anonymous inner class");
            }
        };
        obj.show();

        A obj1 = new A();
        obj1.show();
    }
}