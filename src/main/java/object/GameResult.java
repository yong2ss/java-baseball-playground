package object;

public class GameResult {
    int ball;
    int strike;

    private PrizeType type;

    public PrizeType getType() {
        return type;
    }

    public void setType(PrizeType type) {
        this.type = type;
    }

    public GameResult () {
        this.ball = ball;
        this.strike = strike;
    }

    public GameResult (int ball, int strike) {
        this.ball = ball;
        this.strike = strike;
        this.type = PrizeType.NOTHING;
    }

    public String ballAndStriketoString () {
        return "볼 : " + ball + "스트라이크 : " + strike;
    }

    public enum PrizeType {
        NOTHING, FAIL, PRIZE;
    }
}