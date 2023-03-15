package baseball.test;

import baseball.components.Validation;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class ValidationTest {

//    @ParameterizedTest
//    @DisplayName("스코어 입력 - 3자리인가?, 영어가 있는가?, 0이 포함되어있는가?, 공백이 포함되어있는가?")
//    @CsvSource(value = {"123:true", "1111:false", "aaa:false", "dㅁ1:false", " :false", "12:false", "506:false", " 23:false", "111:false"}, delimiter = ':')
//    void scoreVali (String input, boolean result){
//        Assertions.assertThat(Validation.getValidaion().InputVali(input)).isEqualTo(result);
//    }

    @ParameterizedTest
    @DisplayName("중복 여부 확인")
    @CsvSource(value = {"123:false", "122:true"}, delimiter = ':')
    void isDuplicate(String input, boolean result){
        Assertions.assertThat(Validation.getValidaion().isDuplicate(input)).isEqualTo(result);
    }

}
