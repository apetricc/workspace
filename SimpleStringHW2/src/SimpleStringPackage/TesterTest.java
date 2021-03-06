

/**
 * SimpleString Test Driven Development
 * Andrew Petriccione
 * csci 373 Fall 2016
 * Dr. Sheaffer 
 */
package SimpleStringPackage;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TesterTest {

	char[] chars = { 'w', 'o', 'r', 'd' };
	char[] chars2 = { 'w', 'o', 'r', 'd' };
	char[] noChars = {};
	char[] addOnWord = { 'c', 'a', 't' };
	SimpleString testString;
	SimpleString emptyString;
	SimpleString addOnString;
	SimpleString testString2;

	@Before
	public void setUp() {
		testString = new SimpleString(chars);
		emptyString = new SimpleString(noChars);
		addOnString = new SimpleString(addOnWord);
		testString2 = new SimpleString(chars2);
	}

	@Test
	public void testSimpleStringContents() {

		assertEquals('w', testString.charAt(0));
		assertEquals('o', testString.charAt(1));
		assertEquals('r', testString.charAt(2));
		assertEquals('d', testString.charAt(3));
		try {
			testString.charAt(chars.length);
			fail("Tried to pull a charAt index out of bounds");

		} catch (IndexOutOfBoundsException e) {
			assertTrue("Index out of bounds here", true);
		}
	}// testSimpleStringContents

	@Test
	public void testFirstChar() {
		assertEquals('w', testString.charAt(0));
	}

	@Test
	public void testLastChar() {
		assertEquals('d', testString.charAt(testString.length() - 1));
	}

	@Test
	public void testContainsWord() {
		assertEquals(true, testString.contains('w'));
		assertEquals(true, testString.contains('o'));
		assertEquals(true, testString.contains('r'));
		assertEquals(true, testString.contains('d'));
	}

	@Test
	public void testShouldNotContain() {
		assertEquals(false, testString.contains('z'));
		assertEquals(false, testString.contains('1'));

	}

	@Test
	public void testIndexOfStartOfCharArray() {
		assertEquals(0, testString.indexOf('w'));
	}

	@Test
	public void testIndexOfEndOfCharArray() {
		assertEquals(3, testString.indexOf('d'));
	}

	@Test
	public void testIsEmpty() {
		assertEquals(true, emptyString.isEmpty());
	}

	@Test
	public void testIsNotEmpty() {
		assertEquals(false, testString.isEmpty());
	}

	@Test
	public void testLength() {
		assertEquals(4, testString.length());
	}

	@Test
	public void testNoLength() {
		assertEquals(0, emptyString.length());

	}

	@Test
	public void testFirstLetterConcat() {
		assertEquals('c', testString.concat(addOnString).charAt(4));
	}

	@Test
	public void testLastLetterConcat() {
		assertEquals('t', testString.concat(addOnString).charAt(6));
	}

	@Test
	public void testConcatLength() {
		assertEquals(7, testString.concat(addOnString).length());
	}

	@Test
	public void testSubstringLength() {
		assertEquals(3, testString.substring(0, 3).length());
	}

	@Test
	public void testFirstCharOfSubstring() {
		assertEquals('o', testString.substring(1, 3).charAt(0));
	}

	@Test
	public void testLastCharOfSubstring() {
		assertEquals('r', testString.substring(1, 3).charAt(1));

	}

	@Test
	public void testEquals() {
		assertEquals(true, testString.equals(testString2));

	}

	@Test
	public void testNotEquals() {
		assertEquals(false, testString.equals(addOnString));
	}

	@Test
	public void testHashCode() {
		assertEquals(testString2.hashCode(), testString.hashCode());
	}

}
