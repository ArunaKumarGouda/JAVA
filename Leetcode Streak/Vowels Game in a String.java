class Solution {
    public boolean doesAliceWin(String s) {
        for (char c : s.toCharArray()) {
            if ("aeiou".indexOf(c) != -1) {
                return true; // Alice wins if at least one vowel exists
            }
        }
        return false; // No vowels, Alice loses immediately
    }
}
