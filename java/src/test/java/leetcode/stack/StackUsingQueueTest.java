package leetcode.stack;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;

public class StackUsingQueueTest {

    @Test
    public void testStackUsingQueue() {
        StackUsingQueue stack = new StackUsingQueue();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        assertEquals(30, stack.top());
        assertEquals(30, stack.pop());
        assertFalse(stack.empty());
    }

}
