package ru.job4j.oop;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {

    @Test
    public void whenA00B01ThenDistance1() {
        Point a = new Point(0, 0);
        Point b = new Point(0, 1);
        double out = a.distance(b);
        double expected = 1.0;
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
        public void whenA13B27ThenDistance4d1() {
        Point a = new Point(1, 3);
        Point b = new Point(2, 7);
        double out = a.distance(b);
        double expected = 4.12;
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenA22B13ThenDistance1d4() {
        Point a = new Point(2, 2);
        Point b = new Point(1, 3);
        double out = a.distance(b);
        double expected = 1.41;
        Assert.assertEquals(expected, out, 0.01);
    }

}