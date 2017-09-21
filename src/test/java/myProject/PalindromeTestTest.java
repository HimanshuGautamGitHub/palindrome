package myProject;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

@RunWith(value =Parameterized.class)
public class PalindromeTestTest {

	
	@Parameter(0)
	public String input;
	
	@Parameter(1)
	public boolean result;
	
	@Parameterized.Parameters(name ="Test {0} , palindrome is ? {1}")
	public static Collection<Object[]> data() {
		
        return Arrays.asList(new Object[][] {
            { "MADAM", true },
            { "madam", true },
            { "Madam", true },
            { "Ravi", false }
        });

	}
	
	@Test
	public void palindromeCheck_validPalindrome_true() {
		assertEquals(result, PalindromeTest.isPalindrome(input));
	}
	
	
	
	
	
	

}
