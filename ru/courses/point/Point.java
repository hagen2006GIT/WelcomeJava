package ru.courses.point;

import ru.courses.line.Line;

public class Point {
    public int x;
    public int y;

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public Point() {
        this(1,1);
    }
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public String toString() {
        return "ru.courses.point.Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
    public boolean equals(Object obj) {
        Point pTmp=(Point)obj;
        return(this.x==pTmp.x && this.y==pTmp.y);
    }
}
