package lab_05_collections;

public class RestParameterOrVarargs {
    public static void main(String[] args) {
        System.out.println(RestParameterOrVarargs.random2numbers(2, 5));
        System.out.println(RestParameterOrVarargs.random3numbers(1, 2, 3));
        System.out.println(RestParameterOrVarargs.randomCalculation(1, 2));
        System.out.println(RestParameterOrVarargs.randomCalculation(1, 2, 3));
        System.out.println(RestParameterOrVarargs.randomCalculation(1, 2, 3, 10));
        System.out.println(RestParameterOrVarargs.randomCalculation(1, 2, 3, 10, 500));


    }

    private static int randomCalculation(int... nums){
        int total=0;
        for (int num : nums) {
            total+=num;
        }
        return total;
    }

    private static int random3numbers(int n1, int n2, int n3){
        return n1+n2+n3;
    }

    private static int random2numbers(int n1, int n2){
        return n1+n2;
    }
}
