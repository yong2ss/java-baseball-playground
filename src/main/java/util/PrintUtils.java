package util;

import object.GameResult;

public class PrintUtils {
    public static void basicPrint(String msg) {
        System.out.println("==============================");
        System.out.println("==============================");
        System.out.println(msg);
        System.out.println("==============================");
        System.out.println("==============================");
    }

    public static void play(String msg) {
        System.out.println("- " + msg);
    }

    public static void result(int ball, int strike) {
        if(ball == 3) {
            System.out.println("Nothing");
        }
    }

    public static void comparePrint(int ball, int strike) {
        if(ball == 0 && strike == 0) {
            System.out.println("Nothing");
            return;
        }
        System.out.println("Ball : " + ball + "Strike : " + strike);
    }

    public static void gameResultPrint(GameResult result) {
        if(GameResult.PrizeType.PRIZE == result.getType()) {
           System.out.println("게임에서 승리하셨습니다!");
           return;
        }
        System.out.println(result.ballAndStriketoString());
    }
}
