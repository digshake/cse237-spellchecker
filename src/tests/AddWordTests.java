package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AddWordTests {

	private SpellChecker sc;
	
	@BeforeEach
	void setupTestingObjects() {
		sc = new SpellChecker();
	}
	
	@Test
	void testAddNewWord() {
		//run the behavior
		sc.addWord("cat");
		//check result
		asserTrue(sc.checkWord("cat"));
	}
	
	@Test
	void testAddExistingWord() {
		//run the behavior
		sc.addWord("cat");
		sc.addWord("cat");
		//check result
		assertTrue(true);//if i got here, no error happened
	}
	
	@Test
	void testAddWordDifferentCapitalization() {
		
	}

}
