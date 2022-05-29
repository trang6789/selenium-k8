package lab_03;

public class MaximumMinimumValue {

    public static void main(String[] args) {

        int[] intArr = {1, 2, 3, 4, 5};
        int min = 0;
        int max = 0;

        for (int i = 0; i < intArr.length; i++) {
            if (intArr[0] < intArr[i]) {
                min = intArr[0];
                max = intArr[i];
            }
        }
        System.out.println("Minimum: " + min);
        System.out.println("Maximum: " + max);
    }
}
