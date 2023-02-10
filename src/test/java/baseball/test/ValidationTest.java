package baseball.test;

import baseball.components.Validation;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class ValidationTest {

    @ParameterizedTest
    @DisplayName("스코어 입력 - 3자리인가?, 영어가 있는가?")
    @CsvSource(value = {"123:true", "1111:false", "aaa:false", "dㅁ1:false", " :false", "12:false"}, delimiter = ':')
    void scoreVali (String input, boolean result){
        Assertions.assertThat(Validation.getValidaion().scoreInputVali(input)).isEqualTo(result);
    }

}
