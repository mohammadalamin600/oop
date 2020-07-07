public class getNumberOfDays {
    public static isLeapYear tmp1;
    public static int getNumberOfDays (int year, int month) {
        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) return 31;
        else if (month == 2)
        if (tmp1.isLeapYear(year)) return 29;
        else return 28;
        else return 30;
    }
}
