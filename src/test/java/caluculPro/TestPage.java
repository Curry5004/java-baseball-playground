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
    }

    @ParameterizedTest
    @DisplayName("연산 확인")
    @ValueSource(strings = {"/", "*", "+", "-"})
    void calculate (String symbol){
        this.cal.calculate(false, symbol);
//        assertThat(this.cal.calculate(true, "1"));
    }

    @AfterEach
    void after(){
        this.cal=null;
    }
}
