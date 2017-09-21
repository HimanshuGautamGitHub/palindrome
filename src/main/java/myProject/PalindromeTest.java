package myProject;

public class PalindromeTest {

	
	public static boolean isPalindrome(String input) {
		StringBuilder inputBuilder = new StringBuilder(input);
		String reverseInput = inputBuilder.reverse().toString();
		
		return input.equalsIgnoreCase(reverseInput);
	}
}
