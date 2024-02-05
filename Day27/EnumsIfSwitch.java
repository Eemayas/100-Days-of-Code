enum Status { // Java treats Status as class
    Running, Failed, Pending, Success; // treats as object of the class
}

class EnumsIfSwitch {
    public static void main(String[] args) {

        Status s = Status.Pending;
        if (s == Status.Running)
            System.out.println("All Good");
        else if (s == Status.Failed)
            System.out.println("Try Again");
        else if (s == Status.Pending)
            System.out.println("Please Wait");
        else
            System.out.println("Done");

        switch (s)

        {
            case Running:
                System.out.println("All Good");
                break;

            case Failed:
                System.out.println("Try Again");
                break;

            case Pending:
                System.out.println("Please Wait");
                break;

            default:
                System.out.println("Done");
                break;
        }
    }
}