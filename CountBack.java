import java.util.Scanner;

public class CountBack {
    public static void main (String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.print("Which number to start?: ");
        int i = input.nextInt();
        while (i >= 0) {
            System.out.println (i);
            i -= 2;
        }
    }
}
