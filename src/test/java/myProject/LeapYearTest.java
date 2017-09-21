package myProject;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;

@RunWith(value = Parameterized.class)
public class LeapYearTest {

	@Parameter(0)
	public int year;
	
	@Parameter(1)
	public boolean isLeapYear;
	
	@Parameterized.Parameters(name ="{index} is {0} leap year? {1}")
	public static Collection<Object[]> data() {
		
        return Arrays.asList(new Object[][] {
            { 1600, true },
            { 1800, false },
            { 2000, true },
            { 2017, false }
        });

	}
	
	@Test
	public void testLeapYear() {
		assertEquals(isLeapYear, LeapYear.isLeapYear(year));
	}
}
