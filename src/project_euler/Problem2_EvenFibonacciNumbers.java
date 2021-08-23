package project_euler;

public class Problem2_EvenFibonacciNumbers {
	
	static class Solution {
		
		public long sumOfEvenFibonacciNumber(long maxValue) {
			
			long prevPrev = 1;
			long prev = 2;
			long sum = 2;
			long next = 3;
			
			while (true) {
				next = prevPrev + prev;
				System.out.println(prevPrev + " " + prev + " " + next);
				if (next >= maxValue) {
					break;
				}
				if (next % 2 == 0) {
					System.out.println(next);
					sum = sum + next;
				}
				prevPrev = prev;
				prev = next;

			}
			return sum;
		}
		
	}
	
	public static void main(String[] args) {
		Solution sol = new Solution();
		long maxValue = 4000000;
		System.out.println("Sum is: " + sol.sumOfEvenFibonacciNumber(maxValue));
		
	}

}
