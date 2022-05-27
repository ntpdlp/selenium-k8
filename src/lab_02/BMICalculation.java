package lab_02;

import java.util.Scanner;

public class BMICalculation {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float height, weight, bmi;
        System.out.print("Height: ");
        height = scanner.nextFloat();
        System.out.print("Weight: ");
        weight = scanner.nextFloat();
        bmi = bmiIndex(height,weight);

        final float NORMAL_MIN = 18.5f;
        final float NORMAL_MAX = 24.9f;

        if(bmi<=18.5){
            System.out.println("Underweight");
            System.out.println("Solution: increase weight " + (NORMAL_MIN*height*2 - weight) + "kg");
        } else if(bmi<=24.9) {
            System.out.println("Normal weight");
        }else if(bmi<=29.9){
            System.out.println("Overweight");
            System.out.println("Solution: decrease weight " + (NORMAL_MAX*height*2 - weight) + "kg");
        }else{
            System.out.println("Obesity");
            System.out.println("Solution: decrease weight " + (NORMAL_MAX*height*2 - weight) + "kg");
        }
    }

    private static float bmiIndex(float height, float weight){
        return weight/(height*2);
    }


}
