package lab_06;

public class TotalMinsCaculation {

    public static void main(String[] args) {
        String hoursAndMins = "2hrs and 5 minutes";
        ReturnResult(TrimString(hoursAndMins));
    }

    private static void ReturnResult(String hourAndMins) {
        String hourStr = ChangeToNumber(hourAndMins.substring(0, 4));
        String minStr = ChangeToNumber(hourAndMins.substring(7));
        int hour = Integer.parseInt(hourStr);
        int min = Integer.parseInt(minStr);
        CalculateTotalMins(hour, min);
    }

    private static void CalculateTotalMins(int hours, int mins) {
        int totalMin = (hours * 60) + mins;
        System.out.println("Total mins: " + totalMin);
    }


    private static String TrimString(String stringNumber) {
        String filterStr = stringNumber.replace(" ", "");
        return filterStr.trim();
    }

    private static String ChangeToNumber(String hoursAndMins) {
        String number = hoursAndMins.replaceAll("[^0-9]", "");
        return number;
    }


}
