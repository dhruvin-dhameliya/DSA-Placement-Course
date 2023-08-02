import java.util.*;

class Exercise_Q_1 {

    public static int averageCalc(int a, int b, int c) {
        int ans = (a + b + c) / 3;
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 1st number: ");
        int n1 = sc.nextInt();

        System.out.print("Enter 2nd number: ");
        int n2 = sc.nextInt();

        System.out.print("Enter 3rd number: ");
        int n3 = sc.nextInt();

        System.out.println("Average number is: " + averageCalc(n1, n2, n3));
    }

}