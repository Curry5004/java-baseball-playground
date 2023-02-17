package baseball.test;


import baseball.components.ScoreMaker;
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

    @AfterEach
    @DisplayName("객체 소멸")
    void turnOver (){
        this.score = null;
    }

}
