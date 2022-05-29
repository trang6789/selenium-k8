package lab_03;

public class ArrayMerging {

    public static void main(String[] args) {


        int[] arrayOne = {1,12,16,28,34};
        int[] arrayTwo = {1,13,16,27,99};
        int mergeLength = arrayOne.length + arrayTwo.length;
        int[] arrayMerge = {mergeLength};
        int i=0  , j=0  , count = 0;


        while(i < arrayOne.length && j < arrayTwo.length) {
            if (arrayOne[i] <= arrayTwo[j]) {
                arrayMerge[count] = arrayOne[i];
                i++;
            } else {
                arrayMerge[count] = arrayTwo[j];
                j++;
            }
            System.out.print(arrayMerge[count] + " ");

        }
        System.out.println(arrayTwo[arrayTwo.length-1]);

    }
}
