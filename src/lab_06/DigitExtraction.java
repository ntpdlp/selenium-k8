package lab_06;

import java.util.Arrays;

//lab6.3
public class DigitExtraction {
    public static void main(String[] args) {

        System.out.println(extractNumberFromString("100 minutes"));
        System.out.println(extractNumberFromString("123abc789"));
        System.out.println(extractNumberFromString("12345ntxabc789xyz 44555&*(1122"));
    }

    private static String extractNumberFromString(String inputStr){
        String output = "";
        inputStr = inputStr.trim();
        char[] chars = inputStr.toCharArray();
        char letter = chars[0];
        int pos = 0;
        do{
            if(chars[pos]>='0'&& chars[pos]<='9'){
                output+=chars[pos];
                pos++;
            }else if(chars[pos]==' ' || chars[pos]<='0' || chars[pos]>='9'){
                pos++;
                continue;
            }

        }while(pos<inputStr.length());
        return output;
    }
}
