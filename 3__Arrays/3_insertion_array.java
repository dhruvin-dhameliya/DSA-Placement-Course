import java.util.*;

class InsertionArray {

    static Scanner sc = new Scanner(System.in);
    static int arr[] = new int[10];
    static int size = 0;

    public static void createArray(int size) {
        for (int i = 0; i < size; i++) {
            System.out.print("Enter " + (i + 1) + "th number: ");
            arr[i] = sc.nextInt();
        }
        System.out.println("Original array: " + Arrays.toString(arr));
        System.out.println("Capacity: " + arr.length + "\tSize: " + size);
    }

    public static void insertNum(int number, int location) {
        if (size == arr.length) {
            System.out.println("Arrray is overflow, Insertion failed.");
            return;
        }
        if (location < 0 || location >= arr.length) {
            System.out.println("Array out of range, Insertion failed.");
            return;
        }
        // Insert element in array
        for (int i = size; i > location; i--) {
            arr[i + 1] = number;
        }
        arr[location] = number;
        System.out.println("Inserted Array: " + Arrays.toString(arr));
    }

    public static void main(String[] args) {
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        createArray(n);

        System.out.print("Inserting new number: ");
        n = sc.nextInt();
        System.out.print("At position: ");
        int pos = sc.nextInt();
        insertNum(n, pos);
    }
}