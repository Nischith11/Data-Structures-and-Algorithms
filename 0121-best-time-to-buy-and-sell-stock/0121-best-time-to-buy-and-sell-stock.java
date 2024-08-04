class Solution {
    public int maxProfit(int[] prices) {
       //Brute Force Approach
        //here by using 2 loops we can slove this problem 
        //But T.C of this algo will be O(N^2);
        
        
        //optimal approach
        //we know that 
        //we have to buy stocks at low price 
        //and we need to sell it on high
        //so that we can make profit
        
        int buy=Integer.MAX_VALUE;
        int profit=0;
        for(int i=0;i<prices.length;i++){
            buy=Math.min(buy,prices[i]);
            int sell=prices[i] - buy;
            if(sell > profit){
                profit=sell;
            }
        }
        return profit;
}
}