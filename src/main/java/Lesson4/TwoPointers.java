package Lesson4;

import java.util.Arrays;

public class TwoPointers {
    public static void main(String[] args) {

        int [] arrOne = {100,112,256,349,770};       // 100 // 100 //100 //112
        int [] arrTwo = {72,86,113,119,256,445,892}; //72  // 86 //113 //113
        System.out.println(Arrays.toString(margeArray(arrOne,arrTwo)));                                             //72 // 86  //100 //112
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
