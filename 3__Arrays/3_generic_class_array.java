import java.util.*;

class SpecificArrayInt<t1, t2> {
    int a;

    SpecificArrayInt(int a[]) {
        this.a = a;
    }

    void ptintArrayElemets() {
        for (int x : a) {
            System.out.println(x);
        }
    }
}