import java.util.*;

class DeletionArray {

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

    public static void deleteNum(int size, int location) {
        if (size == arr.length) {
            System.out.println("Arrray is overflow, Insertion failed.");
            return;
        }
        if (location < 0 || location >= arr.length) {
            System.out.println("Array out of range, Insertion failed.");
            return;
        }
        // Delete element in array
        for (int i = location; i < size; i++) {
            arr[i] = arr[i + 1];
        }
        arr[size] = 0;
        size--;
        System.out.println("NEW Deleted Array: " + Arrays.toString(arr));
        System.out.println("NEW Capacity: " + arr.length + "\tSize: " + size);

    }

    public static void main(String[] args) {
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        createArray(n);

        System.out.print("At position: ");
        int pos = sc.nextInt();
        deleteNum(n, pos);
    }
}