import java.util.*;

class ArraySorting {
    public static void main(String[] args) {

        int arr[] = { 14, 20, 10, 15, 35 };

        // default sorting method with specific length of index
        Arrays.sort(arr, 1, 4);
        System.out.println("Sort-1: " + Arrays.toString(arr));

        // default sorting method
        Arrays.sort(arr);
        System.out.println("Sort-2: " + Arrays.toString(arr));

        // Parallel sorting if more faster than other sorting methods
        Arrays.parallelSort(arr);
        System.out.println("Sort-3: " + Arrays.toString(arr));
    }
}
