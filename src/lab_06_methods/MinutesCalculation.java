package lab_06_methods;

import java.util.Arrays;

//lab6.1
public class MinutesCalculation {
    public static void main(String[] args) {

        System.out.println(calculate("2hrs and 5 minutes"));
        System.out.println(calculate("3hrs and 10mins"));
        System.out.println(calculate("1hour and 50minutes"));
    }

    private static int calculate(String inputStr){
        //split
        String[] substrs = inputStr.split("and");
        System.out.println(Arrays.toString(substrs));
        int totalInMinutes = 0;
        for (String substr : substrs) {
            substr = substr.trim();
            char[] chars = substr.toCharArray();
            char letter = chars[0];
            int pos = 0;
            do{
                if(chars[pos]>='0'&& chars[pos]<='9'){
                    pos++;
                }else if(chars[pos]==' ' || chars[pos]<='0' || chars[pos]>='9'){
                    break;
                }

            }while(pos<substr.length());

            String timeNumber = substr.substring(0,pos);
            Integer value = Integer.valueOf(timeNumber);
            String timeType = substr.substring(pos).trim();

            //depend on days, hours, minutes, ...
            switch (timeType.toLowerCase()){
                case "hrs":
                case "hours":
                case "hour":
                    totalInMinutes+=value*60;
                    break;
                case "minutes":
                case "mins":
                    totalInMinutes+=value;
                    break;
                default:
                    break;
            }
        }
        return  totalInMinutes;
    }
}
