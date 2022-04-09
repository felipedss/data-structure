package cci.linkedlist;

import org.testng.annotations.Test;

import java.util.NoSuchElementException;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertThrows;

public class BasicLinkedListTest {

    @Test
    public void testPushFront() {
        BasicLinkedList basicLinkedList = new BasicLinkedList();
        basicLinkedList.pushFront(10);
        basicLinkedList.pushFront(20);
        basicLinkedList.pushFront(30);
        assertEquals(30, basicLinkedList.front());
        assertEquals(3, basicLinkedList.getSize());
    }

    @Test
    public void testFrontEmptyList() {
        BasicLinkedList basicLinkedList = new BasicLinkedList();
        assertThrows(NoSuchElementException.class, basicLinkedList::front);
    }

    @Test
    public void testPushBack() {
        BasicLinkedList basicLinkedList = new BasicLinkedList();
        basicLinkedList.pushLast(10);
        basicLinkedList.pushLast(20);
        basicLinkedList.pushLast(30);
        assertEquals(30, basicLinkedList.last());
        assertEquals(3, basicLinkedList.getSize());
    }

    @Test
    public void testBackEmptyList() {
        BasicLinkedList basicLinkedList = new BasicLinkedList();
        assertThrows(NoSuchElementException.class, basicLinkedList::last);
    }


}
