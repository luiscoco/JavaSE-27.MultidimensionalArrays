# JavaSE-27.MultidimensionalArrays

In Java, a multidimensional array is essentially an array of arrays. This allows you to create tables or matrices with rows and columns. 

Let's say you want to create a 2D array to represent a simple 3x3 matrix:

```java
public class MultidimensionalArrayExample {
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
```

In this example, int[][] matrix = new int[3][3]; declares a 2D array with 3 rows and 3 columns.

The nested loops are used to iterate through each element in the array, and values are assigned based on the row and column indices.

So, the output of this program would be:

```
0 1 2 
1 2 3 
2 3 4 
```

Here, each element in the matrix is the sum of its row and column indices.
