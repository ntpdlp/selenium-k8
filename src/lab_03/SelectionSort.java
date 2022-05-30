package lab_03;

import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(selectionSortAlgo(null)));
        System.out.println(Arrays.toString(selectionSortAlgo(new int[] {5})));
        System.out.println(Arrays.toString(selectionSortAlgo(new int[] {12, 34, 1, 16, 28})));
    }

    public static int[] selectionSortAlgo(int[] intArr) {
        if(intArr==null || intArr.length==0 || intArr.length==1)
            return intArr;

        int minValue,minPos,temp;
        for (int i = 0; i < intArr.length - 1; i++) {
            minPos = i;
            for (int j = i + 1; j < intArr.length; j++) {
                if (intArr[j] < intArr[minPos]) {
                    minPos = j;
                }
            }
            temp = intArr[i];
            intArr[i]=intArr[minPos];
            intArr[minPos]=temp;

        }
        return intArr;
    }
}