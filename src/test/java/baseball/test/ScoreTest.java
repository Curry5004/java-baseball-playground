package baseball.test;

import baseball.components.dto.Score;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class ScoreTest {

    Score score;

    @BeforeEach
    void start(){
        this.score = new Score();
    }


    @ParameterizedTest
    @DisplayName("점수 테스트")
    @CsvSource(value = {"01:1", "02:1"}, delimiter = ':')
    void countUp(String code, int result){
        score.countUp(code);
        Assertions.assertThat(score.getStrikeCount()).isEqualTo(result);
    }

    @Test
    void isThisFourBall(){
        Assertions.assertThat(score.isThisFourBall()).isTrue();
    }
}
