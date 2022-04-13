package leetcode.stack;

import java.util.*;

/**
 * 225. https://leetcode.com/problems/implement-stack-using-queues/
 */
public class StackUsingQueue {

    private final LinkedList<Integer> queue = new LinkedList<>();

    public StackUsingQueue() {
    }

    public void push(int x) {
        queue.add(x);
    }

    public int pop() {
        return queue.removeLast();
    }

    public int top() {
        return queue.getLast();
    }

    public boolean empty() {
        return queue.isEmpty();
    }
}
