import java.util.*;

class MatrixOperations {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int r1, c1, r2, c2;

        System.out.println("*** 1st MATRIX ***");
        System.out.print("Enter row: ");
        r1 = sc.nextInt();
        System.out.print("Enter column: ");
        c1 = sc.nextInt();

        int matrix1[][] = new int[r1][c1];
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                matrix1[i][j] = sc.nextInt();
            }
        }

        System.out.println("*** 2nd MATRIX ***");
        System.out.print("Enter row: ");
        r2 = sc.nextInt();
        System.out.print("Enter column: ");
        c2 = sc.nextInt();

        int matrix2[][] = new int[r2][c2];
        for (int i = 0; i < r2; i++) {
            for (int j = 0; j < c2; j++) {
                matrix2[i][j] = sc.nextInt();
            }
        }

        if (r1 == r2 && c1 == c2) {
            System.out.println("----- Add Matrix -----");
            int addMatrix[][] = new int[r2][c2];
            for (int i = 0; i < r2; i++) {
                for (int j = 0; j < c2; j++) {
                    addMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
                }
            }
            System.out.println("OUTOUT: ");
            for (int i = 0; i < r1; i++) {
                for (int j = 0; j < c1; j++) {
                    System.out.print(addMatrix[i][j] + " ");
                }
                System.out.println();
            }
        } else {
            System.out.println("Can't add two matrices, case of different sizes.");
        }
    }
}