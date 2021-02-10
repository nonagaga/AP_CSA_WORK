package Mod10;

public class StructureRunner {
    public static void main(String[] args) {
        Stack stack = new Stack();

        stack.push("Hello");
        stack.push("World");
        stack.push("I");
        stack.push("Am");
        stack.push("Here");

        for (int i = 0; i < 5; i++) {
            System.out.println(stack.pop());
        }
    }
}
