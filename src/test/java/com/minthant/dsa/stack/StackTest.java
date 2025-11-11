package com.minthant.dsa.stack;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StackTest {
    Stack stack = new Stack(3);

    @Test
    public void testPushWithSingleValue(){
        stack.push(100);
        assertEquals(1, stack.size());
    }

    @Test
    public void testPushWithMultipleValue(){
        stack.push(100);
        assertEquals(1, stack.size());

        stack.push(200);
        assertEquals(2, stack.size());
    }

    @Test
    public void testPeek () {
        stack.push(200);
        stack.push(100);
        assertEquals(100, stack.peek());
        assertEquals(2, stack.size());
    }

    @Test
    public void testPop () {
        stack.push(300);
        stack.push(200);
        stack.push(100);
        assertEquals(100, stack.pop());
        assertEquals(200, stack.pop());
        assertEquals(300, stack.pop());
        assertEquals(100, stack.pop());
        assertEquals(0, stack.size());
    }

    @Test
    public void isEmpty () {
        stack.push(100);
        stack.pop();
        Assertions.assertTrue(stack.isEmpty());
    }
}
