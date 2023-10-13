import ru.courses.point.Point;

public class Start3 {
    public static void main(String[] args){

        Point p1=new Point(1,3);
        Point3D p3D=new Point3D(2,4,7);

        System.out.println(p1);
        System.out.println(p3D);

/*        Account acc1=new Account("40817810545251231200");
        Account acc2=new Account("40817810545251231201");
        Account acc3=new Account("40817810545251231202");
        Client cl1=new Client("Семен","Иванов","1245","654852");
        Account[] accountsArray=new Account[]{acc1,acc2,acc3};
        acc1.setRest(100);
        acc2.setRest(120);
        acc3.setRest(1340);
        cl1.setArrAcc(accountsArray);
        cl1.restPlus(acc3,200);
        System.out.println(cl1);*/

/*        ru.courses.worker.Depart dep1=new ru.courses.worker.Depart();
        ru.courses.worker.Depart dep2=new ru.courses.worker.Depart();
        dep1.title="Отдел 1";
        dep2.title="Отдел 2";

        ru.courses.worker.Worker w1=new ru.courses.worker.Worker("Александр",dep1);
        ru.courses.worker.Worker w2=new ru.courses.worker.Worker("Владимир",dep1);
        ru.courses.worker.Worker w3=new ru.courses.worker.Worker("Валентин",dep2);
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

/*        ru.courses.point.Point point1=new ru.courses.point.Point(1,3);
        Square sqrt1=new Square(point1,10);
        System.out.println(sqrt1);
        sqrt1.Resize(2,4,15);
        System.out.println(sqrt1);*/

/*        ru.courses.fraction.Fraction f1=new ru.courses.fraction.Fraction(1,3);
        ru.courses.fraction.Fraction f2=new ru.courses.fraction.Fraction(2,5);
        ru.courses.fraction.Fraction f3=new ru.courses.fraction.Fraction(7,8);

        System.out.println(f1+";"+f2+";"+f3);

        System.out.println(f1.sum(f2).sum(f3));
        System.out.println(f1.sum(f2).sum(f3).minus(new ru.courses.fraction.Fraction(5,1)));*/

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
