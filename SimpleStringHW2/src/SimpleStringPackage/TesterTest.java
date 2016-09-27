package SimpleStringPackage;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TesterTest {

	char[] chars = {'w', 'o', 'r', 'd'};
	char[] noChars = {};
	char[] addOnWord = {'c','a','t'};
	SimpleString testString;
	SimpleString emptyString;
	SimpleString addOnString;
	SimpleString testString2;
	
	@Before
	public void setUp() {
		testString = new SimpleString(chars);
		emptyString = new SimpleString(noChars);
		addOnString = new SimpleString(addOnWord);
		testString2 = new SimpleString(chars);
	}
	
@After
	@Test
	public void testCharAt() {

		assertEquals('w', testString.charAt(0));
		assertEquals('o', testString.charAt(1));
		assertEquals('r', testString.charAt(2));
		assertEquals('d', testString.charAt(3));
		try{
			testString.charAt(chars.length);
			fail("Tried to pull a charAt index out of bounds");
			
		} catch (ArrayIndexOutOfBoundsException e) {
			assertTrue("Array out of bounds here", true);
		}
	}//testCharAt
	
	//assertEquals(double expected, double actual) 
	
	@Test
	public void testContains() {
		assertEquals(true,testString.contains('w'));
		assertEquals(true, testString.contains('o'));
		assertEquals(true,testString.contains('r'));
		assertEquals(true,testString.contains('d'));
		assertEquals(false,testString.contains('z'));
		assertEquals(false,testString.contains('1'));
		
	}
	
	@Test
	public void testIndexOf() {
		assertEquals(0, testString.indexOf('w'));
		assertEquals(1,testString.indexOf('o'));
		assertEquals(2,testString.indexOf('r'));
		assertEquals(3,testString.indexOf('d'));		
	}
	/**
	 * isEmpty(): returns true if the string contains no characters, false otherwise.

length(): returns the number of characters in the string.

concat(SimpleString s): returns a new SimpleString that consists of a copy of this SimpleString with a copy of s concatenated to the end.

substring(int startIndex, int endIndex): returns a new SimpleString that is a copy of the portion of this SimpleString that starts at index startIndex and ends at index endIndex - 1.

equals(Object o): returns true if this SimpleString is equal to o.

hashCode(): returns a hash code for this SimpleString.
expected, actual
	 */
	@Test
	public void testIsEmpty() {
		assertEquals( true, emptyString.isEmpty());
		assertEquals(false, testString.isEmpty());
	}
	
	@Test
	public void testLength() {
		assertEquals(4, testString.length());
		assertEquals(0, emptyString.length());
	}
	

	@Test
	public void testConcat() {
		assertEquals('c', testString.concat(addOnString).charAt(4));
		assertEquals('a', testString.concat(addOnString).charAt(5));
		assertEquals('t', testString.concat(addOnString).charAt(6));
		assertEquals('w', testString.concat(addOnString).charAt(0));
		assertEquals(7, testString.concat(addOnString).length());
		
	}
	
	@Test
	public void testSubstring() {
		assertEquals(3, testString.substring(0, 3).length());
		assertEquals('o', testString.substring(1, 3).charAt(0));
	}
	
	@Test
	public void testEquals() {
		assertEquals(true, testString.equals(testString));
		assertEquals(false, testString.equals(addOnString));
	}
	
	@Test
	public void testHashCode() {
		assertEquals(141947605, testString.hashCode());
	}
	

}
