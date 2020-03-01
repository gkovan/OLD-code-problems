package recursion;

public class ReverseAStringUsingRecursion {
	
	private static String reverseString(String s) {
		if (s.length() < 2) {
			return s;
		}
		System.out.println(s);
		return reverseString(s.substring(1)) + s.substring(0,1) ;
	}
	
	public static void main(String[] args) {
		
		String str = "gerry";
		String reversedString = reverseString(str);
		System.out.println(reversedString);
		
	}

}
