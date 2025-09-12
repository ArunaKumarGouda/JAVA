import java.util.Arrays;
import java.util.Collections;

class Solution {
    public static int minCost(int n, int m, int[] x, int[] y) {
        // Convert int[] to Integer[] to use Arrays.sort with Comparator
        Integer[] horizontalCuts = Arrays.stream(x).boxed().toArray(Integer[]::new);
        Integer[] verticalCuts = Arrays.stream(y).boxed().toArray(Integer[]::new);

        // Sort in descending order
        Arrays.sort(horizontalCuts, Collections.reverseOrder());
        Arrays.sort(verticalCuts, Collections.reverseOrder());

        int h = 0; // index for horizontal cuts
        int v = 0; // index for vertical cuts
        int horizontalPieces = 1;
        int verticalPieces = 1;
        int cost = 0;

        while (h < horizontalCuts.length && v < verticalCuts.length) {
            if (horizontalCuts[h] >= verticalCuts[v]) {
                cost += horizontalCuts[h] * verticalPieces;
                horizontalPieces++;
                h++;
            } else {
                cost += verticalCuts[v] * horizontalPieces;
                verticalPieces++;
                v++;
            }
        }

        // Add remaining cuts
        while (h < horizontalCuts.length) {
            cost += horizontalCuts[h] * verticalPieces;
            h++;
        }

        while (v < verticalCuts.length) {
            cost += verticalCuts[v] * horizontalPieces;
            v++;
        }

        return cost;
    }
}
