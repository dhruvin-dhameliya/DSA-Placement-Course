import java.util.Scanner;

class ReverseArray {

    public static void main(String[] args) {

        int num[] = new int[5];

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array elements: ");

        for (int i = 0; i < num.length; i++) {
            num[i] = sc.nextInt();
        }

        System.out.print("\nYour array is: ");
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i] + " ");
        }

        System.out.print("\nReversed array is: ");
        for (int i = num.length - 1; i >= 0; i--) {  // only loop can execute reversed 
            System.out.print(num[i] + " ");
        }
    }
}
