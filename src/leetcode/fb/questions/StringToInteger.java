package leetcode.fb.questions;

import java.math.BigInteger;

public class StringToInteger {
	
	// this solution is the fastest on leet code; completed all test cases in 1 ms.
	static class Solution3 {
	    public int myAtoi(String str) {
	        int i = 0, result = 0, sign = 1;

	        while (i < str.length() && str.charAt(i) == ' ') i++;
	        
	        if (i < str.length() && str.charAt(i) == '+') {
	            i++;
	        } else if (i < str.length() && str.charAt(i) == '-') {
	            sign = -1;
	            i++;
	        }
	        
	        if (i < str.length() && !Character.isDigit(str.charAt(i))) return 0;
	        
	        while (i < str.length() && str.charAt(i) >= '0' && str.charAt(i) <= '9') {
	            //possible overflow
	            if (result > Integer.MAX_VALUE /10 || (result == Integer.MAX_VALUE / 10 && str.charAt(i) - '0' > Integer.MAX_VALUE % 10)) {
	                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
	            }
	            result = result * 10 + (str.charAt(i) - '0');
	            i++;
	        }
	        return result * sign;
	    }
	}
	
	static class Solution2 {
	    public int myAtoi(String str) {
	        if (str == null || str.length() == 0) {
	            return 0;
	        }
	        
	        // Skip whitespaces
	        int i = 0;
	        while(i < str.length() && str.charAt(i) == ' ') {
	            i++;
	        }
	        
	        // Handle the sign
	        boolean isNeg = false;
	        if (i < str.length() && str.charAt(i) == '-') {
	            isNeg = true;
	            i++;
	        } else if (i < str.length() && str.charAt(i) == '+') {
	            isNeg = false;
	            i++;
	        }
	        
	        // Grab the number [numStart, i]
	        int numStart = i;
	        while (i < str.length() && str.charAt(i) >= '0' && str.charAt(i) <= '9') {
	            i++;
	        }
	        
	        if (numStart == i) {
	            return 0;
	        }
	        
	        // Form a long number, check for bounds.
	        // Convert to int at the end.
	        long res = 0;
	        for (int k = numStart; k < i; k++) {
	            int digit = str.charAt(k) - '0';
	            res *= 10;
	            res = isNeg ? res - digit : res + digit;
	            if (res < Integer.MIN_VALUE) {
	                res = Integer.MIN_VALUE;
	                return (int) res;
	            }
	            if (res > Integer.MAX_VALUE) {
	                res = Integer.MAX_VALUE;
	                return (int) res;
	            }
	        }

	        return (int) res;
	    }
	}
	
	// my solution; passed all test cases; took 3 ms which is in the top 25%
	static class SolutionOptimized {
		public int myAtoi(String str) {
			
			if (str == null || str.equals("")) {
				return 0;
			}

			int result = 0;

			boolean isNegative = false;
			
			int cnt = 0;
			while (cnt < str.length() && str.charAt(cnt) == ' ') {
				cnt++;
			}
			
			if (cnt == str.length()) {
				return 0;
			}
			
			String str2 = str.substring(cnt);
			
			Character c0 = str2.charAt(0);
			if (Character.isAlphabetic(c0)) {
				result = 0;
				return result;
			}
			
			if (c0 == '-') {
				isNegative = true;
				str2 = str2.substring(1);
			} else if (c0 == '+') {
				str2 = str2.substring(1);
			} else if (Character.isDigit(c0) == false) {
				return 0;
			}
			
			StringBuilder sb = new StringBuilder();
			for (int i = 0; i < str2.length(); i++) {
				Character c = str2.charAt(i);
				if (Character.isDigit(c)) {
				   sb.append(c);				
				} else {
					break;
				}
			}
			
			if (sb.length() == 0) {
				return 0;
			}

			
			try {
			   result = Integer.parseInt(sb.toString());
			} catch (java.lang.NumberFormatException e) { 
				return isNegative ? Integer.MIN_VALUE : Integer.MAX_VALUE;
			}
			
			if (isNegative == true) {
				result = result * -1;
			}
			
			return result;
		}
	}

	// my solution; passed all test cases; took 20 ms which is in the bottom 5 %
	static class Solution {
		public int myAtoi(String str) {
			
			if (str == null || str.equals("")) {
				return 0;
			}

			int result = 0;

			boolean isNegative = false;
			
			int cnt = 0;
			while (cnt < str.length() && str.charAt(cnt) == ' ') {
				cnt++;
			}
			
			if (cnt == str.length()) {
				return 0;
			}
			
			System.out.println("cnt : " + cnt);
			System.out.println(str.substring(cnt));
			String str2 = str.substring(cnt);
			
			Character c0 = str2.charAt(0);
			if (Character.isAlphabetic(c0)) {
				result = 0;
				return result;
			}
			
			if (c0 == '-') {
				isNegative = true;
				str2 = str2.substring(1);
			} else if (c0 == '+') {
				str2 = str2.substring(1);
			} else if (Character.isDigit(c0) == false) {
				return 0;
			}
			
			StringBuilder sb = new StringBuilder();
			for (int i = 0; i < str2.length(); i++) {
				Character c = str2.charAt(i);
				if (Character.isDigit(c)) {
				   sb.append(c);				
				} else {
					break;
				}
			}
			
			if (sb.length() == 0) {
				return 0;
			}
			
			System.out.println("GK str2: " + str2);
			System.out.println("GK: " + sb.toString());

			long resultLong;
			try {
			   resultLong = Long.parseLong(sb.toString());
			} catch (java.lang.NumberFormatException e) {
				return isNegative ? Integer.MIN_VALUE : Integer.MAX_VALUE;
			}
			
			if (resultLong >= Integer.MAX_VALUE && isNegative == false) {
				result = Integer.MAX_VALUE;
				return result;
			} else if (isNegative == true) {
				resultLong = resultLong * -1;
				if (resultLong <= Integer.MIN_VALUE) {
					result = Integer.MIN_VALUE;
					return result;
				}
			} 
			System.out.println("String builder : " + sb.toString());
			result = Integer.parseInt(sb.toString());
			if (isNegative == true) {
				result = result * -1;
			}
			
			return result;
		}
	}

	public static void main(String[] args) {
		SolutionOptimized sol = new SolutionOptimized();

		String str = "20000000000000000000";
		int value = sol.myAtoi(str);
		System.out.println(value);
	}
}
