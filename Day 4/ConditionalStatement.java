public class ConditionalStatement {
    public static void main(String[] args) {

        int x = 8;
        int y = 7;
        int z = 6;
        // Java doesnot depend upon indentation

        // If-else
        if (x <= 10)
            System.out.println("Value of x is less than or equal to 10");
        else
            System.out.println("Value of x is greater than 10");

        // if-else-if
        if (x > y && x > z)
            System.out.println("Value of x is greater than both y and z");
        else if (y > z)
            System.out.println("Value of y is greater than both x and z");
        else
            System.out.println("Value of z is greater than both x and y");

        // ternary operators
        String result = (x % 2 == 0) ? "Even" : "Odd";
        System.out.println("The number is: " + result);

        // switch
        // if break is missing and value of n=1 the it will print
        // Sunday
        // Monday
        // Tuesday
        // Wednesday
        // Thusday
        // Friday
        // Saturday
        int n = 1;
        switch (n) {
            case 1:
                System.out.println("Sunday");
                // break;
            case 2:
                System.out.println("Monday");
                // break;
            case 3:
                System.out.println("Tuesday");
                // break;
            case 4:
                System.out.println("Wednesday");
                // break;
            case 5:
                System.out.println("Thusday");
                // break;
            case 6:
                System.out.println("Friday");
                // break;
            case 7:
                System.out.println("Saturday");
                // break;

            default:
                // will execute only if no case is matched
                break;
        }

        // New-Switch

        String day = "Monday";
        switch (day) {
            case "Saturday", "Sunday":
                System.out.println("Alram at 6am");
                break;

            case "Monday":
                System.out.println("Working Day, Alarm at 8am");
                break;
            default:
                System.out.println("Alarm at 7 am");
                break;
        }

        switch (day) {
            case "Saturday", "Sunday" ->
                System.out.println("Alram at 6am");
            case "Monday" ->
                System.out.println("Working Day, Alarm at 8am");
            default ->
                System.out.println("Alarm at 7 am");
        }

        // switch as expression
        String alram = switch (day) {
            case "Saturday", "Sunday" -> "Alram at 6am";
            case "Monday" -> "Working Day, Alarm at 8am";
            default -> "Alarm at 7 am";
        };
        System.out.println(alram);

        // -> can be replaced by :yield
        String alram1 = switch (day) {
            case "Saturday", "Sunday":
                yield "Alram at 6am";
            case "Monday":
                yield "Working Day, Alarm at 8am";
            default:
                yield "Alarm at 7 am";
        };
        System.out.println(alram1);
    }
}
