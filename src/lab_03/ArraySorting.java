package lab_03;

public class ArraySorting {

    public static void main(String[] args) {

        int[] intArr = {12, 34, 1, 16, 28};
        int i, j, min, stemp;
        System.out.println("New array after sorting: ");

        for (i = 0; i < intArr.length; i++) {
            min = i;
            for (j = i+1; j < intArr.length; j++) {
                if(intArr[j]<intArr[min]){
                    min = j;
                }
            }
            stemp = intArr[i];
            intArr[i] = intArr[min];
            intArr[min] = stemp;
            System.out.print( intArr[i] + " ");
        }





    }
}
