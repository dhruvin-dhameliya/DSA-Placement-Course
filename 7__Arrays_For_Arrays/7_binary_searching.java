import java.util.*;

class BinarySearching {

    public static void main(String[] args) {

        int myArr[] = { 10, 20, 15, 22, 35 }; // not sorted
        // make sure 1st array can be sorted, when use a binary search method.
        Arrays.sort(myArr);
        int findNum = 22;

        System.out.println(findNum + " is found at index " + Arrays.binarySearch(myArr, findNum));
        // it can find only given range of array index
        System.out.println(findNum + " is found at index " + Arrays.binarySearch(myArr, 2, 4, findNum));

    }
}
