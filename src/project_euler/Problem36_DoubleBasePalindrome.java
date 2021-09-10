package project_euler;

public class Problem36_DoubleBasePalindrome {
	
	static class Solution {
		
		static int NUMBER = 1000000;
		
		public long sumOfAllDoubleBasePalindromes() {
			
			long sum = 0;
			for (int i = 0; i < NUMBER; i++) {
				String str = Integer.toString((i));
				StringBuilder sb = new StringBuilder(str);
				String reverseStr = sb.reverse().toString();
				if (str.equals(reverseStr)) {
					String binaryStr = Integer.toString(i, 2);
					StringBuilder sbBinary = new StringBuilder(binaryStr);
					String sbBinaryReverse = sbBinary.reverse().toString();
					if (binaryStr.equals(sbBinaryReverse)) {
						sum = sum + i;
						System.out.println("###Found Double Palindrome: Number: " + str +  " Binary number:" + binaryStr);
					}
				}
			
			}
			return sum;
		}
		
	}
	
	
	public static void main (String[] args) {
		Solution sol = new Solution();
		System.out.println(sol.sumOfAllDoubleBasePalindromes());
		
	}

}
