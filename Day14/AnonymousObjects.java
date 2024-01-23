class A {
    public A() {
        System.out.println("object created");
    }

    public void show() {
        System.out.println("in A show");
    }
}

public class AnonymousObjects {
    public static void main(String a[]) {
        int marks;
        marks = 99;

        new A(); // anonymous object //no way of reusing this kind of object.
        new A().show();

        // A obj=new A();
        A obj;// reference creation
        obj = new A(); // creating an object and assiging the value

        obj.show();
    }
}