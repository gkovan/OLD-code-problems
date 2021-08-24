package project_euler;

public class Problem5_SmallestMultiple {
	
	static class Solution {
		
		private static long NUMBER = 20;
		
		public long smallestMultiple() {
			
			long num = NUMBER;
			long returnValue = 0;
			
			boolean foundSmallestMultiple = false;
			
			while (foundSmallestMultiple == false) {
			   //System.out.println(num);
			   for ( long i = NUMBER; i > 0; i--) {
				   if (num % i != 0) {
					   break;
				   }
				   
				   if ( i == 1 ) {
					   foundSmallestMultiple = true;
					   returnValue = num;
				   }
			   }
			   num++;
			}
			return returnValue;
		}
		
	}
	
	public static void main(String[] args) {
		
		Solution sol = new Solution();
		System.out.println(sol.smallestMultiple());
	}

}
