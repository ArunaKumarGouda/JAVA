import java.util.*;

class Solution {
    public String[] spellchecker(String[] wordlist, String[] queries) {
        Set<String> exactWords = new HashSet<>();
        Map<String, String> caseInsensitive = new HashMap<>();
        Map<String, String> vowelInsensitive = new HashMap<>();
        
        for (String word : wordlist) {
            exactWords.add(word);
            
            String lower = word.toLowerCase();
            caseInsensitive.putIfAbsent(lower, word);
            
            String devowel = devowel(lower);
            vowelInsensitive.putIfAbsent(devowel, word);
        }
        
        String[] result = new String[queries.length];
        
        for (int i = 0; i < queries.length; i++) {
            String q = queries[i];
            if (exactWords.contains(q)) {
                result[i] = q;  // exact match
            } else {
                String lowerQ = q.toLowerCase();
                if (caseInsensitive.containsKey(lowerQ)) {
                    result[i] = caseInsensitive.get(lowerQ);  // case-insensitive
                } else {
                    String devowelQ = devowel(lowerQ);
                    if (vowelInsensitive.containsKey(devowelQ)) {
                        result[i] = vowelInsensitive.get(devowelQ);  // vowel-error
                    } else {
                        result[i] = "";  // no match
                    }
                }
            }
        }
        
        return result;
    }
    
    private String devowel(String word) {
        StringBuilder sb = new StringBuilder();
        for (char c : word.toCharArray()) {
            if ("aeiou".indexOf(c) >= 0) {
                sb.append('*');
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}
