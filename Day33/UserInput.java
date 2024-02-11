import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) throws IOException {
        System.out.println("Enter the Number");

        // single digit input
        // try {
        // int num = System.in.read();
        // System.out.println(num);// prints ASCII value of entered character
        // System.out.println(num - 48);// print the actual value //will only work on
        // number
        // System.out.println((char) num); // print the char value
        // } catch (IOException e) {

        // e.printStackTrace();
        // }

        // // multiple digit input
        // InputStreamReader in = new InputStreamReader(System.in);
        // BufferedReader bf = new BufferedReader(in);

        // try {
        // int numbf = Integer.parseInt(bf.readLine());
        // System.out.println(numbf);
        // } catch (NumberFormatException e) {

        // e.printStackTrace();
        // } catch (IOException e) {

        // e.printStackTrace();
        // }

        // Scanner
        // Scanner scn = new Scanner(System.in);
        // System.out.print("Enter a number: ");
        // int num1 = scn.nextInt();
        // System.out.print("Enter another number: ");
        // double num2 = scn.nextDouble();
        // System.out.printf("%d %f", num1, num2); // will print 56 23.000000
        // scn.close();

        // // try with finally
        // InputStreamReader in = new InputStreamReader(System.in);
        // BufferedReader bf = new BufferedReader(in);

        // try {
        // int numbf = Integer.parseInt(bf.readLine());
        // System.out.println(numbf);
        // } finally {
        // if (bf != null)
        // bf.close(); // finally used to close the resources regardless Excpetion occur
        // or not
        // }

        // try with resources
        try (InputStreamReader in = new InputStreamReader(System.in);
                BufferedReader bf = new BufferedReader(in);) {
            int numbf = Integer.parseInt(bf.readLine());
            System.out.println(numbf);
        }
    }

}