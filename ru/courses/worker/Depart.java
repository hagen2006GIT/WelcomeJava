package ru.courses.worker;

class Depart {
    String title;
    Worker boss;

    protected void setBoss(Worker boss) {
        if(boss.depart!=this) throw new IllegalArgumentException("Руководитель должен также работать в "+this.title);
        this.boss = boss;
    }
}
