package lab_04;


import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NumberGame {
    public static void main(String[] args) {

        List<Integer> nums = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            nums.add(new SecureRandom().nextInt(100));
        }

        System.out.println("========== MENU ===========");
        System.out.println("1. Print all numbers");
        System.out.println("2. Print maximum value");
        System.out.println("3. Print minimum value");
        System.out.println("4. Search number");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Your choice: ");
        int choice = scanner.nextInt();
        switch (choice){
            case 1:
                System.out.println(nums);
                break;
            case 2:
                printMax(nums);
                break;
            case 3:
                printMin(nums);
                break;
            case 4:
                System.out.println("Enter your search number: ");
                int searchNum = scanner.nextInt();
                System.out.println(searchNumber(nums,searchNum)?"Found":"No Found" + " in the list: " + nums);
                break;
            default:
                System.out.println("Please enter 1, 2, 3 or 4 only");
        }


    }

    private static boolean searchNumber(List<Integer> nums, int searchNum) {
        int min = nums.get(0);
        for (Integer num : nums) {
            if(searchNum==num) return true;
        }
        return false;
    }

    private static void printMin(List<Integer> nums) {
        int min = nums.get(0);
        for (Integer num : nums) {
            if(min>num) min=num;
        }
        System.out.println("Min :" + min + " in the list : " + nums);
    }

    private static void printMax(List<Integer> nums) {
        int max = nums.get(0);
        for (Integer num : nums) {
            if(max<num) max=num;
        }
        System.out.println("Max :" + max + " in the list : " + nums);
    }
}
