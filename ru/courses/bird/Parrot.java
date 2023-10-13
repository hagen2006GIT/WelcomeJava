package ru.courses.bird;

public class Parrot extends Bird {
    String songText;

    public Parrot(boolean sing, String songText) {
        super(sing);
        this.songText = songText;
    }

    @Override
    public String toString() {
        int maxText = (int) (Math.random() * this.songText.length()) + 1;
        return "Parrot{ " + this.songText.substring(0, maxText) + " }";
    }
}
