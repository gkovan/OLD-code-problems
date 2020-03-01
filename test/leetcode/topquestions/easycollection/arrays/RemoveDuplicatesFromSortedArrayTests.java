package leetcode.topquestions.easycollection.arrays;

import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.Test;

import leetcode.topquestions.easycollection.arrays.RemoveDuplicatesFromSortedArray;

class RemoveDuplicatesFromSortedArrayTests {

	@Test
	void givenAnArrayOfLen4WithNoDuplicatesShouldReturnLengthOf4() {
		//given
		int[] arr = {1,2,3,4};
		
		//when
		RemoveDuplicatesFromSortedArray rdfs = new RemoveDuplicatesFromSortedArray();
		int len = rdfs.removeDuplicates(arr);
		
		//then
		assertEquals(4,len);
	}
	
	@Test
	void givenAnArrayOfLen5WithOneoDuplicatesShouldReturnLengthOf4() {
		//given
		int[] arr = {1,1,2,3,4};
		
		//when
		RemoveDuplicatesFromSortedArray rdfs = new RemoveDuplicatesFromSortedArray();
		int len = rdfs.removeDuplicates(arr);
		
		//then
		assertEquals(4,len);
	}
	
	@Test
	void givenAnArrayOfLen6WithTwoDuplicatesShouldReturnLengthOf4() {
		//given
		int[] arr = {1,1,1,2,3,4};
		
		//when
		RemoveDuplicatesFromSortedArray rdfs = new RemoveDuplicatesFromSortedArray();
		int len = rdfs.removeDuplicates(arr);
		
		//then
		assertEquals(4,len);
	}
	
	@Test
	void givenAnArrayOfLen10WithSixDuplicatesShouldReturnLengthOf4() {
		//given
		int[] arr = {1,1,1,1,1,1,1,6,7,8};
		
		//when
		RemoveDuplicatesFromSortedArray rdfs = new RemoveDuplicatesFromSortedArray();
		int len = rdfs.removeDuplicates(arr);
		
		//then
		assertEquals(4,len);
	}
	
	@Test
	void givenAnArrayOfLen10WithFiveDuplicatesShouldReturnLengthOf4() {
		//given
		int[] arr = {1,2,2,2,2,2,2,2,7,8};
		
		//when
		RemoveDuplicatesFromSortedArray rdfs = new RemoveDuplicatesFromSortedArray();
		int len = rdfs.removeDuplicates(arr);
		
		//then
		assertEquals(4,len);
	}
	
	@Test
	void givenAnArrayOfLen7WithTwoSetsOfDupsShouldReturnLengthOf5() {
		//given
		int[] arr = {1,2,2,3,3,7,8};
		
		//when
		RemoveDuplicatesFromSortedArray rdfs = new RemoveDuplicatesFromSortedArray();
		int len = rdfs.removeDuplicates(arr);
		
		//then
		for (int i = 0; i < arr.length; i++)
		   System.out.print(arr[i] + ",");
		
		assertEquals(5,len);
	}
	
	@Test
	void givenAnArrayOfLen10WithFourSetsOfDupsShouldReturnLengthOf5Example2() {
		//given
		int[] arr = {0,0,1,1,1,2,2,3,3,4};
		
		//when
		RemoveDuplicatesFromSortedArray rdfs = new RemoveDuplicatesFromSortedArray();
		int len = rdfs.removeDuplicates(arr);
		
		//then
		for (int i = 0; i < arr.length; i++)
		   System.out.print(arr[i] + ",");
		
		assertEquals(5,len);
	}
	
	@Test
	void test2() {
		//given
		int[] arr = {0,0,0,1,1,1};
		
		//when
		RemoveDuplicatesFromSortedArray rdfs = new RemoveDuplicatesFromSortedArray();
		int len = rdfs.removeDuplicates(arr);
		
		//then
		for (int i = 0; i < arr.length; i++)
		   System.out.print(arr[i] + ",");
		
		assertEquals(2,len);
	}
}
