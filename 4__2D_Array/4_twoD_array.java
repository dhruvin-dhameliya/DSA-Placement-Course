import java.util.*;

class TwoDArray {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter number of ROW: ");
        int row = sc.nextInt();

        System.out.print("Enter number of COLUMN: ");
        int column = sc.nextInt();

        System.out.println("Enter array elements: ");
        int matrix[][] = new int[row][column];

        // input form user
        for(int i=0; i<row; i++) {
            for(int j=0; j<column; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        // display matrix
        for(int i=0; i<row; i++){
            for(int j=0; j<column; j++) {
                System.out.print(matrix[i][j] + "|");
            }
            System.out.println();
        }
    }
}


