/*
 * @lc app=leetcode id=121 lang=cpp
 *
 * [121] Best Time to Buy and Sell Stock
 */

// @lc code=start
class Solution {
public:
    int maxProfit(vector<int>& prices) {
        int n = prices.size();
        if(n <= 1)
            return 0;
        
        int b = 0; //buy
        int s = 1; //sell
        int l = 0; //lowest
        int i = 1;
        
        while(i < n){
          l = prices[l] < prices[i] ? l : i;
          s = prices[i] >= prices[s] ? i : s;
        
          int sb = prices[s] - prices[b];          
          int il = prices[i] - prices[l];
          if(il >= sb) {
            b = l;
            s = i;
          } 

          i++;
        }

        int best = prices[s] - prices[b];
        return best >= 0 ? best : 0;
      
    }
};
// @lc code=end

