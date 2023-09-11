import java.util.*;

class ArrLL {
    String name;
    double mark;

    ArrLL(String name, double mark) {
        this.name = name;
        this.mark = mark;
    }

    void printData() {
        System.out.print("Name: " + name);
        System.out.println("\t Mark: " + mark);
    }
}

class UserDefine2 {
    public static void main(String[] args) {
        ArrLL arr[] = new ArrLL[5];
        arr[0] = new ArrLL("Dhruvin", 91.51);
        arr[1] = new ArrLL("Ram", 68.44);
        arr[2] = new ArrLL("Keyur", 84.56);
        arr[3] = new ArrLL("Janvi", 93.73);
        arr[4] = new ArrLL("Shreya", 57.01);

        // here create a LinkedList with Array collection
        LinkedList<ArrLL> ll = new LinkedList<ArrLL>(Arrays.asList(arr));

        ArrLL obj;

        Iterator<ArrLL> itr = ll.iterator();
        while (itr.hasNext()) {
            obj = itr.next();
            obj.printData();
        }
    }
}
