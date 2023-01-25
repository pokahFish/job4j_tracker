package ru.job4j.oop;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class PointTest {

    @Test
    public void whenA00B01ThenDistance1() {
        Point a = new Point(0, 0);
        Point b = new Point(0, 1);
        a.distance(b);
        double expected = 1.0;
        assertThat(a.distance(b)).isEqualTo(expected);
    }

    @Test
    public void whenA13B27ThenDistance4d1() {
        Point a = new Point(1, 3);
        Point b = new Point(2, 7);
        a.distance(b);
        double expected = 4.123105625617661;
        assertThat(a.distance(b)).isEqualTo(expected);
    }

    @Test
    public void whenA22B13ThenDistance1d4() {
        Point a = new Point(2, 2);
        Point b = new Point(1, 3);
        a.distance(b);
        double expected = 1.4142135623730951;
        assertThat(a.distance(b)).isEqualTo(expected);
    }

}