package ru.job4j.loop;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class CounterTest {

    @Test
    void sumFrom0To5() {
        int expected = 15;
        int output = Counter.sum(0, 5);
        assertThat(output).isEqualTo(expected);
    }

    @Test
    void sumFrom5To0() {
        int expected = 0;
        int output = Counter.sum(5, 0);
        assertThat(output).isEqualTo(expected);
    }
}