package lab_06;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringPatternMatcher {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("w3SChool",Pattern.CASE_INSENSITIVE);
        System.out.println(pattern.matcher("Hello W3sCHOOl").find()); //true
        System.out.println(pattern.matcher("Hello W3schOOl").find()); //true
        System.out.println(pattern.matcher("Hello w3school").find()); //true
        System.out.println(pattern.matcher("Hello W3sCHCHHHHHOOl").find()); //false
    }
}
