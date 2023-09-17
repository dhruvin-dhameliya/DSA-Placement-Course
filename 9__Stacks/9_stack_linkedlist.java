// Create a Stack using LinkedList with generic class

import java.util.*;

class StackLL<T> {

    LinkedList<T> top;
    int len;

    StackLL() {
        top = new LinkedList<T>();
        len = 0;
    }

    boolean stackEmpty() {
        if (top.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }

    void pushElm(T data) {
        len += 1;
        top.addFirst(data);
    }

    T popElm() {
        T data = null;
        if (stackEmpty()) {
            System.out.println("Stack is Underflow");
        } else {
            len -= 1;
            top.removeFirst();
        }
        return data;
    }

    void printStack() {
        if (stackEmpty()) {
            System.out.println("Stack is Empty.");
        } else {
            for (int i = 0; i < len; i++) {
                System.out.print(top.get(i) + ", ");
            }
            System.out.println();
        }
    }
}

class StackLLMain {
    public static void main(String[] args) {

        StackLL<Integer> s = new StackLL<Integer>();

        s.pushElm(10);
        s.pushElm(20);
        s.pushElm(30);
        s.pushElm(40);
        s.pushElm(50);
        s.printStack();

        s.popElm();
        s.popElm();
        s.printStack();
    }
}