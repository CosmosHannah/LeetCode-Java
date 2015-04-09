package leetcode.solution;

import java.util.Stack;

/**
 * Created by guo7711 on 4/9/2015.
 */
public class ValidParentheses20 {

    public boolean matches(char s, char e)
    {
        if(s=='('&&e==')') return true;
        else if(s=='['&&e==']') return true;
        else if(s=='{'&&e=='}') return true;
        else return false;
    }

    public boolean isValid(String s) {

        if(s==null||s.length()==0) return true;

        Stack<Character> stack = new Stack<Character>();
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='('||s.charAt(i)=='['||s.charAt(i)=='{')
            {
                stack.add(s.charAt(i));
            }
            else if(s.charAt(i)==')'||s.charAt(i)==']'||s.charAt(i)=='}')
            {
                if(stack.empty()) return false;
                else
                {
                    char c = stack.pop();
                    if(!matches(c,s.charAt(i))) return false;
                }

            }
            else return false;
        }

        if(stack.empty()) return true;
        else return false;

    }

}
