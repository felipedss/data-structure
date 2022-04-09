package cci.linkedlist;

import java.util.NoSuchElementException;

/**
 * Expected Operations:
 * void pushFront(int val); - ok
 * void pushLast(int val); - ok
 * int removeBack();
 * int front(); - ok
 * int last(); - ok
 * boolean isEmpty();
 * int valueAt(int index);
 * void insert(int index, int val);
 * void remove(int index);
 */
public class BasicLinkedList {

    private Node head;
    private Node tail;
    private int size;

    private static class Node {
        Node next = null;
        int data;

        public Node(int data) {
            this.data = data;
        }
    }

    /**
     * adds an item at the beginning
     */
    public void pushFront(int value) {
        Node node = new Node(value);
        node.next = head;
        this.head = node;
        if (head.next == null) {
            this.tail = node;
        }
        size++;
    }

    /**
     * adds an item at the end
     */
    public void pushLast(int value) {
        if (this.head == null) {
            pushFront(value);
            return;
        }
        Node node = new Node(value);
        Node nodeTail = this.tail;
        nodeTail.next = node;
        this.tail = node;
        this.size++;
    }

    /**
     * get front value of list
     */
    public int front() {
        if (this.head == null) {
            throw new NoSuchElementException("This linked list is empty");
        }
        return this.head.data;
    }

    /**
     * get last value of list
     *
     * @return value value
     */
    public int last() {
        if (this.tail == null) {
            throw new NoSuchElementException("This linked list is empty");
        }
        return this.tail.data;
    }

    /**
     * get the size of list
     *
     * @return int
     */
    public int getSize() {
        return size;
    }

}
