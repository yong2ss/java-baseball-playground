package util;

import java.util.Scanner;

public class InputUtils {

    static final Scanner scanner = new Scanner(System.in);

    public static String input() {
        String msg = scanner.nextLine();
        return msg;
    }

}