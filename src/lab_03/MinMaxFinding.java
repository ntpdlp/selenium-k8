package lab_03;

public class MinMaxFinding {

    public static void main(String[] args) {

        int[] intArr = {1,2,3,4,5};
        int min = intArr[0], max = intArr[0];

        for (int num : intArr) {
            if(num<min) min=num;
            if(num>max) max=num;
        }
        System.out.println("Min: " + min);
        System.out.println("Max: " + max);

    }
}
