public class PrintArray {
    public static void main (String[] args) {
        System.out.println ("Index    Value");
        int [] array = {15, 18, 20, 1, 5, 22, 0, 23};
        for (int x = 0; x < array.length; x++) {
            // System.out.print (array[x] + "     "); // showing all in same line
            // System.out.println (" " + array[x] + "     "); // showing in each line
            System.out.println ("  " + x + "       " + array [x]); // indexing the values
        }
    }
}
