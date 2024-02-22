package study;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class StringTest {
    @Test
    void replace() {
        String actual = "abc".replace("b", "d");
        assertThat(actual).isEqualTo("adc");
    }

    @Test
    void split() {
        String[] actual = "1,2".split(",");
        assertThat(actual).isEqualTo(new String[]{"1", "2"});

        String[] actual2 = "1".split(",");
        assertThat(actual2).isEqualTo(new String[]{"1"});
    }

    @Test
    void subString() {
        String actual = "(1,2)".substring(1, 4);
        assertThat(actual).isEqualTo("1,2");
    }

    @Test
    @DisplayName("String의 charAt() 메서드를 활용해 특정 위치의 문자를 가져올 때 위치 값 벗어나면 예외 잘 발생하는지 테스트")
    void chatAt() {
        String actual = "abc";

        assertThatExceptionOfType(StringIndexOutOfBoundsException.class)
                .isThrownBy(() -> {
                    actual.charAt(actual.length());
                }).withMessageMatching("String index out of range: \\d+");
    }
}
