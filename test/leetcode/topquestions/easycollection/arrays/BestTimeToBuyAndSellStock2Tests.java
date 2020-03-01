package leetcode.topquestions.easycollection.arrays;

import static org.junit.jupiter.api.Assertions.*;


/*********
 * 
Say you have an array for which the ith element is the price of a given stock on day i.

Design an algorithm to find the maximum profit. You may complete as many transactions as you like (i.e., buy one and sell one share of the stock multiple times).

Note: You may not engage in multiple transactions at the same time (i.e., you must sell the stock before you buy again).

Example 1:

Input: [7,1,5,3,6,4]
Output: 7
Explanation: Buy on day 2 (price = 1) and sell on day 3 (price = 5), profit = 5-1 = 4.
             Then buy on day 4 (price = 3) and sell on day 5 (price = 6), profit = 6-3 = 3.

Example 2:

Input: [1,2,3,4,5]
Output: 4
Explanation: Buy on day 1 (price = 1) and sell on day 5 (price = 5), profit = 5-1 = 4.
             Note that you cannot buy on day 1, buy on day 2 and sell them later, as you are
             engaging multiple transactions at the same time. You must sell before buying again.

Example 3:

Input: [7,6,4,3,1]
Output: 0
Explanation: In this case, no transaction is done, i.e. max profit = 0.


 */

import org.junit.jupiter.api.Test;

import leetcode.topquestions.easycollection.arrays.BestTimeToBuyAndSellStock2;

class BestTimeToBuyAndSellStock2Tests {

	@Test
	void testSingleTransaction() {
		// given
		int[] stockPrices = { 1 , 2 };
		
		// when
		BestTimeToBuyAndSellStock2 buyAndSell = new BestTimeToBuyAndSellStock2();
		int optimalProfit = buyAndSell.getOptimalProfit(stockPrices);
		
		// then
		assertEquals(1, optimalProfit);
	}
	
	@Test
	void testSingleTransactionWithMoreIntermediatePrices() {
		// given
		int[] stockPrices = { 1 , 2 ,3 };
		
		// when
		BestTimeToBuyAndSellStock2 buyAndSell = new BestTimeToBuyAndSellStock2();
		int optimalProfit = buyAndSell.getOptimalProfit(stockPrices);
		
		// then
		assertEquals(2, optimalProfit);
	}
	
	@Test
	void testSingleTransactionWithEvenMoreIntermediatePrices() {
		// given
		int[] stockPrices = { 1 , 2 , 3, 4, 5, 10, 20, 100};
		
		// when
		BestTimeToBuyAndSellStock2 buyAndSell = new BestTimeToBuyAndSellStock2();
		int optimalProfit = buyAndSell.getOptimalProfit(stockPrices);
		
		// then
		assertEquals(99, optimalProfit);
	}
	
	@Test
	void testSingleTransactionWithTroughInMiddleOfArray() {
		// given
		int[] stockPrices = { 5, 4, 3, 2 , 1 ,8 };
		
		// when
		BestTimeToBuyAndSellStock2 buyAndSell = new BestTimeToBuyAndSellStock2();
		int optimalProfit = buyAndSell.getOptimalProfit(stockPrices);
		
		// then
		assertEquals(7, optimalProfit);
	}
	
	@Test
	void testTwoTransactions() {
		// given
		int[] stockPrices = { 1, 5, 3, 1 , 8, 6 };
		
		// when
		BestTimeToBuyAndSellStock2 buyAndSell = new BestTimeToBuyAndSellStock2();
		int optimalProfit = buyAndSell.getOptimalProfit(stockPrices);
		
		// then
		assertEquals(11, optimalProfit);
	}
	
	@Test
	void testThreeTransactions() {
		// given
		int[] stockPrices = { 1, 5, 3, 1 , 8, 6, 7,8,9,10,11,12,14,1 };
		
		// when
		BestTimeToBuyAndSellStock2 buyAndSell = new BestTimeToBuyAndSellStock2();
		int optimalProfit = buyAndSell.getOptimalProfit(stockPrices);
		
		// then
		assertEquals(19, optimalProfit);
	}
	
	@Test
	void testSingleTransactionGoingDownInitially() {
		// given
		int[] stockPrices = { 2 , 1 ,2 };
		
		// when
		BestTimeToBuyAndSellStock2 buyAndSell = new BestTimeToBuyAndSellStock2();
		int optimalProfit = buyAndSell.getOptimalProfit(stockPrices);
		
		// then
		assertEquals(1, optimalProfit);
	}
	
	@Test
	void testSingleTransactionGoingDownInitiallyMoreComplex() {
		// given
		int[] stockPrices = { 8 , 7 ,6 ,5 ,4,3,2,3,4,5,6,7,8,9 };
		
		// when
		BestTimeToBuyAndSellStock2 buyAndSell = new BestTimeToBuyAndSellStock2();
		int optimalProfit = buyAndSell.getOptimalProfit(stockPrices);
		
		// then
		assertEquals(7, optimalProfit);
	}
	
	


}
