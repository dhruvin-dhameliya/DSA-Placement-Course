import java.util.*;

class Pattern_1 {

  public static void main(String args[]) {

    Scanner sc = new Scanner(System.in);
    System.out.print("Enter row: ");
    int column = sc.nextInt();
    System.out.print("Enter column: ");
    int row = sc.nextInt();

    for (int i = 0; i < row; i++) {
      for (int j = 0; j < column; j++) {
        System.out.print("* ");
      }
      System.out.println();
    }
  }
}