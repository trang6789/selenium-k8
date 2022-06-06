package lab_06;

public class NumberInString {

    public static void main(String[] args) {

        String myStr  = "100 minutes235435";
        System.out.println("Expected output: " +changeDigitNumber(myStr));


    }

    private static String changeDigitNumber(String myStr) {
        char[] updateString = myStr.toCharArray();
        String result= "";

        for (int index = 0; index < myStr.length(); index++) {
            if(Character.isDigit(updateString[index])) {
                result += updateString[index];
            }
        }
        return result;
    }


}
