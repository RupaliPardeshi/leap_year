import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;


public class YearAnalyzerTest {
    private YearAnalyzer yearAnalyzer;

    @Before
    public void setUp() {
        yearAnalyzer = new YearAnalyzer();
    }

    @Test
    public void ShouldReturnLeapYearIfYearIsDivisibleBy400() {
        assertTrue(yearAnalyzer.isLeapYear(2000));
    }

    @Test
    public void ShouldReturnYearAsLeapIfYearIsDivisibleBy4() {
        assertTrue(yearAnalyzer.isLeapYear(2008));
        assertTrue(yearAnalyzer.isLeapYear(2012));
        assertTrue(yearAnalyzer.isLeapYear(2016));

    }

    @Test
    public void ShouldNotReturnYearAsLeapIfYearIsNotDivisibleBy400ButDivisibleBy100() {
        assertFalse(yearAnalyzer.isLeapYear(1900));
    }

    @Test
    public void ShouldNotReturnYearAsLeapIfYearIsNotDivisibleBy4() {
        assertFalse(yearAnalyzer.isLeapYear(2018));
    }
}