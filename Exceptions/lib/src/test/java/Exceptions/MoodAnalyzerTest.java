package Exceptions;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MoodAnalyzerTest {

	@Test
	void givenNullMoodShouldReturnHappyShouldPassTheTest() {
	MoodAnalyzer object = new MoodAnalyzer("null");
	String result = object.analyseMood();
	Assertions.assertEquals("HAPPY",result);
	}
}
