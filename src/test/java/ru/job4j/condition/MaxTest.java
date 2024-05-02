package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class MaxTest {

    @Test
    void whenMax1To2Then2() {
        int left = 1;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 2;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMaxLeftThenLeft() {
        int left = 10;
        int right = 1;
        int result = Max.max(left, right);
        assertThat(result).isEqualTo(left);
    }

    @Test
    void whenMaxRightThenRight() {
        int left = 1;
        int right = 10;
        int result = Max.max(left, right);
        assertThat(result).isEqualTo(right);
    }

    @Test
    void whenLeftEqualsRightThenAny() {
        int left = 1;
        int right = 1;
        int result = Max.max(left, right);
        assertThat(result).isEqualTo(right);
    }

    @Test
    void whenMaxThirdThenThird() {
        int first = 1;
        int second = 1;
        int third = 1;
        int result = Max.max(first, second, third);
        assertThat(result).isEqualTo(third);
    }

    @Test
    void whenMaxFourthThenFourth() {
        int first = 1;
        int second = 1;
        int third = 1;
        int fourth = 2;
        int result = Max.max(first, second, third, fourth);
        assertThat(result).isEqualTo(fourth);
    }

    @Test
    void whenThreeDigitsEqualsThenAny() {
        int first = 1;
        int second = 1;
        int third = 1;
        int result = Max.max(first, second, third);
        assertThat(result).isEqualTo(first);
    }

    @Test
    void whenFourDigitsEqualsThenAny() {
        int first = 1;
        int second = 1;
        int third = 1;
        int fourth = 1;
        int result = Max.max(first, second, third, fourth);
        assertThat(result).isEqualTo(first);
    }
}