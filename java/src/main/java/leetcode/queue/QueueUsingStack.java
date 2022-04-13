package leetcode.queue;

import java.util.Stack;

/**
 * 232. https://leetcode.com/problems/implement-queue-using-stacks/
 */
public class QueueUsingStack {

    private final Stack<Integer> stack = new Stack<>();

    public QueueUsingStack() {
    }

    public void push(int x) {
        stack.push(x);
    }

    public int pop() {
        return stack.remove(0);
    }

    public int peek() {
        return stack.firstElement();

    }

    public boolean empty() {
        return stack.empty();
    }

}
