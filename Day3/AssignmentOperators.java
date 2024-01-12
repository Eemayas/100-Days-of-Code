public class AssignmentOperators {
    public static void main(String[] args) {
        int num1 = 7;
        int num2 = 5;
        int result = num1 + num2;
        System.out.println("Addition: " + result);

        int division = num1 / num2;
        int remainder = num1 % num2;
        System.out.println("Division :" + division + " and Remainder :" + remainder); // will print Division :1 and
                                                                                      // Remainder :2

        int num3 = 7;
        num3 += 4; // same as num3 = num3 + 4
        System.out.println("After adding 4 to num3, the value of num3 is " + num3);// will print 11

        // post-increment;
        int num4 = 8;
        int result1 = num4++;
        System.out.println("Post-increment\n Result: " + result1 + " & num4: " + num4); // will print Result: 8 & num4:
                                                                                        // 9

        // pre-increment
        int num5 = 8;
        int result2 = ++num5;
        System.out.println("Pre-increment\n Result: " + result2 + " & num4: " + num5); // will print Result: 9 & num4: 9
    }
}
