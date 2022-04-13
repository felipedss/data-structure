package leetcode.queue;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;

public class QueueUsingStackTest {

    @Test
    public void testQueueUsingStack() {
        QueueUsingStack queue = new QueueUsingStack();
        queue.push(10);
        queue.push(20);
        queue.push(30);
        assertEquals(10, queue.peek());
        assertEquals(10, queue.pop());
        assertFalse(queue.empty());
    }

}
