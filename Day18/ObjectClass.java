class Laptop {
    String model;
    int price;
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((model == null) ? 0 : model.hashCode());
        result = prime * result + price;
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Laptop other = (Laptop) obj;
        if (model == null) {
            if (other.model != null)
                return false;
        } else if (!model.equals(other.model))
            return false;
        if (price != other.price)
            return false;
        return true;
    }


    
    // public boolean equals(Laptop that) {
    //     // return this.model == that.model && this.price == that.price ? true : false;
    //     return this.model.equals(that.model) && this.price == that.price ? true : false;

    // }
}

public class ObjectClass {
    public static void main(String[] args) {
        Laptop obj = new Laptop();
        obj.model = "Acer";
        obj.price = 180000;

        Laptop obj1 = new Laptop();
        obj1.model = "Acer";
        obj1.price = 180000;

        // System.out.println(obj); by default call System.out.println(obj.toString());
        System.out.println(obj); // will print Laptop@5acf9800
        System.out.println(obj.toString()); // will print Laptop@5acf9800

        System.out.println(obj.equals(obj1));
    }
}
