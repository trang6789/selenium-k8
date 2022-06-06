package lab_06;

import java.util.Scanner;

public class PasswordPermission {

    public static void main(String[] args) {

        String myPassword = "password123";

        int countTime = 3;

        for (; countTime > 0; ) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Please input your password: ");
            String password = scanner.next();
            if(password.equals(myPassword)){
                System.out.println("The password is correct!");
                break;
            }else{
                System.out.println("The password is not correct!");
            }
            countTime--;
            System.out.println("The count time is remain: " + countTime);
            if(countTime==0){
                System.out.println("You can not access! ");
            }
        }
    }


    
}
