package linkedlists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/*
 * addAll, binarySearch, fill, swap, min(C), max(C), max(C, cmp), reverse(list)
 * rotate(list, 12), sort(list), sort(list, cmp)
 */

public class CollectionsPractice {
	
	public static void main(String[] args) {
		
		// addAll
		List<String> myKids = new ArrayList<String>();
		Collections.addAll(myKids, "Daniel", "Eliana", "Michaela", "David");
		myKids.forEach(kid -> System.out.println(kid));
		myKids.stream().map(kid -> kid.toUpperCase()).forEach(kid -> System.out.println(kid));
	
		// sort in ascending order
		List<Integer> ages = Arrays.asList(15,8, 47, 11, 13, 37);
		Collections.sort(ages);
		ages.forEach(age -> System.out.println(age));
		
		// binary search
		int  found = Collections.binarySearch(ages, 15);
		System.out.println("Found returns the index of the element in list: " + found);
		
		int notFound = Collections.binarySearch(ages, 7);
		System.out.println("Not found returns -1: " + notFound);
		
		
		// swap
		Collections.swap(ages, 0, 5);   // swap first and fifth element in the list
		ages.forEach(age -> System.out.println(age));
		
		//min
		Integer minAge = Collections.min(ages);
		System.out.println("Minimum age in list is: " + minAge);
		
		//max
		Integer maxAge = Collections.max(ages);
		System.out.println("Maximum age in list is: " + maxAge);
		
		//min - another approach using the max method with comparator
		Integer minAge2 = Collections.max(ages, Collections.reverseOrder());
		System.out.println("Minimum age (approach 2 using comparator) in list is: " + minAge2);

		// sort in descending order using comparator
		List<Integer> ages2 = Arrays.asList(15,8, 47, 11, 13, 37);
		Collections.sort(ages2, Collections.reverseOrder());
		System.out.println("Sort in descending order:");
		ages2.forEach(age -> System.out.println(age));
		
		// reverse list
		System.out.println("Reverse the list - should now print ages in ascending order:");
		Collections.reverse(ages2);
		ages2.forEach(age -> System.out.println(age));
		
		// rotate the list 3 places 
		System.out.println("Rotating the list 3 places:");
		Collections.rotate(ages2, 3);
		ages2.forEach(age -> System.out.println(age));
	}

}
