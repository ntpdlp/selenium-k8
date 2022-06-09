 package lab_06;

import java.util.Arrays;

//lab6.1
public class MinutesCalculation2 {
    public static void main(String[] args) {

        calculate("123myPaSSw0rd");
        calculate("3hrsaAND10mins");
    }

    private static void calculate(String inputStr){
        System.out.println(inputStr);
        //split
        int totalDigits = 0;
        int totalLowercase = 0;
        int totalUppercase = 0;
        char[] chars = inputStr.toCharArray();
        for (char aChar : chars) {
            if(Character.isDigit(aChar)) totalDigits++;
            if(Character.isLowerCase(aChar)) totalLowercase++;
            if(Character.isUpperCase(aChar)) totalUppercase++;
        }

        System.out.println("totalDigits: "+totalDigits);
        System.out.println("totalLowercase: "+totalLowercase);
        System.out.println("totalUppercase: " +totalUppercase);
        System.out.println("\t");

    }
}
