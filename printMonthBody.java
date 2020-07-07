public class printMonthBody {

    public static getStartDay tmp1;
    public static getNumberOfDays tmp2;

    public static void printMonthBody (int year, int month) {

        int startDay = tmp1.getStartDay (year, month);
        int numberOfDaysInMonth = tmp2.getNumberOfDays (year, month);

        int i = 0;

        for (i = 0; i < startDay; i++)
            System.out.print ("        "); // 8 spaces
        for (i = 1; i <= numberOfDaysInMonth; i++) {
            System.out.printf ("%8d", i);
            if ((i + startDay) % 7 == 0)
                System.out.println();
        }
    }
}