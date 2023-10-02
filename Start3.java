import java.util.Arrays;

public class Start3 {
    public static void main(String[] args){
        City city1=new City("Новосибирск",150);
        City city2=new City("Воронеж",80);
        City city3=new City("Челябинск",100);
        City cityMoskow=new City("Москва",200,new City[]{city1,city2,city3});

        city1.route=city1.addRoute(city3);
        city1.route=city1.addRoute(city2);
/*        city3.addRoute(city1);
        city2.addRoute(cityMoskow);
        city2.addRoute(city3);*/

        System.out.println(cityMoskow);
        System.out.println(city1);
//        System.out.println(city2);
//        System.out.println(city3);
    }
}
