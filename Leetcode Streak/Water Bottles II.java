class Solution {
    public int maxBottlesDrunk(int numBottles, int numExchange) {
        int totalDrunk = numBottles;
        int emptyBottles = numBottles;

        // This tracks the *current* exchange cost, which increases after each exchange
        int currentExchangeCost = numExchange;

        while (emptyBottles >= currentExchangeCost) {
            emptyBottles -= currentExchangeCost;
            totalDrunk += 1;
            emptyBottles += 1;
            currentExchangeCost++;  // The cost increases after each exchange
        }

        return totalDrunk;
    }
}
