package lab_06;

import java.util.Arrays;

public class InfomationInURL {

    public static void main(String[] args) {

        String url= "https://google.com";
        String[] splitStr = url.split("://");
        String newStr = Arrays.toString(splitStr);

        checkUrlInfomation(newStr);
        checkDomainName(newStr);

    }

    private static void checkDomainName(String nameString) {
        String com = ".com";
        String net = ".net";
        if(nameString.contains(".com")){
            System.out.println(" This is contain: " + com);
        }else if(nameString.contains(".net")) {
            System.out.println(" This is contain: " + net);
        }else{
            System.out.println("Not contain .com or .net!");
        }
    }

    private static void checkUrlInfomation(String nameString) {
        String http = "http";
        String https= "https";
        if(nameString.contains(https)){
            System.out.println(" This is contain: " + https);
        }else if(nameString.contains(http)) {
            System.out.println(" This is contain: " + http);
        }else {
            System.out.println("Not contain http or https!");
        }
    }


}
