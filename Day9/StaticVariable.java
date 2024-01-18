class Mobile {
    String brand;
    int price;
    static String name;

    static {
        name = "Mobile";
        System.out.println("in Static");
    }

    public Mobile() {
        brand = "New Brand";
        price = 00;
        System.out.println("in a constructor");
    }

    public void show() {
        System.out.println(brand + " " + price + " " + name);
    }

    public static void show1(Mobile obj) {
        System.out.println(obj.brand + " " + obj.price + " " + name);
    }
}

public class StaticVariable {
    public static void main(String[] args) {
        Mobile obj1 = new Mobile();
        obj1.brand = "Apple";
        obj1.price = 1500;
        Mobile.name = "Smartphone";

        Mobile obj2 = new Mobile();
        obj2.brand = "Samsung";
        obj2.price = 1200;

        obj1.show();
        obj2.show();

        Mobile.show1(obj1);
        
        Class.forName("Mobile");
    }
}