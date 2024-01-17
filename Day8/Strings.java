public class Strings {
    public static void main(String[] args) {
        String name = "Prashant";
        System.out.println(name);

        String name1 = new String("Prashant");
        System.out.println(name1);

        System.out.println(name1.hashCode());// Returns a hash code for this string. The hash code for a String object
                                             // is computed as
                                             // s[0]*31^(n-1) + s[1]*31^(n-2) + ... + s[n-1]

        System.out.println(name1.charAt(0)); // will print P

        System.out.println(name1.concat(" Manandhar"));

        String name3 = "Prashant";
        String name4 = "Prashant";
        // Here,the only one of the object is created in string constant pool in heap
        // and name3 and name4 are the reference to that object address in the heap

        name3 = name3 + " Manandhar";

    }
}
