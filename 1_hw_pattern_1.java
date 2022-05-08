import java.util.*;

class HW_Pattern_1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter step number: ");
        int num = sc.nextInt();

        // Logic - 1
        for (int i = 1; i <= num; i++) {
            for (int j = num - 1; j >= i; j--) { // (num-1) to 1
                System.out.print(" ");
            }
            for (int j = 1; j <= num; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();

        // Logic - 2
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num - i; j++) { // 1 to (num-i)
                System.out.print(" ");
            }
            for (int j = 1; j <= num; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}