package seu.Andre.seventhtwenty;

public class BestTimetoBuyandSellStockIII {
    public int maxProfit(int[] prices) {
        int firstbuy = Integer.MIN_VALUE;
        int firstsell = 0;
        int secondbuy = Integer.MIN_VALUE;
        int secondsell = 0;
        
        for(int price : prices){
            if(firstbuy < -price)
                firstbuy = -price;
            if(firstsell < firstbuy + price)
                firstsell = firstbuy + price;
            if(secondbuy < firstsell - price)
                secondbuy = firstsell - price;
            if(secondsell < secondbuy + price)
                secondsell = secondbuy + price;
        }
        return secondsell;
    }
}
