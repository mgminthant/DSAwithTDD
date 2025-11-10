package com.minthant.dsa.stack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StackTest {
    Stack stack = new Stack(5);

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
    }

    @Test
    public void testPop ( ) {
        stack.push(300);
        stack.push(200);
        stack.push(100);
        assertEquals(200, stack.pop());
        assertEquals(2, stack.size());
    }

}
