public class getTotalNumberOfDays {
    
    public static getNumberOfDays temp1;
    public static isLeapYear temp2;

    public static int getTotalNumberOfDays (int year, int month) {
        int total = 0;
        for (int i = 1800; i < year; i++)
        if (temp2.isLeapYear (i))
        total = total + 366;
        else total = total + 365;
        for (int i = 1; i < month; i++)
        total = total + temp1.getNumberOfDays (year, i);
        
        return total;
    }
}
