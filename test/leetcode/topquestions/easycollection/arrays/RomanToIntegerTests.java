package leetcode.topquestions.easycollection.arrays;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import leetcode.topquestions.easycollection.arrays.RomanToInteger;


/***
 * 
Roman Number Values

Symbol       Value
I             1
V             5
X             10
L             50
C             100
D             500
M             1000
 *
 */
class RomanToIntegerTests {

	@Test
	void test_CDLVIII_should_be_453() {
		/*  CDLVIII = 453 */
		
		RomanToInteger rToI= new RomanToInteger();
		int intVal = rToI.convert("CDLVIII");
		assertEquals(453, intVal);
	}
	
	@Test
	void test_CD_should_be_400() {
		RomanToInteger rToI= new RomanToInteger();
		int intVal = rToI.convert("CD");
		assertEquals(400, intVal);
	}

}
