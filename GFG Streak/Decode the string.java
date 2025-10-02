import java.util.*;

class Solution {
    static String decodeString(String s) {
        Stack<Integer> countStack = new Stack<>();
        Stack<StringBuilder> stringStack = new Stack<>();
        StringBuilder curr = new StringBuilder();
        int num = 0;

        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) {
                num = num * 10 + (c - '0');  // build number
            } else if (c == '[') {
                countStack.push(num);
                stringStack.push(curr);
                num = 0;
                curr = new StringBuilder();
            } else if (c == ']') {
                int times = countStack.pop();
                StringBuilder prev = stringStack.pop();
                for (int i = 0; i < times; i++) {
                    prev.append(curr);
                }
                curr = prev;
            } else {
                curr.append(c);
            }
        }
        return curr.toString();
    }
}
