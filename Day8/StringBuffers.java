public class StringBuffers {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Prashant");

        System.out.println(sb.capacity()); // will print 24

        System.out.println(sb.length()); // will print 8

        System.out.println(sb.append(" Manandhar")); // will print Prashant Manandhar

        System.out.println(sb.insert(0, " Java ")); // will Java Prashant Manandhar

        System.out.println(sb.deleteCharAt(6)); // will print Java rashant Manandhar

        // Conversion of StringBuffer to String
        String ss = sb.toString();

    }
}
