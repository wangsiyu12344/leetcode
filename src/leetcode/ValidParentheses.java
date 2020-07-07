package leetcode;

import java.util.Stack;

/**
 * 20. 有效的括号
 * 给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串，判断字符串是否有效。
 *
 * 有效字符串需满足：
 *
 * 左括号必须用相同类型的右括号闭合。
 * 左括号必须以正确的顺序闭合。
 * 注意空字符串可被认为是有效字符串。
 *
 */
public class ValidParentheses {
    public boolean isValid(String s) {
        if(s == null) return true;
        char[] chars = s.toCharArray();

        Stack<Character> stack = new Stack<>();

        for(int i = 0; i<chars.length; i++){
            if(chars[i]=='(' || chars[i]=='['||chars[i]=='{'){
                stack.push(chars[i]);
            }else if(chars[i]==')'){
                if(stack.isEmpty() ||!(stack.pop() =='(')){
                    return false;
                }
            }else if(chars[i]==']'){
                if(stack.isEmpty() || !(stack.pop() == '[')){
                    return false;
                }
            }else{
                if(stack.isEmpty() || !(stack.pop()=='{')){
                    return false;
                }
            }
        }
        return stack.size() == 0? true : false;
    }

}
