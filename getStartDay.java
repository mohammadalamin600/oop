public class getStartDay {
    
    public static getTotalNumberOfDays tmp1;
    
    public static int getStartDay (int year, int month) {
        final int START_DAY_FOR_JAN_1_1800 = 2;
        int totalNumberOfDays = tmp1.getTotalNumberOfDays (year, month);
        return (totalNumberOfDays + START_DAY_FOR_JAN_1_1800) % 7;
    }
}