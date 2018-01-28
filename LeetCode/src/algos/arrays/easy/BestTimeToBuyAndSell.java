package algos.arrays.easy;

/*
Best Time to Buy and Sell Stock II
Say you have an array for which the ith element is the price of a given stock 
on day i.

Design an algorithm to find the maximum profit. You may complete as many 
transactions as you like (ie, buy one and sell one share of the stock multiple 
times). However, you may not engage in multiple transactions at the same time 
(ie, you must sell the stock before you buy again).
*/


/* ANALYSIS:
 This problem can be viewed as finding all ascending sequences.
  For example, given {5, 1, 2, 3, 4}, buy at 1 & sell at 4 is the same as
  buy at 1 &sell at 2 & buy at 2& sell at 3 & buy at 3 & sell at 4.
 */
public class BestTimeToBuyAndSell
{
	 public int maxProfit(int[] prices) {
	        
	        if(prices.length == 0 || prices.length == 1)
	        {
	            return 0;
	        }
	        
	        int profit = 0;
	        
	        for(int i=1;i<prices.length;i++)
	        {
	            if(prices[i]>prices[i-1])
	            {
	                profit += prices[i] - prices[i-1];
	            }
	        }
	        
	        return profit;
	    }
}
