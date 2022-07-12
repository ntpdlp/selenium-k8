package lab_13_exception_handling;

public class Utilities {

    public static int getIntegerValue(String in){
        int out = Integer.MIN_VALUE;
        try{
            out = Integer.parseInt(in);
        }catch (NumberFormatException e){
            throw new IllegalArgumentException(in + " is not a valid integer");
        }

        return out;
    }

    public static long getLongValue(String in){
        long out = Long.MIN_VALUE;
        try{
            out = Long.parseLong(in);
        }catch(NumberFormatException e){
            throw new IllegalArgumentException(in + " is not a valid long");
        }
        return out;
    }

    public static float getFloatValue(String in){
        float out = Float.MIN_VALUE;
        try{
            out = Float.parseFloat(in);
        }catch (NumberFormatException e){
            throw new IllegalArgumentException(in + " is not a valid float");
        }
        return out;
    }
}
