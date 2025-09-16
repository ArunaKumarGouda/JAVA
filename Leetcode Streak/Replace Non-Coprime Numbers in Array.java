import java.util.*;

class Solution {
    public List<Integer> replaceNonCoprimes(int[] nums) {
        List<Integer> stack = new ArrayList<>();

        for (int num : nums) {
            stack.add(num);
            // keep merging as long as top two are not coprime
            while (stack.size() > 1) {
                int b = stack.get(stack.size() - 1);
                int a = stack.get(stack.size() - 2);
                if (gcd(a, b) > 1) {
                    stack.remove(stack.size() - 1);
                    stack.remove(stack.size() - 1);
                    long lcm = lcm(a, b);
                    stack.add((int) lcm);
                } else {
                    break;
                }
            }
        }

        return stack;
    }

    private int gcd(int a, int b) {
        while (b != 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }

    private long lcm(long a, long b) {
        return a / gcd((int)a, (int)b) * b;
    }
}
