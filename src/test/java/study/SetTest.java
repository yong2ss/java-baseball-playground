package study;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.HashSet;
import java.util.Set;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

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

    // Test Case 구현
    @Test
    void size() {
        assertThat(numbers).hasSize(3);
    }

    @ParameterizedTest
    @ValueSource(ints = {1,2,3})
    void contains(int input) {
        //assertThat(numbers.contains(1)).isTrue();
        //assertThat(numbers.contains(2)).isTrue();
        //assertThat(numbers.contains(3)).isTrue();
        assertThat(numbers.contains(input)).isTrue();
    }

    @ParameterizedTest
    @CsvSource({"1,true", "2,true", "3,true", "4,false", "4,false"})
    void containsValid(int input, boolean flag) {
        assertThat(numbers.contains(input)).isEqualTo(flag);
    }
}