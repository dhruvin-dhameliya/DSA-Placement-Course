import java.util.*;

class HWtwoDArray {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of row: ");
        int row = sc.nextInt();

        System.out.print("Enter number of column: ");
        int column = sc.nextInt();

        System.out.print("Enter matrix elements: \n");
        int matrix[][] = new int[row][column];

        // input for matrix
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("------ OUTPUT ------");

        // output of matrix
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        System.out.print("Search number: ");
        int search_no = sc.nextInt();

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                if (matrix[i][j] == search_no) {
                    System.out.println("Number is found at index: (" + i + "," + j + ")");
                }
            }
        }

    }

}