public class MultidimensionalArrays {
    public static void main(String[] args) {
        // Declare and initialize a 2D array
        int[][] matrix = new int[3][3];

        // Populate the matrix with values
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrix[i][j] = i + j;
            }
        }

        // Access and print values from the matrix
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println(); // Move to the next row after printing each row
        }
    }
}
