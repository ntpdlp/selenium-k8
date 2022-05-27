package lab_03;

import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) {
        int[] intArr = {12,34,1,16,28};
        System.out.println(Arrays.toString(intArr));

        int min, pos, temp;

        for(int i = 0; i<intArr.length - 1; i++){
            min = intArr[i];
            pos = i;
            for(int j=i+1; j<intArr.length; j++){
                if(intArr[j] < min){
                    min = intArr[j];
                    pos = j;
                }
            }

            //update positions in array, update array.
            intArr = swap(intArr,i,pos);
            System.out.println(Arrays.toString(intArr));
        }

    }

    public static int[] swap(int[] arrs, int a, int b){
        int temp;
        temp = arrs[b];
        arrs[b]=arrs[a];
        arrs[a]=temp;
        return arrs;
    }

}
