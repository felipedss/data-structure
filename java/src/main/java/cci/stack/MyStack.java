package cci.stack;

import java.util.EmptyStackException;

/**
 * Implementing a Simple Stack
 */
public class MyStack {

    private StackNode top;

    private static class StackNode {
        int data;
        StackNode next;

        StackNode(int data) {
            this.data = data;
        }
    }

    public void push(int x) {
        StackNode stackNode = new StackNode(x);
        if (top != null) {
            stackNode.next = top;
        }
        top = stackNode;
    }

    public int top() {
        if (top == null) throw new EmptyStackException();
        return top.data;
    }

    public int pop() {
        if (top == null) throw new EmptyStackException();
        int data = top.data;
        top = top.next;
        return data;
    }

    public boolean isEmpty() {
        return top == null;
    }


}
