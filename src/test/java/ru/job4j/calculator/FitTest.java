package ru.job4j.calculator;

import static org.assertj.core.api.Assertions.*;
import org.junit.jupiter.api.Test;

class FitTest {
    @Test
    void whenManHeight187Then100Dot05() {
        short input = 187;
        double expected = 100.05;
        double result = Fit.manWeight(input);
        assertThat(result).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenWomanHeight165Then63Dot24() {
        short input = 166;
        double expected = 64.4;
        double result = Fit.womanWeight(input);
        assertThat(result).isEqualTo(expected, withPrecision(0.01));
    }
}