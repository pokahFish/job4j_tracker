package ru.job4j.oop;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;
public class Point {
    private int x;
    private int y;
    private int z;

    public Point(int first, int second) {
        this.x = first;
        this.y = second;
    }

    public Point(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double distance(Point that) {
        return sqrt(pow(this.x - that.x, 2) + pow(this.y - that.y, 2));
    }

    public double distance3d(Point that) {
        return sqrt(pow(this.x - that.x, 2) + pow(this.y - that.y, 2) + pow(this.z - that.z, 2));
    }

    public static void main(String[] args) {
        Point a = new Point(2, 2);
        Point b = new Point(1, 3);
        Point c = new Point(1, 2, 3);
        Point d = new Point(4, 5, 6);
        double dist = c.distance(d);
        System.out.println(dist);
    }
}
