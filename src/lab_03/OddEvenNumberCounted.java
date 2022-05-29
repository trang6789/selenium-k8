package lab_03;

public class OddEvenNumberCounted {

    public static void main(String[] args) {

        int[] intArray = {1,2,3,4,5};
        int countEventNumber = 0 ;
        int countOddNumber = 0 ;

        for (int i = 0; i < intArray.length; i++) {
            if(intArray[i] % 2 == 0){
                 countEventNumber ++;
            }else
                 countOddNumber ++;
        }

        System.out.println("Even numbers: " +countEventNumber);
        System.out.println("Odd numbers: " +countOddNumber);

    }

}
