abstract class A {
    abstract void show();
}

class AbstractAndAnonymousClass {
    public static void main(String[] args) {
        // here we are not creating the object of abstract class but the object of the inner class
        A obj = new A() {
            // overridding with anonymous inner class
            void show() {
                System.out.println("Inside the anonymous inner class");
            }
        };
        obj.show();

        // A obj1 = new A(); // cannot call this beacuse of the abstract class
        // obj1.show();
    }
}