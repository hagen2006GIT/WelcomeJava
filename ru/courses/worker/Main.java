package ru.courses.worker;

public class Main {
    public static void main(String[] args) {

        Depart dep1=new Depart();
        Depart dep2=new Depart();
        dep1.title="Отдел 1";
        dep2.title="Отдел 2";

        Worker w1=new Worker("Александр",dep1);
        Worker w2=new Worker("Владимир",dep1);
        Worker w3=new Worker("Валентин",dep2);
        dep1.boss=w1;
        dep2.boss=w3;

        System.out.println(w1);
        System.out.println(w2);

        dep1.setBoss(w2);

        System.out.println(w1);
        System.out.println(w2);

    }
}
