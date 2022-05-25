package lab_02;

import java.util.Scanner;

public class PrintNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int number = scanner.nextInt();

        if( number%2==0){
            System.out.println("This number is even number");
        }else {
            System.out.println("This number is odd number");
        }
    }
}
