package leetcode.fb.questions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class MultiplyStrings {
	
	// Solution3 is not mine.  This one works perfectly.
	static class Solution3 {
		public String multiply(String num1, String num2) {
			if ("0".equals(num1) || "0".equals(num2))
				return "0";

			int[] ans = new int[num1.length() + num2.length() - 1];

			for (int i = 0; i < num1.length(); i++) {
				for (int j = 0; j < num2.length(); j++) {
					ans[i + j] += (num1.charAt(i) - '0') * (num2.charAt(j) - '0');
					System.out.println("J: " + j);
					System.out.println("---------");
					System.out.println ("i+j: " + (i+j));
					System.out.println("ans[i+j] " + ans[i+j]);
				}
			}

			for (int i = ans.length - 1; i > 0; i--) {
				ans[i - 1] += ans[i] / 10;
				ans[i] %= 10;
			}

			StringBuilder sb = new StringBuilder();
			for (int i : ans) {
				sb.append(i);
			}

			return sb.toString();
		}

	}
	
	// I coded this solution.  It does not work for some test cases.
	static class Solution {
		
		private List<Integer> addInterMediateToTotal(List<Integer> interMediateResult,List<Integer> totalResult) {
			Iterator<Integer> iterIntermediate = interMediateResult.iterator();
			Iterator<Integer> iterTotal = totalResult.iterator();
			List<Integer> newTotal = new ArrayList<Integer>();

			int carry = 0;
			while (iterIntermediate.hasNext() ) {
				Integer value1 = iterIntermediate.next();
				Integer value2 = iterTotal.hasNext() ? iterTotal.next() : 0;
				int tmp = value2 + value1 + carry;
				carry = tmp / 10;
				int remainder = tmp%10;
				newTotal.add(remainder);				
			}
			return newTotal;
		}
		
		private void addLeadingZeroes(List<Integer> intermediateResult, int numOfZeroes) {
			while (numOfZeroes > 0) {
				intermediateResult.add(0);
				numOfZeroes--;
			}
		}
		
	    public String multiply(String num1, String num2) {
	    	
	    	if (num1.equals("0") || num2.equals("0")) {
	    		return "0";
	    	}
	    	
	    	List<Integer> totalResult = new ArrayList<Integer>();
	    		    	
	    	int numOfLeadingZeroes = 0;
			for (int j = num2.length() - 1; j >= 0; j--) {
				Character c2 = num2.charAt(j);
				int i2 = Character.getNumericValue(c2);
				
		    	int carry = 0;
		    	int remainder = 0;
				
				List<Integer> intermediateResult = new ArrayList<Integer>();
				
				addLeadingZeroes(intermediateResult, numOfLeadingZeroes++);
				for (int i = num1.length() - 1; i >= 0; i--) {
					
					Character c1 = num1.charAt(i);
					int i1 = Character.getNumericValue(c1);

					int i3 = i1 * i2 + carry;
					carry = i3 / 10;
					remainder = i3 % 10;
					intermediateResult.add(remainder);
					if (i == 0 && carry > 0) {
						intermediateResult.add(carry);
					}
					// multiplyResult.set(i, multiplyResult.get(i) + remainder);
				}

				totalResult = addInterMediateToTotal(intermediateResult, totalResult);
			}
	    	Collections.reverse(totalResult);
	    	StringBuilder sb = new StringBuilder();
	        totalResult.forEach(x -> sb.append(x));
	        return sb.toString();
	    }

		
	}
	
	// I coded this solution.  It only works if num2 has a single digit.
	static class Solution1 {
	    public String multiply(String num1, String num2) {
	    	List<Integer> multiplyResult = new ArrayList<Integer>();
	    	
	    	int carry = 0;
	    	int remainder = 0;
	    	
	    	for (int i = num1.length()-1; i >= 0; i--) {
	    		Character c1 = num1.charAt(i);
	    		int i1 = Character.getNumericValue(c1);
	    		int i2 = Integer.parseInt(num2);
	    		
	    		int i3 = i1 * i2 + carry;
	    		carry = i3 / 10;
	    		remainder = i3%10;
	    		multiplyResult.add(remainder);
	    		if (i==0 && carry > 0) {
	    			multiplyResult.add(carry);
	    		}
	    	}
	    	Collections.reverse(multiplyResult);
	    	StringBuilder sb = new StringBuilder();
	        multiplyResult.forEach(x -> sb.append(x));
	        return sb.toString();
	    }
	}
	
	public static void main(String[] args) {
		
		Solution3 sol = new Solution3();
		//String n1 = "123456789";
		//String n2 = "987654321";		
		// Expected "121932631112635269" 
		// Actual   "111932631112635269"
		
		String n1 = "99";
		String n2 = "999";
		//Expected "98901"
		
		String ans = sol.multiply(n1, n2);
		System.out.println(ans);
	}

}
