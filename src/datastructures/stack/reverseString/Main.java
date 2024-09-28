package datastructures.stack.reverseString;

public class Main {

    static String reverseString(String input) {
        StringBuilder reversedString = new StringBuilder();
        Stack<Character> stack = new Stack<>();
        char[] chars = input.toCharArray();

        for (char aChar : chars) {
            stack.push(aChar);
        }

        while (!stack.isEmpty()) {
            reversedString.append(stack.pop());
        }

        return reversedString.toString();
    }


    public static void main(String[] args) {

        String myString = "hello";
        String reversedString = reverseString(myString);
        System.out.println(reversedString);

        /*
            EXPECTED OUTPUT:
            ----------------
            olleh
        */

    }

}

