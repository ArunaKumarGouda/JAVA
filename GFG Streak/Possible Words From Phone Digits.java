import java.util.*;

class Solution {
    // Mapping of digits to letters as per phone keypad
    static final String[] KEYPAD = {
        "",     // 0
        "",     // 1
        "abc",  // 2
        "def",  // 3
        "ghi",  // 4
        "jkl",  // 5
        "mno",  // 6
        "pqrs", // 7
        "tuv",  // 8
        "wxyz"  // 9
    };

    public ArrayList<String> possibleWords(int[] arr) {
        ArrayList<String> result = new ArrayList<>();
        if (arr == null || arr.length == 0) return result;

        // Filter out digits like 0 and 1
        List<Integer> filteredDigits = new ArrayList<>();
        for (int digit : arr) {
            if (digit >= 2 && digit <= 9) {
                filteredDigits.add(digit);
            }
        }

        // If no valid digits left, return empty list
        if (filteredDigits.size() == 0) return result;

        // Convert to array for recursion
        int[] validArr = filteredDigits.stream().mapToInt(i -> i).toArray();

        backtrack(validArr, 0, new StringBuilder(), result);
        return result;
    }

    private void backtrack(int[] arr, int index, StringBuilder current, ArrayList<String> result) {
        if (index == arr.length) {
            result.add(current.toString());
            return;
        }

        String letters = KEYPAD[arr[index]];
        for (char c : letters.toCharArray()) {
            current.append(c);
            backtrack(arr, index + 1, current, result);
            current.deleteCharAt(current.length() - 1); // backtrack
        }
    }
}
