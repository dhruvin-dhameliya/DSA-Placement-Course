import java.util.*;

class ArraysMethods {
    public static void main(String[] args) {

        int numarr[] = { 10, 20, 30, 40, 50 };

        // convert elements as list
        System.out.println("Array convert into List: " + Arrays.asList(numarr));
        // to get thre Stream from the array
        System.out.println("Aray Stream: " + Arrays.stream(numarr));
        // print array elements
        System.out.println("ORIGINAL Array: " + Arrays.toString(numarr));

        // when we use 2d arrays and we print array elements, it can use deepToString().
        int narr2[][] = { { 10 }, { 20 }, { 11, 22, 33 }, { 30 }, { 40 } };
        System.out.println("Nested Arrays: " + Arrays.deepToString(narr2));

        // copy arrays into onthor array with different sizes
        System.out.println("Original arrays: " + Arrays.toString(numarr));
        int copyarr[] = Arrays.copyOf(numarr, 10); // here 10 length of array
        System.out.println("Copy arrays: " + Arrays.toString(copyarr));

        // sub array can copy using copyOfRange() method.
        int copyarr2[] = Arrays.copyOfRange(numarr, 1, 3); // here 3 is not considered
        System.out.println("Copy of sub-array: " + Arrays.toString(copyarr2));

        int arr1[][] = { { 10, 20, 30 }, { 1 }, { 2 } };
        int arr2[][] = { { 10, 20, 30 }, { 11 }, { 22 } };
        // Compare two array including same elements & same no. of elements
        System.out.println("Array same: " + Arrays.deepEquals(arr1, arr2));

        // it can give a hase-code value of each element and value can be unique
        System.out.println("1D hase-code: " + Arrays.hashCode(numarr));
        System.out.println("2D hase-code: " + Arrays.deepHashCode(arr1));

        int numarrkey = 200;
        Arrays.fill(numarr, numarrkey);
        // it can fill default values in arrays
        System.out.println("Filling arrays is: " + Arrays.toString(numarr));
    }
}
