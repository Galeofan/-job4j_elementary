package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class PointTest {

    @Test
    void when00to20then2() {
        double expected = 2;
        Point a = new Point(0, 0);
        Point b = new Point(2, 0);
        double output = a.distance(b);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenMinus10to20then3() {
        double expected = 3;
        Point a = new Point(-1, 0);
        Point b = new Point(2, 0);
        double output = a.distance(b);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenMinus10toMinus20then1() {
        double expected = 1;
        Point a = new Point(-1, 0);
        Point b = new Point(-2, 0);
        double output = a.distance(b);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when111to222then1Dot73() {
        double expected = 1.73;
        Point a = new Point(1, 1, 1);
        Point b = new Point(2, 2, 2);
        double output = a.distance3d(b);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenMinus105to322then5Dot38() {
        double expected = 5.38;
        Point a = new Point(-1, 0, 5);
        Point b = new Point(3, 2, 2);
        double output = a.distance3d(b);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }
}