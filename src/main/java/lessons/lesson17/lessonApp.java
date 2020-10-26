package lessons.lesson17;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ResourceBundle;
import java.io.Serializable;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

import java.util.HashMap;
import java.util.Map;


public class lessonApp {
    public static void main(String[] args) {
        ResourceBundle bundle = ResourceBundle.getBundle("en");
        System.out.println(bundle.getString("welcome_message"));
        System.out.println(bundle.getString("generic_error_message"));

        System.out.println(encodeProp(bundle.getString("welcome_message")));
        System.out.println(encodeProp(bundle.getString("generic_error_message")));
    }


    private static String encodeProp(String prop){
        String encodedProp = new String();
        try {
            encodedProp =  new String(prop.getBytes("ISO-8859-1"), Charset.defaultCharset());
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return encodedProp;
    }
}
