package Lesson4.MyHomeworkforLesson4;

import java.util.Arrays;

public class TaskMargeArray {
    public static void main(String[] args) {
        int [] arrOne = {100, 112, 256, 349, 770};
        int [] arrTwo = {72, 86, 113, 119,256, 445, 892};
        int k = 7;

        System.out.println(margeArray(arrOne, arrTwo, k));
    }
    private static int margeArray(int[] one, int[] two, int k) {
        int length = one.length + two.length;
        int indexOne = 0;
        int indexTwo = 0;
        int curr = one[0];
        int count = 0;

        for(int i = 0; i < length; i++) {
            if(indexOne < one.length) {
                int elementOne = one[indexOne];
                int elementTwo = two[indexTwo];
                if (elementOne < elementTwo) {

                    indexOne++;
                    curr = elementOne;
                } else {

                    indexTwo++;
                    curr = elementTwo;
                }
                count++;

                if (count == k) {
                    return curr;
                }
                continue;
            }
            if(indexOne < one.length) {
                curr = one[indexOne];
                count++;
                indexOne++;
            }
            if(indexOne >= one.length) {
                curr = two[indexTwo];
                indexTwo++;
            }
            count++;
            if (count == k); {
                return curr;
            }
        }

       throw new IllegalStateException();


    }


    }




