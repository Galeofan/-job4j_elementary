package ru.job4j.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class TwoNumberSumTest {

    @Test
    void whenTwoEqualsNumbersYesTarget() {
        int[] array = {5, 5};
        int target = 10;
        int[] result = TwoNumberSum.getIndexes(array, target);
        int[] expected = {0, 1};
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenTwoEqualsNumbersNoTarget() {
        int[] array = {5, 5};
        int target = 12;
        int[] result = TwoNumberSum.getIndexes(array, target);
        int[] expected = {};
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenWithNegativeNumbersYesTarget() {
        int[] array = {-7, -5, 0, 5, 8, 12};
        int target = 3;
        int[] result = TwoNumberSum.getIndexes(array, target);
        int[] expected = {1, 4};
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenWithoutNegativeNumbersYesTarget() {
        int[] array = {1, 5, 10, 15, 16, 17};
        int target = 15;
        int[] result = TwoNumberSum.getIndexes(array, target);
        int[] expected = {1, 2};
        assertThat(result).isEqualTo(expected);
    }
}