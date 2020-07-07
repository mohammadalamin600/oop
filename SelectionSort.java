public class SelectionSort {
    public static void main (String[] args) {
        int i, j, minValue, minIndex = 0, temp = 0, d = 0;
        int [] array = {7, 8, 5, 4, 9, 2};
        for (i = 0; i < array.length; i++) {
            minValue = array[i];
            for (j = i; j < array.length; j++) {
                if (array[j] < minValue) {
                    minValue = array[j];
                    minIndex = j;
                }
            }
            if (minValue < array[i]) { //swaping positions
                temp = array[i];
                array[i] = array[minIndex];
                array[minIndex] = temp;
            }
            // print in this position to show the whole loop
        }
        for (d = 0; d < array.length; d++) {
            System.out.print (array[d] + "  ");
        }
    }
}
