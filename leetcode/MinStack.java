package leetcode;

/*
 * Design a stack that supports push, pop, top, and retrieving the minimum element in constant time.
 * push(x) -- Push element x onto stack.
 * pop() -- Removes the element on top of the stack.
 * top() -- Get the top element.
 * getMin() -- Retrieve the minimum element in the stack.
 *
 * Example          MinStack minStack = new MinStack();
 *                  minStack.push(-2);
 *                  minStack.push(0);
 *                  minStack.push(-3);
 *                  minStack.getMin();   --> Returns -3.
 *                  minStack.pop();
 *                  minStack.top();      --> Returns 0.
 *                  minStack.getMin();   --> Returns -2.
*/

import java.util.EmptyStackException;

public class MinStack {

    private MinStackNode head;

    public MinStack() {

    }

    public void push(int x) {
        if (head == null) {
            head = new MinStackNode(x, x, null);
        } else {
            head = new MinStackNode(x, Math.min(x, head.min), head);
        }
    }

    public void pop() {
        if (head == null) {
            throw new EmptyStackException();
        }
        head = head.next;
    }

    public int top() {
        if (head == null) {
            throw new EmptyStackException();
        }
        return head.value;
    }

    public int getMin() {
        return head.min;
    }
}

class MinStackNode {

    int value;
    int min;
    MinStackNode next;

    MinStackNode(int i, int min, MinStackNode node) {
        this.value = i;
        this.min = min;
        this.next = node;
    }
}