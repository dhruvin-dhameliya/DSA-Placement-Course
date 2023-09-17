// Create a Stack using Array with generic class

class StackArray<T> {

    T[] arr;
    int len, top;

    StackArray(T[] arr) {
        this.arr = arr;
        len = arr.length;
        top = -1;
    }

    boolean isEmpty() {
        if (top == -1) {
            return true;
        } else {
            return false;
        }
    }

    void pushElm(T a) {
        if (top < len - 1) {
            top++;
            arr[top] = a;
        } else {
            System.out.println("Stack is Overflow.");
        }
    }

    T popElm() {
        T a = null;
        if (top == -1) {
            System.out.println("Stack is Underflow.");
        } else {
            a = arr[top];
            top--;
        }
        return a;
    }

    void printStack() {
        if (top == -1) {
            System.out.println("Stack is Empty.");
        } else {
            System.out.print("Stack is: [");
            for (int i = top; i >= 0; i--) {
                System.out.print(arr[i] + ", ");
            }
            System.out.print("] \n");
        }
    }
}

class SAMain {
    public static void main(String[] args) {
        Integer a[] = new Integer[10];
        StackArray<Integer> st = new StackArray<Integer>(a);

        System.out.println("Stack is Empty: " + st.isEmpty());
        st.pushElm(10);
        st.pushElm(20);
        st.pushElm(30);
        st.pushElm(40);
        st.pushElm(50);
        st.printStack();
        st.popElm();
        st.printStack();
        st.popElm();
        st.printStack();
        System.out.println("Stack is Empty: " + st.isEmpty());
    }
}