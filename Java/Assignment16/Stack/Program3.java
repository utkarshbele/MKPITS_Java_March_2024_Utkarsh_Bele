package Assignment16.Stack;

import java.util.Stack;

// Develop a Java program that reverses a given string using the Stack class. The program should push
// each character onto the stack and then pop them off to construct the reversed string.
public class Program3 {
    public static void main(String[] args) {
        String input = "Hello, How are you?";

        Stack<Character> stack = new Stack<>();
        // Push each character of the string onto the stack
        for (char ch : input.toCharArray()) {
            stack.push(ch);
        }
        // Pop each character off the stack to construct the reversed string
        StringBuilder reversed = new StringBuilder();
        while (!stack.isEmpty()) {
            reversed.append(stack.pop());
        }
        System.out.println("Original String: " + input);
        System.out.println("Reversed String: " + reversed);

    }
}
