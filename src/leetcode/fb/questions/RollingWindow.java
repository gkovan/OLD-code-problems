package leetcode.fb.questions;

public class RollingWindow {
	
	public static void main (String[] args) {
		
		String str = "abc";
		int windowSize = 3;
		
		for (int j = 3; j > 0; j--) {
			for (int i = 0; i + j <= str.length(); i++) {
				System.out.println(str.substring(i, i + j));
			}
		}

	}

}
