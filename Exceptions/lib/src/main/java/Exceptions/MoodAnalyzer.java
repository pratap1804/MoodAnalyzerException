package Exceptions;

public class MoodAnalyzer {
	
	String message;
	
	public MoodAnalyzer(String message) {
		super();
		this.message = message;
	}
	
	public MoodAnalyzer() {
		super();
	}

	public String analyseMood(String string) {
		if(string  == "sad") {
		return "SAD";
		} else {
			return "HAPPY";
		}
	}
    public static void main(String[]args) {
    	System.out.println("welcome to the exception handling!");
    }
}
