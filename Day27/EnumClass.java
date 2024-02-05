enum Laptops {
    Macbook(2000), XPS(), Surface(1500), ThinkPad(1800);

    private int price;

    private Laptops() {
        price = 0; // default value for uninitialized fields
    }

    private Laptops(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

}

public class EnumClass {
    public static void main(String[] args) {

        Laptops lap = Laptops.Macbook;

        System.out.println(lap);
        System.out.println(lap.getPrice());

        for (Laptops l : Laptops.values()) {
            System.out.println(l + "\t" + l.getPrice());
        }
    }
}
