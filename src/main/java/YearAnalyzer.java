public class YearAnalyzer {

    public boolean isLeapYear(int year) {
        if (year % 400 == 0)
            return true;
        return year % 4 == 0;
    }
}
