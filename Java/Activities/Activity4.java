package activities;

import java.util.Arrays;

class Activity4 {
    static void ascendingSort(int array[]) {
        int size = array.length, i;
        
        for (i = 1; i < size; i++) {
            int k = array[i];
            int j = i - 1;
            
            while (j >= 0 && k < array[j]) {
                array[j + 1] = array[j];
                --j;
            }
            array[j + 1] = k;
        }
    }
    
    public static void main(String args[]) {
        int[] numberarray = { 8, 6, 2, 7, 3, 5 };
        System.out.println("Array before sorting: " + Arrays.toString(numberarray));
        ascendingSort(numberarray);
        System.out.println("Array after sorting: " +Arrays.toString(numberarray));
    }
}