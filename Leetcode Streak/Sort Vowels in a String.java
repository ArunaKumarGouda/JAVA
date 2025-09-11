class Solution {
    public String sortVowels(String s) {
        String vowels = "aeiouAEIOU";
        List<Character> vowelList = new ArrayList<>();
        
        // Step 1: collect vowels
        for (char c : s.toCharArray()) {
            if (vowels.indexOf(c) != -1) {
                vowelList.add(c);
            }
        }
        
        // Step 2: sort vowels
        Collections.sort(vowelList);
        
        // Step 3: rebuild string with sorted vowels
        StringBuilder sb = new StringBuilder();
        int idx = 0;
        for (char c : s.toCharArray()) {
            if (vowels.indexOf(c) != -1) {
                sb.append(vowelList.get(idx++));
            } else {
                sb.append(c);
            }
        }
        
        return sb.toString();
    }
}
