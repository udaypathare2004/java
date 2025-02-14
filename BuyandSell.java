import java.util.*;

public class BuyandSell {
    public static int buysellstocks(int price[]) {
        int buyPrice = Integer.MAX_VALUE; // Lowest price to buy
        int maxProfit = 0; // Maximum profit possible

        for (int i = 0; i < price.length; i++) {
            if (buyPrice < price[i]) { // If selling gives profit
                maxProfit = Math.max(maxProfit, price[i] - buyPrice);
            } else { // Update buy price if lower price found
                buyPrice = price[i];
            }
        }
        return maxProfit;
    }

    public static void main(String args[]) {
        int price[] = {7, 1, 5, 3, 6, 4}; // Stock prices
        System.out.println("Maximum Profit: " + buysellstocks(price));
    }
}
