package BaseBall;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

/*
LEVEL 2 수준의 TDD
포지션별 숫자 비교
 */
public class BallsTest {
    @Test
    void nothing() {
        Balls answers = new Balls(Arrays.asList(1, 2, 3));
        BallStatus status = answers.play(new Ball(1,4));
        assertThat(status).isEqualTo(BallStatus.NOTHING);
    }

    @Test
    void ball() {
        Balls answers = new Balls(Arrays.asList(1, 2, 3));
        BallStatus status = answers.play(new Ball(1,2));
        assertThat(status).isEqualTo(BallStatus.BALL);
    }

    @Test
    void strike() {
        Balls answers = new Balls(Arrays.asList(1, 2, 3));
        BallStatus status = answers.play(new Ball(1,1));
        assertThat(status).isEqualTo(BallStatus.STRIKE);
    }

}
