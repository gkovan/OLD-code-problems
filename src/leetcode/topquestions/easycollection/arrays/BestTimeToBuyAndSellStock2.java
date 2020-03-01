package leetcode.topquestions.easycollection.arrays;

import java.util.Stack;

public class BestTimeToBuyAndSellStock2 {

	public int getOptimalProfit(int[] stockPrices) {

		// when we buy we push the price onto the stack.
		// when we sell we pop the stack.
		Stack stack = new Stack();

		Integer totalProfit = 0;

		for (int i = 0; i < stockPrices.length - 1; i++) {
			int currPrice = stockPrices[i];
			int nextPrice = stockPrices[i + 1];

			if (currPrice < nextPrice && stack.isEmpty() == true) {
				// buy signal
				System.out.println("Bought at index: " + i + " @: " + currPrice);
				stack.push(new Integer(currPrice));
			}

			if (stack.isEmpty() == false) {
				if (i == stockPrices.length - 2) {
					// end of array
					// sell signal
					int priceBought = (Integer) stack.pop();
					int tranProfit = nextPrice - priceBought;
					totalProfit = totalProfit + tranProfit;
					System.out.println("Sold at index: " + i + " @: " + nextPrice + "  Profit is: " + tranProfit
							+ "  TotalProfit is: " + totalProfit);

				} else {
					// sell signal
					int priceBought = (Integer) stack.pop();
					int tranProfit = nextPrice - priceBought;
					totalProfit = totalProfit + tranProfit;
					System.out.println("Sold at index: " + i + " @: " + nextPrice + "  Profit is: " + tranProfit
							+ "  TotalProfit is: " + totalProfit);
				}
			}
		}
		return totalProfit;
	}

}
