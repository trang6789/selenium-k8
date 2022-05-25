package lab_02;

import java.util.Scanner;

public class SuggestWeight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please input your height: ");
        float height = scanner.nextFloat();
        System.out.print("Please input your weight: ");
        float weight = scanner.nextFloat();
        float BMI = weight / (height * 2);
        float adjustWeight ;



        if (BMI < 18.5) {
            System.out.println("Underweight");
            adjustWeight = (float) (18.5 - BMI) * (height * 2);
            float newWeight = weight + adjustWeight;
            System.out.println("You should increase: " + adjustWeight + "kg");
            System.out.println("Your weight should be: " + newWeight);
        } else if (BMI <= 24.9) {
            System.out.println("Normal weight");
        } else {
            if (BMI <= 29.9) {
                System.out.println("Overweight");
            } else {
                System.out.println("Obesity");
            }
            adjustWeight = (float) (BMI - 24.9) * (height * 2);
            float newWeight = weight - adjustWeight;
            System.out.println("You should decrease: " + adjustWeight + "kg");
            System.out.println("Your weight should be: " + newWeight);


        }
    }
}
