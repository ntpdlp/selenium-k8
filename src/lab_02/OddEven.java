package lab_02;

import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Your number: ");
        int number = scanner.nextInt();
        System.out.println(number + " is : " + isEven(number));
    }

    private static String isEven(int num){
        return num%2==0 ? "Even" : "Odd";
    }
}
