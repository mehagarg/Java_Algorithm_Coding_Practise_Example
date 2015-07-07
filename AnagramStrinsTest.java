import static org.junit.Assert.*;

import org.junit.Test;


public class AnagramStrinsTest {

	@Test
	public void isAnagram() {
		assertTrue(anagramStrings.isAnagram("pots", "tops"));
		assertTrue(anagramStrings.isAnagram("word", "wrdo"));
		assertTrue(anagramStrings.isAnagram("mary", "army"));
		assertFalse(anagramStrings.isAnagram("pts", "tops"));
	}
	@Test
	public void isAnagramWithLessTimeComplexity() {
		assertTrue(anagramStrings.isAnagramWithLessTimeComplexity("pots", "tops"));
		assertTrue(anagramStrings.isAnagramWithLessTimeComplexity("word", "wrdo"));
		assertTrue(anagramStrings.isAnagramWithLessTimeComplexity("mary", "army"));
		assertFalse(anagramStrings.isAnagramWithLessTimeComplexity("pts", "tops"));
	}

}
