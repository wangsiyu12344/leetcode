package leetcode;

import java.util.Stack;

/**
 * 155. 最小栈
 * 设计一个支持 push ，pop ，top 操作，并能在常数时间内检索到最小元素的栈。
 *
 * push(x) —— 将元素 x 推入栈中。
 * pop() —— 删除栈顶的元素。
 * top() —— 获取栈顶元素。
 * getMin() —— 检索栈中的最小元素。
 *
 *提示： pop、top 和 getMin 操作总是在 非空栈 上调用。
 * 解答:使用另一个辅助栈保存当前状态的最小值在top.
 * 时间复杂度: 对于所有栈的操作: O(1)
 * 空间复杂度：O(n)
 */
public class MinStack {

    private Stack<Integer> stack = null;
    private Stack<Integer> min_stack = null;
    /** initialize your data structure here. */
    public MinStack() {
        stack = new Stack<>();
        min_stack = new Stack<>();
    }

    public void push(int x) {
        stack.push(x);
        if(min_stack.isEmpty()|| x <= min_stack.peek()){
            min_stack.push(x);
        }
    }

    public void pop() {
        if(stack.peek().equals(min_stack.peek())){
            stack.pop();
            min_stack.pop();
        }else{
            stack.pop();
        }
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return min_stack.peek();
    }
}
