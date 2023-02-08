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
    @DisplayName("계산 테스트")
    void test (){

        String input = "1 + 2 k 3";
        OutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        int result = this.cal.input();

        assertThat(result).isEqualTo(19);
    }

    @AfterEach
    void after(){
        this.cal=null;
    }
}
