import java.util.*;

class HW_Pattern_4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = sc.nextInt();

        // Upper part
        for (int i = 1; i <= num; i++) {
            // 1st part print star
            for (int j = 1; j <= i; j++) {
                if (j == 1 || j == i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            // space print
            for (int j = 1; j <= (2 * (num - i)); j++) {
                System.out.print(" ");
            }
            // 2nd part print star
            for (int j = 1; j <= num; j++) {
                if (j == 1 || j == i) {

                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        for (int i = num; i >= 1; i--) {
            // 1st part print star
            for (int j = 1; j <= num; j++) {
                if (j == 1 || j == i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            // space print
            for (int j = 1; j <= (2 * (num - i)); j++) {
                System.out.print(" ");
            }
            // 2nd part print star
            for (int j = 1; j <= num; j++) {
                if (j == 1 || j == i) {

                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
