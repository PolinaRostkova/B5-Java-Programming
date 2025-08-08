package day41_collection.List;

import java.util.Stack;

public class StackObject {
    public static void main(String[] args) {
        /*
        Stack
            - child class of Vector
            - last in first out (LIFO)
            - insertion order is kept
            - it is synchronized/thread safe (cannot reach the same object from the different place at the same time)
         */
        // add(elem) ---> push() for Stack
        // remove(elem) ----> pop() --> removes the element which is at the top
        // get(index) ---> peek() --> gets the element which is at the top
        Stack<Character> stack = new Stack<>();
        stack.push('a');
        stack.push('b');
        stack.push('c');
        stack.push('d');
        System.out.println(stack);

        System.out.println(stack.peek());

        stack.pop();
        System.out.println(stack.peek());

        // Q: how about is i want to remove one at the bottom
        // A: you can still use remove method

        stack.remove(0);
        System.out.println(stack);
    }
}
