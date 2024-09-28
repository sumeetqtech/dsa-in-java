package datastructures.stack;

public class Main {
    public static void main(String[] args) {
        Stack stack = new Stack(1);

        stack.getTop();
        stack.getHeight();

        stack.push(2);
        stack.push(3);
        stack.push(4);

        System.out.println("Pop: " + stack.pop().value);
        stack.printStack();
    }
}
