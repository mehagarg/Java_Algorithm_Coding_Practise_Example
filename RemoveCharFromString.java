import static org.junit.Assert.*;

import org.junit.Test;


public class RemoveCharFromString {

	@Test
	public void removeAtBeginning() {
		assertEquals("bc", removeChar.remCharImproved("abc", 'a'));
		assertEquals("bc", removeChar.removeCharRecursive("abc", 'a'));
		assertEquals("bcdefgh", removeChar.remCharImproved("abcdefgh", 'a'));
		assertEquals("bcdefgh", removeChar.removeCharRecursive("abcdefgh", 'a'));
	}
	
	@Test
	public void removeAtMiddle(){
		assertEquals("abd", removeChar.remCharImproved("abcd", 'c'));
		assertEquals("abd", removeChar.removeCharRecursive("abcd", 'c'));
	}
	
	@Test
	public void removeAtEnd(){
		assertEquals("abc", removeChar.remCharImproved("abcd", 'd'));
		assertEquals("abc", removeChar.removeCharRecursive("abcd", 'd'));
	}

	@Test
	public void cornerCases(){
		assertEquals("", removeChar.remCharImproved("", 'd'));
		assertEquals("", removeChar.removeCharRecursive("", 'd'));
	}
}
