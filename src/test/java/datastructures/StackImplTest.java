package datastructures;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.EmptyStackException;

import static org.junit.jupiter.api.Assertions.assertEquals;


class StackImplTest {

    StackImpl stack;

    @BeforeEach
    public void beforeTest() {
        stack = new StackImpl(3);
    }

    @Test
    void push() {
        Integer element = 1;
        stack.push(element);
        assertEquals(element, stack.peek());
        assertEquals(1, stack.getNumberOfElements());
    }

    @Test
    void pushWithException() {
        Integer element = 1;
        stack.push(element);
        stack.push(element);
        stack.push(element);
        Assertions.assertThrows(ArrayIndexOutOfBoundsException.class, () -> stack.push(element));
    }

    @Test
    void pop() {
        Integer element = 1;
        stack.push(element);
        assertEquals(element, stack.pop());
        assertEquals(0, stack.getNumberOfElements());
    }

    @Test
    void popWithException() {
        Integer element = 1;
        stack.push(element);
        stack.pop();
        Assertions.assertThrows(EmptyStackException.class, () -> stack.pop());
    }

    @Test
    void peek() {
        Integer element = 1;
        stack.push(element);
        assertEquals(element, stack.peek());
    }
}