package project_euler;

import java.lang.Math;

public class Problem9_PythagoreanTriplet {
	
	static class Solution {
		
		
		public double pythagoreanTripleProduct(double sumOfTriplet) {
			
			for (int a = 1; a < sumOfTriplet; a++) {
				for (int b = 1; b < sumOfTriplet; b++ ) {
					double aSquared = a*a;
					double bSquared = b*b;
					double cSquared = aSquared + bSquared;
					if ((aSquared + bSquared) == cSquared) {
						double c = Math.sqrt(cSquared);
						if ((a + b + c) == sumOfTriplet) {
							System.out.println(a + " " + b + " " + c);
							return a*b*c;
						}
					}
				}
			}
			
			return 0;
		}
		
	}

	public static void main (String[] args) {
		
		Solution sol = new Solution();
		double sumOfTriplet = 1000;
		System.out.println((long) sol.pythagoreanTripleProduct(sumOfTriplet));
		
	}
}
