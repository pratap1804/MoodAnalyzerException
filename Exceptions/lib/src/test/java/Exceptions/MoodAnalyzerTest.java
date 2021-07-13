package Exceptions;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MoodAnalyzerTest {

	@Test
	void HappyOrSadMessage() {
	MoodAnalyzer object1 = new MoodAnalyzer("I am in Sad Mood");
	String result1 = object1.analyseMood("sad");
	Assertions.assertEquals("SAD",result1);
	
	MoodAnalyzer object2 = new MoodAnalyzer("I am in any Mood");
	String result2 = object2.analyseMood("happy");
	Assertions.assertEquals("HAPPY",result2);
	
	}
}
