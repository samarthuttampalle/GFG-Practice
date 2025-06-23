public class gffcontest {
    public static int minimumCost(int n, int[] candies) {
        // Sort the array to prioritize lower prices
        Arrays.sort(candies);

        int totalCost = 0;
        HashSet<Integer> bought = new HashSet<>();

        for (int i = 0; i < n; i++) {
            int price = candies[i];
            if (!bought.contains(price)) {
                totalCost += price;
                bought.add(price);
            }
        }

        return totalCost;
    }
}
