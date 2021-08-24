package project_euler;

public class Problem6_SumSquareDifference {
	
	static class Solution {
		
		private static int NUMBER = 100;
		
		public long sumSquareDifference() {
			long sumOfSquaresVal = 0;
			long squareOfSumVal = 0;
			
			for (int i = 1; i <= NUMBER; i++) {
				sumOfSquaresVal = sumOfSquaresVal + (i * i);
				squareOfSumVal = squareOfSumVal + i;
			}
			squareOfSumVal = squareOfSumVal * squareOfSumVal;
			
			return squareOfSumVal - sumOfSquaresVal;
		}
		
	}
	

	
	
	
	public static void main (String[] args) {
		
		Solution sol = new Solution();
		System.out.println(sol.sumSquareDifference());		
	}

}
