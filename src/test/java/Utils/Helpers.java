package Utils;

import org.openqa.selenium.WebDriver;

import java.security.SecureRandom;

public class Helpers {


    public String randomStr(int strLenght){
        String AB = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        SecureRandom rnd = new SecureRandom();
        StringBuilder sb = new StringBuilder(strLenght);
        for(int i = 0; i < strLenght; i++)
            sb.append(AB.charAt(rnd.nextInt(AB.length())));
        return sb.toString();
    }
}