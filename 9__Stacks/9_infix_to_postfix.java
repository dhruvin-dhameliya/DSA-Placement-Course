import java.util.*;

class InfixPostfix {

    static int notation(char ch) {
        switch (ch) {
            case '+':
            case '-':
                return 1;

            case '*':
            case '/':
                return 2;

            case '^':
                return 3;
        }
        return -1;
    }

    static String converson(String exp) {
        String result = "";

        Stack<Character> stv = new Stack<Character>();

        for (int i = 0; i < exp.length(); ++i) {
            char c = exp.charAt(i);

            if (Character.isJavaIdentifierPart(c)) {
                result += c;
            } else if (c == '(') {
                stv.push(c);
            } else if (c == ')') {
                while (!stv.isEmpty() && stv.peek() != '(') {
                    result += stv.pop();
                }
                if (!stv.isEmpty() && stv.peek() != '(') {
                    return "Invalid Expression.";
                } else {
                    stv.pop();
                }
            } else {
                while (!stv.isEmpty() && notation(c) <= notation(stv.peek())) {
                    if (stv.peek() == '(') {
                        return "Invalid Expression.";
                    }
                    result += stv.pop();
                }
                stv.push(c);
            }
        }

        while (!stv.isEmpty()) {
            if (stv.peek() == '(') {
                return "Invalid Expression.";
            }
            result += stv.pop();
        }

        return result;
    }

    public static void main(String[] args) {
        String exp = "a+b*(c^d-e)^(f+g*h)-i"; // ANS: abcd^e-fgh*+^*+i-
        System.out.println("Infix expression: " + exp);
        System.out.println("Postfix expression: " + converson(exp));
    }
}
