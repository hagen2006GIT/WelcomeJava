package ru.courses.bird;

public class Cuckoo extends Bird {
    public Cuckoo(boolean sing) {
        super(sing);
    }

    @Override
    public String toString() {
        int maxCycle = (int) (Math.random() * 6) + 1;
        StringBuilder res = new StringBuilder("Cuckoo{ ку-ку }\n");
        for (int i = 1; i < maxCycle; i++) {
            res.append("Cuckoo{ ку-ку }\n");
        }
        return res.toString();
    }
}
