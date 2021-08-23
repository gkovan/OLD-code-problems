package project_euler;

public class Problem4_LargestPalindromeProduct {
	
	static class Solution {
		
		public long largestPalindromeProduct() {
			long num1 = 999;
			long num2 = 999;
			long largestPalindromeProduct = 0;
			
			while (num1 > 0) {
				while (num2 > 0) {
					long product = num1 * num2;
					String strProduct = Long.toString(product);
					StringBuilder sb = new StringBuilder(strProduct);
					String reverseStrProduct = sb.reverse().toString();
					
					if (strProduct.equals(reverseStrProduct)) {
						System.out.println("Num1 is: " + num1 + "  Num2 is: "+ num2);
						long palindromeProduct = new Long(strProduct).longValue();
						if (palindromeProduct > largestPalindromeProduct) {
							largestPalindromeProduct = palindromeProduct;
						}
					}
					num2--;
				}
				num2 = 999;
				num1--;
			}  
			return largestPalindromeProduct;
		}
	}
	
	
	public static void main (String[] args) {
		
		Solution sol = new Solution();
		System.out.println(sol.largestPalindromeProduct());
		
	}

}
