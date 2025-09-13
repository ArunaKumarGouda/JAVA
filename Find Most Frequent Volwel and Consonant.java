import java.util.*;

class Solution {
    public int maxFreqSum(String s) {
        s = s.toLowerCase(); // handle case-insensitivity
        Set<Character> vowels = new HashSet<>(Arrays.asList('a','e','i','o','u'));

        int[] freq = new int[26]; // for lowercase letters
        for (char c : s.toCharArray()) {
            if (Character.isLetter(c)) { // only count letters
                freq[c - 'a']++;
            }
        }

        int maxVowel = 0, maxConsonant = 0;
        for (int i = 0; i < 26; i++) {
            char c = (char)(i + 'a');
            if (vowels.contains(c)) {
                maxVowel = Math.max(maxVowel, freq[i]);
            } else {
                maxConsonant = Math.max(maxConsonant, freq[i]);
            }
        }

        return maxVowel + maxConsonant;
    }
}
