package ru.courses.main;
import ru.courses.bird.Bird;
import java.awt.Point;

public class Main {
    public static void main(String[] args){
        Point point1=new Point(Integer.parseInt(args[0]),Integer.parseInt(args[1]));
        System.out.println(Pow(args[0],args[1]));
        ru.courses.bird.Sparrow sparrow1 = new ru.courses.bird.Sparrow(true);
        ru.courses.bird.Sparrow sparrow2 = new ru.courses.bird.Sparrow(true);
        ru.courses.bird.Cuckoo cuckoo1 = new ru.courses.bird.Cuckoo(true);
        ru.courses.bird.Cuckoo cuckoo2 = new ru.courses.bird.Cuckoo(true);
        ru.courses.bird.Parrot parrot1 = new ru.courses.bird.Parrot(true, "Попка-попугай");
        ru.courses.bird.Parrot parrot2 = new ru.courses.bird.Parrot(true, "Федоров-другой");
        ru.courses.bird.Parrot parrot3 = new ru.courses.bird.Parrot(true, "Жора-хороший");
        ru.courses.bird.Bird[] arrBird=new ru.courses.bird.Bird[]{sparrow1,parrot1,parrot3,sparrow2,parrot2,cuckoo2};
        for(ru.courses.bird.Bird b:arrBird) {
            System.out.println(b.Sing());
        }
        System.out.println(sparrow1);
        System.out.println(cuckoo1);
        System.out.println(parrot1);
        System.out.println(point1);
    }
    static double Pow(String x,String y){
        return Math.pow(Integer.parseInt(x),Integer.parseInt(y));
    }
}
