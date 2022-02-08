package object;

import java.util.ArrayList;
import java.util.List;

public class Game {
    private final NumberPack prizeNum = new NumberPack();

    public void answer() {
        System.out.println("정답 : " +prizeNum.getNum1() + "" + prizeNum.getNum2() + "" + prizeNum.getNum3());
    }

    public GameResult compare(NumberPack userNum) {
        int ball = 0;
        int strike = 0;

        List<Integer> randomMod = new ArrayList<>();
        List<Integer> playerMod = new ArrayList<>();

        //Predicate<Integer> predicate = (num) -> num > 10;

        if(prizeNum.getNum1() == userNum.getNum1()) {
            strike++;
        } else {
            randomMod.add(prizeNum.getNum1());
            playerMod.add(userNum.getNum1());
        }

        if(prizeNum.getNum2() == userNum.getNum2()) {
            strike++;
        } else {
            randomMod.add(prizeNum.getNum2());
            playerMod.add(userNum.getNum2());
        }

        if(prizeNum.getNum3() == userNum.getNum3()) {
            strike++;
        } else {
            randomMod.add(prizeNum.getNum3());
            playerMod.add(userNum.getNum3());
        }

        if(strike < 3) { ball = ballCheck(randomMod, playerMod);}

        GameResult result = new GameResult(ball, strike);

        if(strike == 3) {
            result.setType(GameResult.PrizeType.PRIZE);
        } else if (ball == 3) {
            result.setType(GameResult.PrizeType.NOTHING);
        } else {
            result.setType(GameResult.PrizeType.FAIL);
        }

        return result;
    }

    private int ballCheck(List<Integer> randomMod, List<Integer> playerMod) {
        int ballCount = 0;

        for(int i = 0; i < randomMod.size(); i++) {
            if(randomMod.contains(playerMod.get(i))) {
                ballCount++;
            }
        }

        return ballCount;
    }
}