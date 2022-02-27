package BaseBall;

public class ValidationUtils {
    public static final int MIN_NUM = 1;
    public static final int MAX_NUM = 9;

    public static boolean validNo(int no) {
        if(no >= MIN_NUM && no <= MAX_NUM) {
            return true;
        }
        return false;
    }
}
