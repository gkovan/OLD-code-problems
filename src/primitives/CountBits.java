package primitives;

public class CountBits {
	
	public static void main(String[] args) {
		int a = 2;
		int aa = countBits(a);
		System.out.println(a + ": num of bits -> " + aa + ": " + Integer.toBinaryString(a));

		int aNeg = -2;
		int aaNeg = countBits(aNeg);
		System.out.println(aNeg + ": num of bits -> " + aaNeg + ": " + Integer.toBinaryString(aNeg));

		
		int b = 5;
		int bb = countBits(5);
		System.out.println(b + ": num of bits -> " + bb + ": " + Integer.toBinaryString(b));
		
		int c = Integer.MAX_VALUE;
		int cc = countBits(c);
		System.out.println(c + ": num of bits -> " + cc + ": " + Integer.toBinaryString(c));
		
		int d = Integer.MIN_VALUE;
		int dd = countBits(d);
		System.out.println(d + ": num of bits -> " + dd + ": " + Integer.toBinaryString(d));
		
		int e = Integer.MIN_VALUE+1;
		int ee = countBits(e);
		System.out.println(e + ": num of bits -> " + ee + ": " + Integer.toBinaryString(e));
		
		int f = -1;
		int ff = countBits(f);
		System.out.println(f + ": num of bits -> " + ff + ": " + Integer.toBinaryString(f));
	}
	
	public static short countBits(int x) {
		short numBits = 0;
		while (x!= 0) {
			numBits += (x&1);
			x >>>= 1;
		}
		return numBits;
	}

}
