import baseball.ValidationUnit;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class ValidationTest {
    @Test
    void isThisThreeNumber() {
        assertThat(ValidationUnit.isThatThreeNumber(123)).isTrue();
        assertThat(ValidationUnit.isThatThreeNumber(12)).isFalse();
        assertThat(ValidationUnit.isThatThreeNumber(1244)).isFalse();
    }

    @Test
    void thisNumberIs1to9() {
        assertThat(ValidationUnit.number1to9Vali(1)).isTrue();
        assertThat(ValidationUnit.number1to9Vali(0)).isFalse();
        assertThat(ValidationUnit.number1to9Vali(10)).isFalse();
    }

    @Test
    void duplicationTest() {
        assertThat(ValidationUnit.numberDuplicationValidation(123)).isTrue();
    }
}
