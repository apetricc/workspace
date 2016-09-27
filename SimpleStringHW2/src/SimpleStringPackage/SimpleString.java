package SimpleStringPackage;
import java.util.Arrays;

import org.junit.Before;

public class SimpleString {
	char[] contents;
	private int length;

	public SimpleString(char[] contents) {
		super();
		if (contents.length != 0) {
		this.contents = Arrays.copyOf(contents, contents.length);
		}
		this.length = contents.length;
		
	}
/**
 * Define a character array instance variable to hold the contents of your SimpleString.
Write a constructor that takes an array of characters as its parameter. Copy the actual argument into the above instance variable.
Methods:
	charAt(int index): returns the character at the given index.
contains(char c): returns true if the string contains the character c, false otherwise.

indexOf(char c): returns the index of the first occurrence of the character c in the string, -1 if the character does not appear in the string.

isEmpty(): returns true if the string contains no characters, false otherwise.

length(): returns the number of characters in the string.

concat(SimpleString s): returns a new SimpleString that consists of a copy of this SimpleString with a copy of s concatenated to the end.

substring(int startIndex, int endIndex): returns a new SimpleString that is a copy of the portion of this SimpleString that starts at index startIndex and ends at index endIndex - 1.

equals(Object o): returns true if this SimpleString is equal to o.

hashCode(): returns a hash code for this SimpleString.
 * @param c
 * @return
 */
	
	public char charAt(int index) {
		return this.contents[index];
	}
	
	public boolean contains(char c) {
		for (int i = 0; i < this.length; i++) {
			if (this.contents[i]==c) {
				return true;
			}
		}
		return false;
	}//contains
	
	public int indexOf(char c) {
		for (int i = 0; i < this.length; i++) {
			if (this.contents[i] == c) {
				return i;
			}
		}
		return -1;
	}//indexOf
	
	public boolean isEmpty() {
		if (this.length == 0) return true;
		return false;
	}//isEmpty
	
	public int length() {		
		return this.length;
	}
	
	public SimpleString concat(SimpleString s) {
		char[] letters = new char[this.length + s.length];
		SimpleString combined;
		for (int i = 0; i < this.length; i++) {
			letters[i] = this.charAt(i);
			//letters[i+this.length-1] = s.charAt(i);
		}		
		for (int j = 0; j < s.length; j++) {
			letters [j+this.length] = s.charAt(j);
		}
		combined = new SimpleString(letters); 
		return combined;
	}
	
	public String printConcat(SimpleString second) {
		String result = "";
		for (int i = 0; i < (this.length()+ second.length()); i++) {
			result += (this.concat(second).charAt(i));
		}
		return result;
	}//printConcat

	/**
	 * substring(int startIndex, int endIndex): returns a new SimpleString that is a copy 
	 * of the portion of this SimpleString that starts at index startIndex and ends at index endIndex - 1.
	 * @param startIndex
	 * @param endIndex
	 * @return
	 */
	public SimpleString substring(int startIndex, int endIndex) {
		SimpleString substring;
		char[] substringChars = new char[Math.abs(endIndex-startIndex)];
		for (int i = 0; i < substringChars.length; i++) {
			substringChars[i] = this.charAt(i + startIndex);
		}
		substring = new SimpleString(substringChars);
		return substring;
	}//substring
	
//	equals(Object o): returns true if this SimpleString is equal to o.
  public boolean equals(Object o) {
	  return (this == o);
  }
  
//	hashCode(): returns a hash code for this SimpleString.
  @Override
  public int hashCode() {
	  int hashCode = 7;
	  int i = 1;
	  int limit = (contents != null) ? contents.length : 0;
	  
		  while (i < limit) {
			  hashCode = 31 * Integer.hashCode(contents.length + i);
			  i++;
		  }  
	  
	  hashCode = 31 * Arrays.hashCode(contents);
	  
	  return hashCode;
  }
	public static void main(String[] args) {
		char[] chars = {'w', 'o', 'r', 'd'};
		char[] noChars = {};
		char[] addOnWord = {'c','a','t'};
		SimpleString testString;
		SimpleString emptyString;
		SimpleString addOnString;
			testString = new SimpleString(chars);
			emptyString = new SimpleString(noChars);
			addOnString = new SimpleString(addOnWord);
		
		System.out.println(testString.printConcat(addOnString));
		System.out.println(testString.equals(testString));
		System.out.println(testString.equals(emptyString));
		System.out.println(testString.hashCode());
		System.out.println(testString.hashCode());
		System.out.println(emptyString.hashCode());
	}

	
	
}//SimpleString