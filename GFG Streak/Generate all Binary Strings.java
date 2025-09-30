import java.util.ArrayList;

class Solution {
    public ArrayList<String> binstr(int n) {
        ArrayList<String> result = new ArrayList<>();
        generateBinaryStrings(n, "", result);
        return result;
    }
    
    private void generateBinaryStrings(int n, String current, ArrayList<String> result) {
        if (n == 0) {
            result.add(current);
            return;
        }
        
        generateBinaryStrings(n - 1, current + "0", result);
        generateBinaryStrings(n - 1, current + "1", result);
    }
}
