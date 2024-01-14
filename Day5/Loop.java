public class Loop {
    public static void main(String[] args) {
        int i = 0;

        while (i <= 5) {
            System.out.println("Hi" + i);
            i++;
        }
        do {
            System.out.println("Hi" + i);
            i++;
        } while (i <= 5);
        

        //for loop
        for (int j = 1; j <= 6; j++) {
            System.out.println("Hi" + j);
        }
    }
}
