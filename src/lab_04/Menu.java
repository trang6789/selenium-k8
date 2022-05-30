package lab_04;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {

    public static void main(String[] args) {

        System.out.print(" =====MENU========\n" +
                "1. Print all numbers\n" +
                "2. Print maximum value\n" +
                "3. Print minimum value\n" +
                "4. Search number\n"+
                "===================\n");
        System.out.print("Please input the number: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        List<Integer> myList = listNumber();

        switch (number){
            case 1:
                printAllNumber(myList);
                break;
            case 2:
                printAllNumber(myList);
                printMaxValue(myList);
                break;
            case 3:
                printAllNumber(myList);
                printMinValue(myList);
                break;
            case 4:
                printAllNumber(myList);
                searchNumber(myList);
                break;
            default:
                System.out.println("");
                break;
        }

    }


    public static void printAllNumber(List<Integer> myList){
        System.out.print("The list number is: ");
        for (int number : myList) {
            System.out.print (number + " ");
        }
    }
    public static List<Integer> listNumber(){
        System.out.print("Please input the length: ");
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        List<Integer> myList = new ArrayList<>(length);
        for (int i = 0; i < length ; i++) {
            myList.add(getRandomNumber(1000));
        }
        return myList;
    }

    public static int getRandomNumber(int boundaryNumber){
        int randomNumber = new SecureRandom().nextInt(boundaryNumber);
        return randomNumber;
    }

    public static void printMaxValue(List<Integer> myList){

        int max = myList.get(0);
        for (int i = 0; i < myList.size(); i++) {
            if (max < myList.get(i)) {
                max = myList.get(i);
            }
        }

        System.out.println("\nMaximum: " + max);

    }
    public static void printMinValue(List<Integer> myList){

        int min = myList.get(0);
        for (int i = 0; i < myList.size(); i++) {
            if (min > myList.get(i)) {
                min = myList.get(i);
            }
        }
        System.out.println("\nMinimum: " + min);

    }
    public static void searchNumber (List<Integer> myList){

        boolean exitsSearchNum = false;
        System.out.print("\nPlease input the number: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        for (int i = 0; i < myList.size(); i++) {
            if (number == myList.get(i)) {
                exitsSearchNum = true;
                System.out.printf("The number %d in the index %d", number, i);
                break;
            }
       }
        if(exitsSearchNum == false) {
            System.out.println("The number is not in the list!\n");
        }
    }
}
