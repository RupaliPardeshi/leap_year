import org.junit.Test;

import static org.junit.Assert.*;


public class YearAnalyzerTest {

    @Test
    public void ShouldReturnLeapYearIfYearIsDivisibleBy400() {
        YearAnalyzer yearAnalyzer = new YearAnalyzer();
        assertTrue(yearAnalyzer.isLeapYear(2000));
    }

    @Test
    public void ShouldNotReturnLeapYearIfYearIsNotDivisibleBy400() {
        YearAnalyzer yearAnalyzer = new YearAnalyzer();
        assertFalse(yearAnalyzer.isLeapYear(2008));
        assertFalse(yearAnalyzer.isLeapYear(2012));
        assertFalse(yearAnalyzer.isLeapYear(2016));
    }
}