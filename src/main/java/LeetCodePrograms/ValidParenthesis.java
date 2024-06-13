package LeetCodePrograms;

import java.util.Stack;

import static io.opentelemetry.api.trace.TraceId.isValid;

public class ValidParenthesis {

    public static void main(String[] args) {
        String str = "[{()()}]";
        System.out.println(isParenthesisValid(str));

    }

    public static boolean isParenthesisValid(String str) {
        if (str.length() % 2 != 0) {
            return false;
        }
        Stack<Character> stack = new Stack<>();
        for (char c : str.toCharArray()) {
            if (c == '[' || c == '{' || c == '(') {
                stack.push(c);
            } else if (c == ']' || c == '}' || c == ')') {
                if (stack.isEmpty() ) {
                    return false;
                } else if(!isThismatching(c, stack.pop()))
                   return false;

            }
            }

        return stack.isEmpty();
    }


    public static boolean isThismatching(char close, char open) {
        if (open == '{' && close == '}' || open == '[' && close == ']' || open == '(' && close == ')')
            return true;
        else
            return false;

    }
}

