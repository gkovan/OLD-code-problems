package linkedlists;

import java.util.Arrays;
import java.util.List;

public class UsingArrayListForTuples {
	
	public static void main(String[] args) {
		
		List<String> daniel1  = Arrays.asList("Daniel","Kovan", "04/04/2004");
		
		List<String> daniel2  = Arrays.asList("Daniel","Kovan", "04/04/2004");
		
		System.out.println("Are lists equal:" + daniel1.equals(daniel2));
		
		List<String> eliana1 = Arrays.asList("Eliana", "Kovan", "06/13/2006");
		
		System.out.println("Are lists equal:" + daniel1.equals(eliana1));
	}

}
