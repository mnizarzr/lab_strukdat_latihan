package io.github.mnizarzr.labdatastructure;

import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();

        stack.push("Aku");
        stack.push("Anak");
        stack.push("Indonesia");

        System.out.println("Next: " + stack.peek());
        stack.push("Raya");
        System.out.println(stack.pop());
        stack.push("!");

        int count = stack.search("Aku");
        System.out.println(count);
        while (count != -1 && count > 1) {
            stack.pop();
            count--;
        }
        System.out.println(stack.pop());
        System.out.println(stack.empty());
    }
}