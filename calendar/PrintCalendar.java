import java.util.Scanner;

public class PrintCalendar {
    
    public static printMonthBody tmp2;
    public static printMonthTitle tmp1;
    
    public static void main (String args[]) {
        Scanner sc = new Scanner (System.in);
        System.out.print ("Enter a year starting at the year 1800: ");
        int year = sc.nextInt();
        System.out.print ("Enter the month as a value between 1 - 12: ");
        int month = sc.nextInt();
        tmp1.printMonthTitle (year, month);
        tmp2.printMonthBody (year, month);
        System.out.println();
    }
}
