// Simple diclaration of Arrays

class ArrayBasic {

  public static void main(String[] args) {

    // 2D ARRAY

    // 1st method
    int num[];
    num = new int[5];
    num[1] = 32;
    System.out.println(num[1]);

    // 2nd method
    float ruppes[] = new float[3];
    ruppes[0] = 81.44F;
    ruppes[1] = 98.37F;
    ruppes[2] = 74.00F;
    System.out.println(ruppes[1]);

    // 3rd method
    String str[][] = { { "Dhrvin", "Dhameliya" }, null, { "Arjun", "Suhagiya" } };
    System.out.println(str[0][1]);

    // 3D ARRAY (it use a row, column, and width)
    double marks[][][] = new double[2][4][10]; // here write max length of array
    marks[1][2][8] = 10;
    System.out.println(marks[1][2][8]);

    // CUSTOME ARRAY
    int customeArray[][] = { { 10, 20 }, { 30, 40 }, null, { 50, 60 }, null };
    customeArray[2] = new int[15]; // second row in we insert 15 number of collumn
    customeArray[2][11] = 99; // here 2 row & 11 comlum value stored case of max column is 15
    System.out.println("Custome array value is: " + customeArray[2][11]);
  }

}
