// class Solution {
//     public int maxProfit(int[] prices) {
//     int profit = Integer.MIN_VALUE;
//     int maxprofit = 0 ;
//     for(int  i  = 0 ; i<prices.length ; i++){
//         if(maxprofit < prices){
//                 maxprofit = Math.max(prices , maxprofit);
//         }
//         else{
//             maxprofit = prices;
//         }
//     }
//         return maxprofit;
//     }
// }



class Solution {

    public int maxProfit(int[] prices) {

        int profit = 0;
        int maxprofit = 0;

        for (int i = 0; i < prices.length; i++) {

            if (prices[i] < maxprofit || i == 0) {
                maxprofit = prices[i];
            } 
            else {
                profit = Math.max(profit, prices[i] - maxprofit);
            }
        }

        return profit;
    }
}