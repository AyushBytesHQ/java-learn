/**
 * darrays
 */
public class darrays {

    public static void main(String[] args) {

        // Declaration and allocation
        int[][] arr = new int[3][4];

        // Initialization
        int[][] brr = {
            {1, 2},
            {2, 3, 4},
            {3, 4, 4, 5, 4},
            {4, 5}
        };

        // Number of rows
        int rowLength = brr.length;

        // Traversing the 2D array
        for (int row = 0; row <= rowLength - 1; row++) {

            for (int col = 0; col <= brr[row].length - 1; col++) {
                System.out.print(brr[row][col] + " ");
            }

            System.out.println();
        }
    }
}