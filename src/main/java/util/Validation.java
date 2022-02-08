package util;

public class Validation {
    public static boolean coinValid (String coin) {
        if(!"1".equals(coin)) {
            return false;
        }
        return true;
    }

}