package baseball.test;


import baseball.components.ScoreMaker;
import baseball.components.Validation;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class CoreTest {


    private ScoreMaker score;

    @BeforeEach
    @DisplayName("객체 생성")
    void turnOn(){
        this.score = new ScoreMaker();
    }

    @Test
    @DisplayName("난수 3자리 생성")
    void length (){
        String result = score.getScore();
        assertThat(result.length()).isEqualTo(3);
    }

    @Test
    @DisplayName("스코어 컨버터 - 3자리의 int[]을 리턴하는가?")
    void scoreConvert (){
        String input = "123";
        assertThat(this.score.scoreConverter(input).length).isEqualTo(3);
    }

    @AfterEach
    @DisplayName("객체 소멸")
    void turnOver (){
        this.score = null;
    }

}
