import java.util.Arrays;

public class Start3 {
    public static void main(String[] args){

        Account acc1=new Account("40817810545251231200");
        System.out.println(acc1);
        acc1.setRest(100);
        System.out.println(acc1);
/*        Depart dep1=new Depart();
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

        dep1.setBoss(w3);

        System.out.println(w1);
        System.out.println(w2);*/

/*        int[] arrScores=new int[]{3,5,5,4};
        Student s1=new Student("Александр",arrScores);
        System.out.println(s1);
        s1.addScore(4);
        System.out.println(s1);*/

/*        Point point1=new Point(1,3);
        Square sqrt1=new Square(point1,10);
        System.out.println(sqrt1);
        sqrt1.Resize(2,4,15);
        System.out.println(sqrt1);*/

/*        Fraction f1=new Fraction(1,3);
        Fraction f2=new Fraction(2,5);
        Fraction f3=new Fraction(7,8);

        System.out.println(f1+";"+f2+";"+f3);

        System.out.println(f1.sum(f2).sum(f3));
        System.out.println(f1.sum(f2).sum(f3).minus(new Fraction(5,1)));*/

/*        City city1=new City("Новосибирск",150);
        City city2=new City("Воронеж",80);
        City city3=new City("Челябинск",100);
        City cityMoskow=new City("Москва",200,new City[]{city1,city2,city3});

        city1.route=city1.addRoute(city3);
        city1.route=city1.addRoute(city2);
        city1.route=city1.addRoute(cityMoskow);
        city3.route=city3.addRoute(city2);
        city3.route=city3.addRoute(cityMoskow);
        city2.route=city2.addRoute(cityMoskow);

        System.out.println(cityMoskow);
        System.out.println(city1);
        System.out.println(city2);
        System.out.println(city3);
        System.out.println("rtsult = "+city1.getTravel(3));
        System.out.println(city2);
        System.out.println(city3);*/
    }
}
