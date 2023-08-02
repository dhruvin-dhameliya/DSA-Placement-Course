// Parameterized Generic Class in Java.

class GC<T1, T2> {
    T1 t1;
    T2 t2;

    GC(T1 t1, T2 t2) {
        this.t1 = t1;
        this.t2 = t2;
    }

    public void printData() {
        System.out.println(t1);
        System.out.println(t2);
    }
}

class GC2Parameter {
    public static void main(String[] args) {
        GC<Integer, String> obj1 = new GC<Integer, String>(101, "Developer");
        obj1.printData();

        System.out.println("-------------");

        GC<String, Double> obj2 = new GC<String, Double>("Student", 75.46);
        obj2.printData();

        System.out.println("-------------");

        GC<String, String> obj3 = new GC<String, String>("SDE-1", "at Google");
        obj3.printData();
    }
}