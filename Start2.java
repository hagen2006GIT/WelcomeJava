import java.util.Arrays;

public class Start2 {


    static double Area(Figurable f) {
        return f.Area();
    }

    public static void main(String[] args){
        Student std1=new Student("alex",new Rule2to5(),new int[]{2,4,5});
        Student std2=new Student("pete",new Rule1to3(),new int[]{0,8,2});
/*        Point3D pnt=new Point3D(2,5,6);
        Object[][] arr1=new Object[3][3];
        arr1[0][0]="point";
        arr1[0][1]=pnt;
        arr1[1][0]="Color";
        arr1[1][1]="Blue";
        arr1[2][0]="Time appearance";
        arr1[2][1]="15:12";

        Points p2=new Points(arr1);
        System.out.println(p2);
*/
/*        ru.courses.point.Point p1=new ru.courses.point.Point(1,5);
        Circle c1=new Circle(p1,10);
        Box b1=new Box(p1,15);
        Rectangle r1=new Rectangle(p1,20,25);
        System.out.println("c1.Area="+c1.Area());
        System.out.println("b1.Area="+b1.Area());
        System.out.println("r1.Area="+r1.Area());
        System.out.println("c1.Area (Figerable)="+Area(c1));
        System.out.println("b1.Area (Figerable)="+Area(b1));
        System.out.println("r1.Area (Figerable)="+Area(r1));
        System.out.println("Общая площадь="+(Area(c1)+Area(b1)+Area(r1)));
*/
/*        ru.courses.bird.Sparrow sparrow1 = new ru.courses.bird.Sparrow(true);
        ru.courses.bird.Sparrow sparrow2 = new ru.courses.bird.Sparrow(true);
        ru.courses.bird.Cuckoo cuckoo1 = new ru.courses.bird.Cuckoo(true);
        ru.courses.bird.Cuckoo cuckoo2 = new ru.courses.bird.Cuckoo(true);
        ru.courses.bird.Parrot parrot1 = new ru.courses.bird.Parrot(true, "Попка-попугай");
        ru.courses.bird.Parrot parrot2 = new ru.courses.bird.Parrot(true, "Федоров-другой");
        ru.courses.bird.Parrot parrot3 = new ru.courses.bird.Parrot(true, "Жора-хороший");
        ru.courses.bird.Bird[] arrBird=new ru.courses.bird.Bird[]{sparrow1,parrot1,parrot3,sparrow2,parrot2,cuckoo2};
        for(ru.courses.bird.Bird b:arrBird) {
            System.out.println(Sing(b));
        }
*/
/*        System.out.println(sparrow1);
        System.out.println(cuckoo1);
        System.out.println(parrot1);

        PolyString str1=new PolyString("Привет");
        ru.courses.point.Point[] arr1=new ru.courses.point.Point[4];
        arr1[0]=new ru.courses.point.Point(1,5);
        arr1[1]=new ru.courses.point.Point(2,8);
        arr1[2]=new ru.courses.point.Point(5,3);
        arr1[3]=new ru.courses.point.Point(8,9);

        ru.courses.polyline.Polyline pLine1=new ru.courses.polyline.Polyline(arr1);
        ClosedPolyLine pLine2=new ClosedPolyLine(arr1);
        System.out.println(pLine1);
        System.out.println(pLine2);

//        System.out.println("ru.courses.polyline.Polyline {"+"pointsArray="+Arrays.toString(pLine1.getPointsArray())+'}');
        System.out.println(pLine1.length());
        System.out.println(Len(pLine1));
//        System.out.println(pLine1.PolyArrayLength());
        System.out.println(pLine2.length());
        System.out.println(Len(pLine2));
//        System.out.println(pLine2.PolyArrayLength());
        System.out.println("String length="+Len(str1));

*/
/*        arr1[1]=new ru.courses.point.Point(12,8);
        pLine1.setPointsArray(arr1);
        System.out.println(pLine1);
        System.out.println("ru.courses.polyline.Polyline {"+"pointsArray="+Arrays.toString(pLine1.getPointsArray())+'}');
        System.out.println(pLine1.PolyLength());
        System.out.println(pLine1.PolyArrayLength());

        System.out.println("ru.courses.polyline.Polyline {"+"arrLine="+Arrays.deepToString(pLine1.getArrLine())+'}');*/
    }
}
interface Figurable{
    public abstract double Area();
}
class Rule2to5 implements Rule {
    @Override
    public boolean Check(int x) {
        return ((x<2)||(x>5));
    }

    @Override
    public boolean Check(String x) {
        return false;
    }
}
class Rule1to3 implements Rule {
    @Override
    public boolean Check(int x) {
        return ((x<1)||(x>3));
    }

    @Override
    public boolean Check(String x) {
        return false;
    }
}