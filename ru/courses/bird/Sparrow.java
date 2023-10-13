package ru.courses.bird;

public class Sparrow extends Bird {
    public Sparrow(boolean sing) {
        super(sing);
    }

    @Override
    public String toString() {
        return "Sparrow{ чырык }";
    }
}
