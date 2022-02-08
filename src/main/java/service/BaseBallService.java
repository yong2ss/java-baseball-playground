package service;

import object.Game;
import object.GameResult;
import object.NumberPack;
import util.InputUtils;
import util.Validation;
import util.PrintUtils;

public class BaseBallService {

    public void play () {
        PrintUtils.basicPrint("게임 시작");
        PrintUtils.play("게임을 시작하려면 1을 입력하세요.");

        String coin = InputUtils.input();

        while (Validation.coinValid(coin)) {
            //게임하기
            playGame();
            PrintUtils.play("게임을 다시 시작하려면 1을 입력하세요.");
            coin = InputUtils.input();
        }

        PrintUtils.basicPrint("게임 종료");
    }

    private void playGame () {
        final Game game = new Game();
        GameResult result = new GameResult();

        game.answer();

        String playerNumber = "";
        //맞추기 반복
        PrintUtils.basicPrint("숫자를 입력해 주세요");
        playerNumber = InputUtils.input();
        NumberPack numberPack = new NumberPack(playerNumber);

        while(result.getType() != GameResult.PrizeType.PRIZE) {
            //오답비교
            result = game.compare(numberPack);
            PrintUtils.gameResultPrint(result);

            if(result.getType() == GameResult.PrizeType.PRIZE) {
                return;
            }

            PrintUtils.basicPrint("숫자를 입력해 주세요");
            playerNumber = InputUtils.input();
            numberPack.setNum(playerNumber);
        }
    }
}