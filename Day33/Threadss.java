class A extends Thread {
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("Hi");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
}

class B extends Thread {
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("Hello");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
}

public class Threadss {
    public static void main(String[] args) {
        A obj1 = new A();
        B obj2 = new B();

        System.err.println(obj1.getPriority());
        obj1.setPriority(10);
        obj1.setPriority(Thread.MIN_PRIORITY);

        System.err.println(obj1.getPriority());
        obj1.start();
        obj2.start();
    }
}
