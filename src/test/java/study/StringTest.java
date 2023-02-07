package study;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

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
        assertThat(test).contains("2","2");
        assertThat(test2).containsExactly("1");
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
}
