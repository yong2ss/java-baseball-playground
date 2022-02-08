package object;

import java.util.HashSet;
import java.util.Random;

public class NumberPack {

    public int getNum1() {
        return num1;
    }

    public int getNum2() {
        return num2;
    }

    public int getNum3() {
        return num3;
    }

    private int num1;
    private int num2;
    private int num3;

    public NumberPack(String numberStr) {
        this.num1 = Integer.parseInt(numberStr.substring(0,1));
        this.num2 = Integer.parseInt(numberStr.substring(1,2));
        this.num3 = Integer.parseInt(numberStr.substring(2,3));
    }

    public NumberPack() {
        Random random = new Random();
        int number = 0;
        StringBuffer sb = new StringBuffer();
        HashSet<Integer> numbers = new HashSet<>();

        while(numbers.size() < 3) {
            number = random.nextInt(10 - 1) + 1;
            if(!numbers.contains(number)) numbers.add(number);
        }

        numbers.stream().forEach(num -> sb.append(num));

        this.num1 = Integer.parseInt(String.valueOf(sb).substring(0,1));
        this.num2 = Integer.parseInt(String.valueOf(sb).substring(1,2));
        this.num3 = Integer.parseInt(String.valueOf(sb).substring(2,3));
    }

    NumberPack(int num1, int num2, int num3) {
        this.num1 = num1;
        this.num2 = num2;
        this.num3 = num3;
    }

    public void setNum(String numberStr) {
        this.num1 = Integer.parseInt(numberStr.substring(0,1));
        this.num2 = Integer.parseInt(numberStr.substring(1,2));
        this.num3 = Integer.parseInt(numberStr.substring(2,3));
    }
}