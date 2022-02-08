package study;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatCode;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class StringTest {
    @Test
    void replace() {
        String actual = "abc".replace("b", "d");
        assertThat(actual).isEqualTo("adc");
    }

    @Test
    void split() {
        //요구사항 1
        String actual = "1";
        String [] arrays = actual.split(",");
        assertThat(arrays).contains("1");
        assertThat(arrays).containsExactly("1");
    }

    @Test
    void substring() {
        //요구사항 2
        String actual = "(1,2)";
        actual = actual.substring(1, 4);
        assertThat(actual).isEqualTo("1,2");
    }

    @Test
    @DisplayName("charAt Exception Test")
    void charAt() {
        //요구사항 3
        assertThatThrownBy(() -> {
            String actual = "abc";
            actual.charAt(4);
            //assertThat(actual.charAt(4)).isEqualTo('a');
        }).isInstanceOf(StringIndexOutOfBoundsException.class)
                .hasMessageContaining("index");
    }
}