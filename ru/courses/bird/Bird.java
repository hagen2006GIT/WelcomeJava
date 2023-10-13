package ru.courses.bird;

public class Bird implements Singable {
    boolean sing;

    @Override
    public String Sing() {
        return toString();
    }
    static String Sing(Singable s) {
        return s.Sing();
    }

    public Bird(boolean sing) {
        this.sing = sing;
    }

    public static void main(String[] args) {
        Sparrow sparrow1 = new ru.courses.bird.Sparrow(true);
//        ru.courses.bird.Sparrow sparrow2 = new ru.courses.bird.Sparrow(true);
        Sparrow sparrow2 = new ru.courses.bird.Sparrow(true);
        Cuckoo cuckoo1 = new ru.courses.bird.Cuckoo(true);
        Cuckoo cuckoo2 = new ru.courses.bird.Cuckoo(true);
        Parrot parrot1 = new ru.courses.bird.Parrot(true, "Попка-попугай");
        Parrot parrot2 = new ru.courses.bird.Parrot(true, "Федоров-другой");
        Parrot parrot3 = new ru.courses.bird.Parrot(true, "Жора-хороший");
        Bird[] arrBird=new ru.courses.bird.Bird[]{sparrow1,parrot1,parrot3,sparrow2,parrot2,cuckoo2};
        for(Bird b:arrBird) {
            System.out.println(Sing(b));
        }
        System.out.println(sparrow1);
        System.out.println(cuckoo1);
        System.out.println(parrot1);

    }
}

interface Singable{
    public abstract String Sing();
}
