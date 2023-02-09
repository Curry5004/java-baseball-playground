package caluculPro;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.io.*;

import static org.assertj.core.api.Assertions.*;

public class TestPage {

    private Calcul cal;

    @BeforeEach
    void before(){
        this.cal = new Calcul();
    }

    @Test
    @DisplayName("값 변환 여부 확인")
    void isThisNumber(){
        assertThat(this.cal.isThisNumber("$")).isFalse();
        assertThat(this.cal.isThisNumber("3")).isTrue();
    }

    @Test
    @DisplayName("연산 확인")
    void calculate (){
        String test = "2 + 3 * 4 / 2";
        assertThat(this.cal.start(test)).isEqualTo(10);
    }

    @AfterEach
    void after(){
        this.cal=null;
    }
}
