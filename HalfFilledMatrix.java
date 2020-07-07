public class HalfFilledMatrix {
    public static void main (String args[]) {
    int matrix[][];
    matrix = new int[5][5];
    System.out.println ("      Half Filled Matrix");
    for (int i = 0; i <= 4; i++) {
        for (int j = 0; j <= i; j++) {
            matrix[i][j] = i + j;
        }
    }
    for (int i = 0; i <= 4; i++) {
        for (int j = 0; j <= 4; j++) {
            System.out.printf ("%10d", matrix[i][j]);
        }
        System.out.println();
    }
}
}