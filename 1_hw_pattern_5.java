import java.util.*;

class HW_Pattern_5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter row: ");
        int row = sc.nextInt();

        System.out.print("Enter column: ");
        int column = sc.nextInt();

        for (int i = 1; i <= row; i++) {
            for (int j = column - 1; j >= i; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= column; j++) {
                if (i == 1 || j == 1 || i == row || j == column) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
}