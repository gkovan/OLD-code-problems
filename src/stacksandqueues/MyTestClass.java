package stacksandqueues;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class MyTestClass {
	
	public static void main(String[] args) {
		char c1 = '9';
		char c2 = '2';
		int c3 = (int) c1 + (int) c2;
		System.out.println(Character.getNumericValue(c1));
		
		Integer[] myIntArray = {1,2,3};
		Arrays.asList(myIntArray).forEach(x -> System.out.println(x));	
		
        // get all substrings
		String s = "Gerry";
        List<String> subStrings = new ArrayList<String>();
        for (int i = 0; i < s.length(); i++) {
            subStrings.add(s.substring(i));
        }
        
        Iterator iter = subStrings.iterator();
        while (iter.hasNext()) {
            String str = (String) iter.next();
            System.out.println(str);
        }
	}
}
