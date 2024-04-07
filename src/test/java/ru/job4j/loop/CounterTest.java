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

    @Test
    void whenSumEvenNumbersFromOneToTenThenThirty() {
        int start = 1;
        int finish = 10;
        int result = Counter.sumByEven(start, finish);
        int expected = 30;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenSumEvenNumbersFrom10ToThirtyThenTwoHundredAndTwenty() {
        int start = 10;
        int finish = 30;
        int result = Counter.sumByEven(start, finish);
        int expected = 220;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenSumEvenNumbersFromMinus6ToTenThenEighteen() {
        int start = -6;
        int finish = 10;
        int result = Counter.sumByEven(start, finish);
        int expected = 18;
        assertThat(result).isEqualTo(expected);
    }
}