package Utilities;

public class StringUtulities {

    public static void verifyEquals(String expected, String actual){
        String result = expected.equals(actual) ?  "PASS" : "FAIL";
        System.out.println(result);
    }
}
