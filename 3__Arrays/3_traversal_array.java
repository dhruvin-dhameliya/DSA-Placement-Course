class TraversalArray {

    public static void printNum(int a[]) {
        System.out.printf("[%d", a[0]);
        for (int i = 1; i < a.length; i++) {
            System.out.printf(", %d", a[i]);
        }
        System.out.println("]");
    }

    public static void printStr(String s[]) {
        System.out.printf("[%s", s[0]);
        for (int i = 1; i < s.length; i++) {
            System.out.printf(", %s", s[i]);
        }
        System.out.println("]");
    }

    public static void main(String[] args) {

        int a[] = { 11, 22, 33, 44, 55 };
        printNum(a);

        int b[] = a.clone(); // clone means a copy of array
        printNum(b);

        System.out.println("--------------------");

        String c[] = { "AA", "BB", "CC", "DD", "EE" };
        printStr(c);

        String d[] = c.clone();
        printStr(d);

        System.out.println("--------------------");

        c[1] = "Boll"; // it's only can chnage "C" array
        printStr(c);
        printStr(d);
    }
}
