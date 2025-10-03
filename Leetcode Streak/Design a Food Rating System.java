import java.util.*;

class FoodRatings {
    // Maps food -> cuisine
    private Map<String, String> foodCuisine;
    // Maps food -> rating
    private Map<String, Integer> foodRating;
    // Maps cuisine -> ordered set of foods 
    private Map<String, TreeSet<String>> cuisineFoods;

    public FoodRatings(String[] foods, String[] cuisines, int[] ratings) {
        foodCuisine = new HashMap<>();
        foodRating = new HashMap<>();
        cuisineFoods = new HashMap<>();

        for (int i = 0; i < foods.length; i++) {
            String food = foods[i];
            String cuisine = cuisines[i];
            int rating = ratings[i];

            foodCuisine.put(food, cuisine);
            foodRating.put(food, rating);

            cuisineFoods.putIfAbsent(cuisine, new TreeSet<>((a, b) -> {
                int r1 = foodRating.get(a);
                int r2 = foodRating.get(b);
                if (r1 != r2) return r2 - r1; // higher rating first
                return a.compareTo(b);        // lexicographically smaller first
            }));
            cuisineFoods.get(cuisine).add(food);
        }
    }
    
    public void changeRating(String food, int newRating) {
        String cuisine = foodCuisine.get(food);
        TreeSet<String> set = cuisineFoods.get(cuisine);

        // Remove old entry
        set.remove(food);
        foodRating.put(food, newRating);
        // Add with new rating
        set.add(food);
    }
    
    public String highestRated(String cuisine) {
        return cuisineFoods.get(cuisine).first();
    }
}
