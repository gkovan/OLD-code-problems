package primitives;


public class PrimitiveTypes {

	public static void main(String[] args) {
		bitWiseAnd();
		bitWiseOr();
		unsignedRightShift();
		signedRightShift();
		signedLeftShift();
	}
	
	public static void bitWiseAnd() {
		int bitwiseAnd = 6 & 4; 
		//  110 
		//  100 
		//------
		//  100  => 4
		assert 4 == bitwiseAnd;
	}
	
	public static void bitWiseOr() {
		int bitwiseOr = 6 | 4; 
		//  110 
		//  100 
		//------
		//  110  => 6
		assert 6 == bitwiseOr;
	}
	
	public static void unsignedRightShift() {
		int value1 = 12;
		//  1100  >>> 2  becomes 0011
		int unsignedRightShift1 = value1 >>> 2;
		assert 3 == unsignedRightShift1;
		
		int value2 = -12;
		//  1100  is 12
		//  0011
		int unsignedRightShift2 = value2 >>> 2;
		assert 1073741821 == unsignedRightShift2;
	}
	
	public static void signedRightShift() {
		int value1 = 12;
		//  1100  >>> 2  becomes 0011
		int unsignedRightShift1 = value1 >>> 2;
		assert 3 == unsignedRightShift1;
		
		int value2 = -12;
		//  1100  is 12
		//  0011
		int unsignedRightShift2 = value2 >>> 2;
		assert 1073741821 == unsignedRightShift2;
	}
	
	public static void signedLeftShift() {
		int value1 = 3;
		//  0011  <<< 2  becomes 1100
		int unsignedLeftShift1 = value1 << 2;
		assert 12 == unsignedLeftShift1;
		
		int value2 = -12;
		//  1100  is 12
		//  0011
		int unsignedLeftShift2 = value2 << 2;
		System.out.println(Integer.toBinaryString(value2));
		System.out.println(Integer.toBinaryString(unsignedLeftShift2));
		assert -48 == unsignedLeftShift2;
	}
}
