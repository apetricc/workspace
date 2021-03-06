/**
 * SimpleString Test Driven Development
 * Andrew Petriccione
 * csci 373 Fall 2016
 * Dr. Sheaffer 
 */



package SimpleStringPackage;
import java.util.Arrays;

import org.junit.Before;

public class SimpleString {
	char[] contents;
	private int length;

	/**
	 * SimpleString is an array of chars
	 * 
	 * @param contents
	 *            the array of chars that makes the SimpleString.
	 */
	public SimpleString(char[] contents) {
		if (contents.length != 0) {
			this.contents = Arrays.copyOf(contents, contents.length);
		}
		this.length = contents.length;

	}

	/**
	 * charAt returns the character at the index specified.
	 * 
	 * @param index
	 *            the index of the char value.
	 * @return the char value at the specified index of this SimpleString. The
	 *         first char value is at index 0.
	 */
	public char charAt(int index) {
		if (index < 0 || index >= contents.length)
			throw new IndexOutOfBoundsException("index: " + index);
		return this.contents[index];
	}

	/**
	 * Returns true if and only if this SimpleString contains the specified
	 * char.
	 * 
	 * @param c
	 *            the sequence to search for
	 * @return true if this SimpleString contains c, false otherwise
	 */
	public boolean contains(char c) {
		for (int i = 0; i < this.length; i++) {
			if (this.contents[i] == c) {
				return true;
			}
		}
		return false;
	}// contains

	/**
	 * Returns the index within this SimpleString of the first occurrence of the
	 * specified character.
	 * 
	 * @param c
	 *            a character
	 * @return the index of the first occurrence of the character in the
	 *         character sequence represented by this object, or -1 if the
	 *         character does not occur.
	 */
	public int indexOf(char c) {
		for (int i = 0; i < this.length; i++) {
			if (this.contents[i] == c) {
				return i;
			}
		}
		return -1;
	}// indexOf

	/**
	 * Returns true if, and only if, length() is 0.
	 * 
	 * @return true if length() is 0, otherwise false
	 */
	public boolean isEmpty() {
		if (this.length == 0)
			return true;
		return false;
	}// isEmpty

	/**
	 * Returns the length of this SimpleString. The length is equal to the
	 * number of chars in the SimpleString.
	 * 
	 * @return Returns the length of this SimpleString.
	 */
	public int length() {
		return this.length;
	}

	/**
	 * Concatenates the specified SimpleString to the end of this SimpleString.
	 * 
	 * @param s
	 *            the SimpleString that is concatenated to the end of this
	 *            SimpleString.
	 * @return a SimpleString that represents the concatenation of this object's
	 *         characters followed by the SimpleString argument's characters.
	 */

	public SimpleString concat(SimpleString s) {
		char[] letters = new char[this.length + s.length];
		SimpleString combined;
		for (int i = 0; i < this.length; i++) {
			letters[i] = this.charAt(i);
			// letters[i+this.length-1] = s.charAt(i);
		}
		for (int j = 0; j < s.length; j++) {
			letters[j + this.length] = s.charAt(j);
		}
		combined = new SimpleString(letters);
		return combined;
	}

	/**
	 * Returns a SimpleString that is a substring of this SimpleString. The
	 * substring begins at the specified beginIndex and extends to the character
	 * at index endIndex - 1. Thus the length of the substring is
	 * endIndex-beginIndex.
	 * 
	 * @param startIndex
	 *            - the beginning index, inclusive.
	 * @param endIndex
	 *            - the ending index, exclusive.
	 * @return the specified substring.
	 */
	public SimpleString substring(int startIndex, int endIndex) {
		SimpleString substring;
		char[] substringChars = new char[Math.abs(endIndex - startIndex)];
		for (int i = 0; i < substringChars.length; i++) {
			substringChars[i] = this.charAt(i + startIndex);
		}
		substring = new SimpleString(substringChars);
		return substring;
	}// substring

	/**
	 * Returns a hash code for this string.
	 * 
	 * @override hashCode in class Object
	 * @return a hash code value for this object.
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(contents);
		result = prime * result + length;
		return result;
	}

	/**
	 * Compares this SimpleString to the specified object. The result is true if
	 * and only if the argument is not null and is a SimpleString object that
	 * represents the same sequence of characters as this object.
	 * 
	 * @override equals in class Object
	 * @obj - The object to compare this SimpleString against
	 * @return true if the given object represents a SimpleString equivalent to
	 *         this SimpleString, false otherwise
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SimpleString other = (SimpleString) obj;
		if (!Arrays.equals(contents, other.contents))
			return false;
		if (length != other.length)
			return false;
		return true;
	}

	public static void main(String[] args) {
		char[] chars = { 'w', 'o', 'r', 'd' };
		char[] noChars = {};
		char[] addOnWord = { 'c', 'a', 't' };
		char[] chars2 = { 'w', 'o', 'r', 'd' };
		SimpleString testString;
		SimpleString emptyString;
		SimpleString addOnString;
		testString = new SimpleString(chars);
		emptyString = new SimpleString(noChars);
		addOnString = new SimpleString(addOnWord);
		SimpleString testString2 = new SimpleString(chars2);
		System.out.println("The Substring of word is : " + testString.substring(0, 10));
		System.out.println("Teststring and testString2 should be equal and have the same hash, are they equal: "
				+ testString.equals(testString2) + " what are their hashes?: " + testString.hashCode()
				+ " and testString2: " + testString2.hashCode());
		System.out.println(testString.equals(testString));
		System.out.println(testString.equals(emptyString));
		System.out.println(testString.hashCode());
		System.out.println(testString.hashCode());
		System.out.println(emptyString.hashCode());
	}

}// SimpleString