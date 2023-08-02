import java.util.ArrayList;

class MyGenericClass<T1> {

    int id;
    String name;
    private T1 t1;

    // create a constructor
    public MyGenericClass(int id, String name, T1 t1) {
        this.id = id;
        this.name = name;
        this.t1 = t1;
    }

    // create a getter & setter methods

    public int getId() { // getter method
        return id;
    }

    public void setId(int id) { // setter method
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public T1 getT1() {
        return t1;
    }

    public void setT1(T1 t1) {
        this.t1 = t1;
    }
}

class MainClass {
    public static void main(String[] args) {
        // created integer arraylist and only can pass integer values
        ArrayList<Integer> obj1 = new ArrayList<Integer>();
        obj1.add(10);
        obj1.add(20);
        int num1 = obj1.get(0);
        int num2 = obj1.get(1);
        System.out.print(num1 + "|" + num2);

        System.out.println();

        // created string arraylist and only can pass string values
        ArrayList<String> obj2 = new ArrayList<String>();
        obj2.add("Hello ");
        obj2.add("Developers!");
        obj2.add("@Dhruvin");

        String str1 = obj2.get(0);
        String str2 = obj2.get(1);
        String str3 = obj2.get(2);

        System.out.print(str1 + str2 + "\n" + str3);
    }
}
