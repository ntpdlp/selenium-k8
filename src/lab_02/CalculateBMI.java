package lab_02;

import java.util.Scanner;

public class CalculateBMI {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float height, weight, bmi;
        System.out.print("Height: ");
        height = scanner.nextFloat();
        System.out.print("Weight: ");
        weight = scanner.nextFloat();
        bmi = bmiIndex(height,weight);

        if(bmi<=18.5){
            System.out.println("Underweight");
        } else if(bmi<=24.9) {
            System.out.println("Normal weight");
        }else if(bmi<=29.9){
            System.out.println("Overweight");
        }else{
            System.out.println("Obesity");
        }
    }

    private static float bmiIndex(float height, float weight){
        return weight/(height*2);
    }


}
