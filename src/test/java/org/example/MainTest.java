package org.example;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

class MainTest {

    @ParameterizedTest
    @CsvSource({"1,1", "3,9", "5,25", "-3,9", "15,225"})
    void doMath(int param1, int expected) {
        Main main = new Main();

        int result = main.doMath(param1);
        assertThat(result)
                .as("results not equal")
                .isNotZero()
                .isEqualTo(expected);
    }
}