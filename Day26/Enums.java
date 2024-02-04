enum Status { // Java treats Status as class
    Running, Failed, Pending, Success; // treats as object of the class
}

public class Enums {
    public static void main(String[] args) {
        Status s = Status.Failed;
        System.out.println("Status is " + s); // prints: Status is Failed

        System.out.println(s.ordinal()); // method is used to get the index of the name constant present in the enum.

        Status[] ss = Status.values(); // method is used to get all the statuses or name constants of enums.
        System.out.println(ss);

        // print all the const in enums and ordinals
        for (Status s1 : ss) {
            System.out.println(s1 + ":\t" + s1.ordinal());
        }
    }
}
