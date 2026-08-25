/**
 * darrays
 */
public class darrays {

    public static void main(String[] args) {

        // Jagged 2D array
        int[][] brr = {
            {1, 2},
            {2, 3, 4},
            {3, 4, 4, 5, 4},
            {4, 5}
        };

        // Number of rows
        int rowLength = brr.length;

        // Traversing the jagged array
        for (int row = 0; row < rowLength; row++) {

            for (int col = 0; col < brr[row].length; col++) {
                System.out.print(brr[row][col] + " ");
            }

            System.out.println();
        }
    }
}