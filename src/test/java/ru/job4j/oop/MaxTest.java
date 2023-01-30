package ru.job4j.oop;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MaxTest {
    @Test
    public void whenMax1To0Then1() {
        int a = 1;
        int b = 0;
        int result = Max.max(a, b);
        int expected = 1;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax5To10Then10() {
        int a = 5;
        int b = 10;
        int result = Max.max(a, b);
        int expected = 10;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax1To2To3Then3() {
        int a = 1;
        int b = 2;
        int c = 3;
        int result = Max.max(a, b, c);
        int expected = 3;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax55To33To44To77Then77() {
        int a = 55;
        int b = 33;
        int c = 44;
        int d = 77;
        int result = Max.max(a, b, c, d);
        int expected = 77;
        assertThat(result).isEqualTo(expected);

    }
}