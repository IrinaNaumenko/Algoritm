package Lesson4;

import java.util.Arrays;

public class MargeSort {
    public static void main(String[] args) {
        int [] arrTwo = {72,86,55,119,4, 56,445,892};
        System.out.println("Merge sort before:  " + Arrays.toString(arrTwo));
        margeSort(arrTwo,arrTwo.length);
        System.out.println("Merge sort after:  "+Arrays.toString(arrTwo));

    }
    private static void margeSort(int[] array, int lenght) {
        if(lenght <2) {
            return;
        }
        int mid = lenght / 2;
        int[] left = new int[mid];
        int[] right = new int[lenght - mid];
        for (int i = 0; i < mid; i++) {
            left[i] = array[i];
        }
        for (int i =mid; i < lenght; i++) {
            right[i-mid] = array[i];
        }

        margeSort(left,mid);
        margeSort(right, lenght-mid);
        margeArray(left, right,array);

    }
    private  static void margeArray(int[] one, int[] two, int [] array) {

        int indexOne = 0;
        int indexTwo = 0;

        for (int i = 0; i < array.length; i++) {
            if (indexOne < one.length && indexTwo < two.length) {
                int elmentOne = one[indexOne];
                int elementTwo = two[indexTwo];
                if (elmentOne < elementTwo) {
                    array[i] = elmentOne;
                    indexOne++;
                } else {
                    array[i] = elementTwo;
                    indexTwo++;
                }
                continue;
            }
            if (indexOne < one.length && indexTwo >= two.length) {
                array[i] = one[indexOne];
                indexOne++;
            }
            if (indexOne >= one.length && indexTwo < two.length) {
                array[i] = two[indexTwo];
                indexTwo++;
            }


        }
    }
}
