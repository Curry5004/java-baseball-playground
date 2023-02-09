package study;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.*;
import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;

public class StringTest {
    @Test
    void replace() {
        String actual = "abc".replace("b", "d");
        assertThat(actual).isEqualTo("adc");
    }

    @Test
    void split(){
        String [] test = "1,2".split(",");
        String [] result = {"2","1"};
        String [] test2 = "1".split(",");
        String [] result2 = {"1"};
        assertThat(test).contains("2","2"); //tue
        assertThat(test2).containsExactly("1");
        System.out.println("test");

        //List에서도 사용 가능한가?
        List <String> test3 = new ArrayList<>();
        test3.add("21");
        assertThat(test3).contains("21"); //true
//        assertThat(test3).contains("2"); //false
    }

    @Test
    void subStr(){
        String test = "(1,2)".substring(1,4);
        assertThat(test).isEqualTo("1,2");
    }

    @Test
    void split3(){
        String [] test = "1,2".split(",");
        String [] result = {"2","1"};
        String [] test2 = "1".split(",");
        String [] result2 = {"1"};
        assertThat(test).contains("2","2");
        assertThat(test2).containsExactly("1");
    }

    @Test
    @DisplayName("예외처리테스트")                                                         //에러 이름 처리.
    void charAt(){
        assertThatThrownBy(() -> {                                                    //Exception이 발생하면 던진다.
            //Exception 발생유도
            char test = "abc".charAt(4);                                             //StringIndexOutOfBoundsException 유도
        }).isInstanceOf(IndexOutOfBoundsException.class)                             //해당 Exception인가?
                .hasMessageContaining("String index out of range: 4");     //Exception에 해당 메지지를 담고 있는가?

        //Exception이 발생하면 어떤 Exceptiuon인지 판별
        assertThatExceptionOfType(StringIndexOutOfBoundsException.class)
                .isThrownBy(() -> {
                    char test = "abc".charAt(4);                                //StringIndexOutOfBoundsException
                });

        //많이 발생하는 Exception의 경우 특정 Exception이 명시되어 있는 matcher가 있다.
        assertThatNullPointerException()
                .isThrownBy(()->{
                    String test = null;
                    String test2 = null;
                    test2 = test.substring(4);
                })
                .withMessageContaining("String.substring(int)");

    }

}
