public class MultiDimensionArray {
    public static void main(String[] args) {
        int nums[][] = new int[3][4];

        for (int i = 0; i < 3; i++) { // number of row
            for (int j = 0; j < 4; j++) { // number of column
                int random = (int) (Math.random() * 100);
                nums[i][j] = random;
            }
        }

        for (int i = 0; i < 3; i++) { // number of row
            for (int j = 0; j < 4; j++) { // number of column
                System.out.print(nums[i][j] + "\t");
            }
            System.out.println("");
        }
        System.out.println("----------------------------");

        for (int n[] : nums) {
            for (int m : n) {
                System.out.print(m + "\t");
            }
            System.out.println("");
        }
        System.out.println("----------------------------");

        int numj[][] = new int[3][]; // jagged array

        numj[0] = new int[3];
        numj[1] = new int[4];
        numj[2] = new int[2];

        for (int i = 0; i < numj.length; i++) { // number of row
            for (int j = 0; j < numj[i].length; j++) { // number of column
                int random = (int) (Math.random() * 100);
                numj[i][j] = random;
            }
        }

        for (int n[] : numj) {
            for (int m : n) {
                System.out.print(m + "\t");
            }
            System.out.println("");
        }
        System.out.println("----------------------------");


        //3D array
        int num3d[][][]=new int[3][3][3];
    }
}
