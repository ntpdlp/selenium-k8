package lab_02_if;

import lab_13_exception_handling.Utilities;

import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Your number: ");
        int number = Utilities.getIntegerValue(scanner.next()); //add exception handling
        System.out.println(number + " is : " + isEven(number));
    }

    private static String isEven(int num){
        return num%2==0 ? "Even" : "Odd";
    }
}
