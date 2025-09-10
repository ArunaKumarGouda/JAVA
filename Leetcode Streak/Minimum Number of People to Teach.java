import java.util.*;

class Solution {
    public int minimumTeachings(int n, int[][] languages, int[][] friendships) {
        int m = languages.length;
        
        // Build map: person -> set of languages
        Map<Integer, Set<Integer>> langMap = new HashMap<>();
        for (int i = 0; i < m; i++) {
            langMap.put(i + 1, new HashSet<>());
            for (int lang : languages[i]) {
                langMap.get(i + 1).add(lang);
            }
        }

        // Find problematic friendships
        Set<Integer> problematic = new HashSet<>();
        for (int[] f : friendships) {
            int u = f[0], v = f[1];
            Set<Integer> setU = langMap.get(u);
            Set<Integer> setV = langMap.get(v);

            boolean canCommunicate = false;
            for (int lang : setU) {
                if (setV.contains(lang)) {
                    canCommunicate = true;
                    break;
                }
            }

            if (!canCommunicate) {
                problematic.add(u);
                problematic.add(v);
            }
        }

        // If no problematic friendships, no teaching needed
        if (problematic.isEmpty()) return 0;

        int minTeach = Integer.MAX_VALUE;

        // Try teaching each language
        for (int lang = 1; lang <= n; lang++) {
            int count = 0;
            for (int person : problematic) {
                if (!langMap.get(person).contains(lang)) {
                    count++;
                }
            }
            minTeach = Math.min(minTeach, count);
        }

        return minTeach;
    }
}
