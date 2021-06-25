package org.example.Utils;
import java.io.FileInputStream;
import java.util.Properties;



public class Utils {


    public static  String getBaseURI(){
    Properties properties = null;
        try {
        FileInputStream input = new FileInputStream("configuration.properties");


        properties = new Properties();
        properties.load(input);
        input.close();
    } catch (Exception e) {
        e.printStackTrace();
    }
 return properties.getProperty("BaseURI");


}

public static String InputValidiation(String input){
        int maxlength=7;
       int  minlength=5;
        if((input.length()>maxlength || input.length()<minlength)){
            return "";
        }
        else return input.replace("\\s","").toUpperCase();


}


}
