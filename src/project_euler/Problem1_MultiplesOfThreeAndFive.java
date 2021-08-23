package project_euler;

public class Problem1_MultiplesOfThreeAndFive {
	
	static class Solution {
		
		public int sumOfMultiples() {
		   int n = 1000;
		   int sum = 0;
		
		   for (int i = 0; i < n; i++) {
			
			   if (i % 3 == 0) {
				   sum = sum + i;
			   } else if (i % 5 == 0) {
				   sum = sum + i;
			   }
		   }
		   return sum;
		}
		
	}
	

	public static void main(String[] args) {
		
		Solution sol = new Solution();
		System.out.println(sol.sumOfMultiples());
		
	}
}
