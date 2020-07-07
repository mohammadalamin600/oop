public class CountNumberToZero {
    public static void main (String args[]) {
        int number = Integer.parseInt(args[0]);
        for (int i = number; i >= 0; i -= 2) {
            System.out.println (i);
        }
    }
}
