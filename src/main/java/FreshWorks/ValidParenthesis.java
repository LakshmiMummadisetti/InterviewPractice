package FreshWorks;

import java.util.Stack;

public class ValidParenthesis {

    public static void main(String args[])
    {
        String str = "{([]))}";
        CheckParenthesis cp = new CheckParenthesis();
       System.out.println(cp.checkParenthesisShow(str));
    }
}

class CheckParenthesis
{
    public boolean checkParenthesisShow(String str)
    {
        Stack<Character> st = new Stack<>();
        for(int i =0;i<str.length();i++)
        {
            char ch = str.charAt(i);
            if(ch=='{' || ch=='[' || ch=='(')
            {
                st.push(ch);
            }
            else if(ch=='}' || ch==']' || ch==')')
            {
            if (st.empty())
                return false;
            else if(!isMatching(st.pop(),ch))
                return false;

            }

        }
        return st.isEmpty();
    }

    public boolean isMatching(char open, char close)
    {
        if(open == '{' && close == '}' || open == '(' && close == ')' || open == '[' && close == ']')
            return true;
        else
            return false;
    }
}
