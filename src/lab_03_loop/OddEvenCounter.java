package lab_03_loop;

public class OddEvenCounter {

    public static void main(String[] args) {

        int[] intArr = {1,2,3,4,5};
        int evenCounts=0, oddCounts=0;

        for (int num: intArr){
            if(isEven(num)) evenCounts++;
            else oddCounts++;
        }
        System.out.println("Even numbers: " + evenCounts);
        System.out.println("Odd numbers: " + oddCounts);

    }

    private static boolean isEven(int num){
        return num%2==0 ? true : false;
    }
}
