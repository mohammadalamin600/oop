public class printMonthTitle {
    
    public static getMonthName tmp;
    
    public static void printMonthTitle (int year, int month) {
        System.out.println ("                         " + tmp.getMonthName (month) + " " + year); // 25 spaces
        System.out.println ("      --------------------------------------------------"); // 6 spaces, 50 dashes
        System.out.println ("      Mon     Tue     Wed     Thu     Fri     Sat    Sun"); // 6 spaces, 5 spaces between words
    }
}