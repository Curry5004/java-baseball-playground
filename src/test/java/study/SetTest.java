package study;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.HashSet;
import java.util.Set;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SetTest {
    private Set<Integer> numbers;

    @BeforeEach
    void setUp() {
        numbers = new HashSet<>();
        numbers.add(1);
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
    }

    @Test
    @DisplayName("case 1")
    void case1 (){
        int setSize = numbers.size();

        assertThat(setSize).isEqualTo(numbers.size());          //단순하게 Set.size()로 진행
    }

    @ParameterizedTest                                          //for문 처럼 반복문을 통하여 설정된 다수의 파라미터들을 검증할 때 사용.
    @ValueSource(ints = {1,2,3})                              //반복돌릴 파리미터들. ints 뿐만 아니다 다른 리터럴 타입도 넣을 수 있음.
//    @ValueSource(ints = {1,2,3,4})                              //일치하는 파라미터가 없어서 터진다.
    @DisplayName("case 2")
    void case2 (int i){                                         //앞에서 진행한 테스트와 다르게 매게변수가 들어간다.
        assertThat(numbers).contains(i);                        //for문 처럼 i가 들어가서 테스트를 진행한다.
    }


    @ParameterizedTest
    @CsvSource(value = {"1:true", "2:true", "3:true", "4:false", "5:false"}, delimiter = ':')
    void toLowerCase_ShouldGenerateTheExpectedLowercaseValue(int input, boolean expected) {
        assertThat(numbers.contains(input)).isEqualTo(expected);
    }

}
