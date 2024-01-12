class DataTypes {
    public static void main(String a[]) {
        // // Data Types
        byte i = 3;
        int by = 127;
        short sh = 558;
        long lg = 5854l; // l is required at the end of the code to specify it is long type variable

        float ft = 7.2f;
        double db = 7.2;

        char c = 'k';

        boolean b = true;

        // literal
        int numBin = 0b101;
        System.out.println(numBin);// will print 5

        int numHex = 0x7E;
        System.out.println(numHex);// will print 126

        int numSep = 10_00_00_000;
        System.out.println(numSep);// will print 100000000

        double numExp = 12e10;
        System.out.println(numExp);// will print 1.2E11

        char ch = 'a';
        ch++;
        System.out.println(ch);// print b
    }
}