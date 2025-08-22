class Solution {
    public int myAtoi(String s) {
        // code here
        s = s.trim();
        int sign = 1;
        int index = 0;
        
        if (s.length() > 0 && (s.charAt(index) == '+' || s.charAt(index) == '-')){
            if(s.charAt(index) == '-'){
                sign = -1;
            }
            index++;
        }
        int result = 0;
        while (index < s.length() && Character.isDigit(s.charAt(index))){
            int digit = s.charAt(index) - '0';
            if (result > Integer.MAX_VALUE / 10 || (result == Integer.MAX_VALUE / 10 && digit > Integer.MAX_VALUE % 10)){
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            result = result * 10 + digit;
            index++;
        }
        return result * sign;
    }
}
