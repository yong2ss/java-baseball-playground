package study;

import java.util.Arrays;
import java.util.Scanner;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class StringCalcTest {

    @Test
    void Calc() throws Exception {
// Scanner scanner = new Scanner(System.in);
// String value = scanner.nextLine();
        String value = "2 + 3 * 4 / 2";
        String [] values = value.split(" ");

        int result = Integer.parseInt(values[0]);
        String cal = "+";
        for(int i = 1; i < values.length; i++) {
            if(isNumber(values[i])) {
                result = calculation(result, cal, Integer.parseInt(values[i]));
            } else {
                cal = values[i];
            }
        }

        Assertions.assertThat(result).isEqualTo(10);
    }

    private boolean isNumber(String c) {
        return Arrays.asList("+","-","*","/").contains(c) ? false : true;
    }

    private int calculation(int origin, String c, int num) throws Exception {
        switch (c) {
            case "+" :
                return origin + num;
            case "-" : return origin - num;
            case "*" : return origin * num;
            case "/" : return origin / num;
            default: throw new Exception();
        }
    }


}