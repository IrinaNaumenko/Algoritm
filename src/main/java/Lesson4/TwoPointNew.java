package Lesson4;

import java.util.Arrays;

public class TwoPointNew {
    public static void main(String[] args) {

        int [] arrOne = {100,112,256,349,770};       // 100 // 100 //100 //112
        int [] arrTwo = {72,86,113,119,256,445,892}; //72  // 86 //113 //113
        int k = 7;
        System.out.println(Arrays.toString(margeArray(arrOne,arrTwo)));
        System.out.println(margeArray(arrOne, arrTwo, k));//72 // 86  //100 //112
    }


    private  static int margeArray(int[] one, int[] two, int k){
        int length = one.length + two.length;
        int indexOne = 0;
        int indexTwo = 0;
        int curr = one[0];
        int count =0;

        for(int i = 0; i < length; i++) {
            if(indexOne < one.length && indexTwo < two.length) {
                int elmentOne = one[indexOne];
                int elementTwo = two[indexTwo];
                if (elmentOne < elementTwo) {

                    indexOne++;
                    curr = elmentOne;
                } else {

                    indexTwo++;
                    curr = elementTwo;
                }
               count++;

                if (count == k) {
                    return  curr;
                }

                continue;
            }
            if(indexOne < one.length && indexTwo>=two.length) {

                curr = one[indexOne];
                count++;
                indexOne++;
            }
            if(indexOne >= one.length && indexTwo < two.length) {
                curr = two[indexTwo];

                indexTwo++;
            }
            count++;
            if ( count == k) {
                return  curr;
            }

        }

        throw new IllegalStateException();
    }
    private  static int[] margeArray(int[] one, int[] two){
        int[] result = new int[one.length +two.length];
        int indexOne = 0;
        int indexTwo = 0;

        for(int i = 0; i < result.length; i++) {
            if(indexOne < one.length && indexTwo < two.length) {
                int elmentOne = one[indexOne];
                int elementTwo = two[indexTwo];
                if (elmentOne < elementTwo) {
                    result[i] = elmentOne;
                    indexOne++;
                } else {
                    result[i] = elementTwo;
                    indexTwo++;
                }
                continue;
            }
            if(indexOne < one.length && indexTwo>=two.length) {
                result[i] = one[indexOne];
                indexOne++;
            }
            if(indexOne >= one.length && indexTwo < two.length) {
                result[i] = two[indexTwo];
                indexTwo++;
            }

        }
        return result;
    }}


