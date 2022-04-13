package cci.stack;

import org.testng.annotations.Test;

import java.util.EmptyStackException;
import java.util.NoSuchElementException;

import static org.testng.Assert.*;


public class MyStackTest {

    @Test
    public void test() {
        MyStack stack = new MyStack();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        assertEquals(30, stack.top());
        assertEquals(30, stack.pop());
        assertFalse(stack.isEmpty());
    }

    @Test
    public void testEmpty() {
        MyStack stack = new MyStack();
        assertTrue(stack.isEmpty());
    }

    @Test
    public void testTopStackIsEmpty() {
        MyStack stack = new MyStack();
        assertThrows(EmptyStackException.class, stack::top);
    }

    @Test
    public void testPopStackIsEmpty() {
        MyStack stack = new MyStack();
        assertThrows(EmptyStackException.class, stack::pop);
    }
}
