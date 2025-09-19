class Solution {
    public int minParentheses(String s) {
        int balance = 0;  // unmatched '('
        int additions = 0; // unmatched ')'
        
        for (char c : s.toCharArray()) {
            if (c == '(') {
                balance++;
            } else { // ')'
                if (balance > 0) {
                    balance--; // match with previous '('
                } else {
                    additions++; // need an extra '('
                }
            }
        }
        
        return additions + balance;
    }
}
