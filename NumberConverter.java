import java.util.Scanner;
class NumberConverter {
    public static void main (String args[]) {
        Scanner input = new Scanner (System.in);
        System.out.print ("Please enter a number you want to convert.");
        int num = input.nextInt();
        
        String BinStr = Integer.toBinaryString(num);
        String HexStr = Integer.toHexString(num);
        String OctStr = Integer.toOctalString(num);
        
        System.out.println ("The binary representation is: "+ BinStr);
        System.out.println ("The hexadecimal representation is: "+ HexStr);
        System.out.println ("The octal representation is: " + OctStr);
    }
}