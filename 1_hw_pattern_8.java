import java.util.*;

class HW_Pattern_8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter step number: ");
        int num = sc.nextInt();

        for (int i = 1; i <= num; i++) {
            for (int j = num; j >= i; j--) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}