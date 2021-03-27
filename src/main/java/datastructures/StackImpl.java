package datastructures;

import java.util.EmptyStackException;

public class StackImpl {

    private int top;
    private Integer[] internalArray;

    public StackImpl(int size) {
        internalArray = new Integer[size];
        top = 0;
    }

    public int getNumberOfElements() {
        return top;
    }

    public void push(Integer element) {
        if (top >= internalArray.length) {
            throw new ArrayIndexOutOfBoundsException();
        }

        internalArray[top] = element;
        top++;
    }

    public Integer pop() {
        Integer result = peek();
        internalArray[--top] = null;
        return result;
    }

    public Integer peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return this.internalArray[top - 1];
    }

    private boolean isEmpty() {
        return top == 0;
    }
}
