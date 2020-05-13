import org.junit.Test;

import static org.junit.Assert.*;


public class YearAnalyzerTest {

    @Test
    public void ShouldReturnLeapYearIfYearIsDivisibleBy400() {
        YearAnalyzer yearAnalyzer = new YearAnalyzer();
        assertTrue(yearAnalyzer.isLeapYear(2000));
    }

    @Test
    public void ShouldReturnYearAsLeapIfYearIsDivisibleBy4() {
        YearAnalyzer yearAnalyzer = new YearAnalyzer();
        assertTrue(yearAnalyzer.isLeapYear(2008));
        assertTrue(yearAnalyzer.isLeapYear(2012));
        assertTrue(yearAnalyzer.isLeapYear(2016));
        assertTrue(yearAnalyzer.isLeapYear(1900));
    }

    @Test
    public void ShouldNotReturnYearAsLeapIfYearIsNotDivisibleBy4() {
        YearAnalyzer yearAnalyzer = new YearAnalyzer();
        assertFalse(yearAnalyzer.isLeapYear(2018));
    }
}