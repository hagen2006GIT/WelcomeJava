import java.util.Arrays;

public class Start2 {

    static String Sing(Singable s) {
        return s.Sing();
    }

    static int Len(Lenable l) {
        return l.Len();
    }
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
/*        Point p1=new Point(1,5);
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
/*        Sparrow sparrow1 = new Sparrow(true);
        Sparrow sparrow2 = new Sparrow(true);
        Cuckoo cuckoo1 = new Cuckoo(true);
        Cuckoo cuckoo2 = new Cuckoo(true);
        Parrot parrot1 = new Parrot(true, "Попка-попугай");
        Parrot parrot2 = new Parrot(true, "Федоров-другой");
        Parrot parrot3 = new Parrot(true, "Жора-хороший");
        Bird[] arrBird=new Bird[]{sparrow1,parrot1,parrot3,sparrow2,parrot2,cuckoo2};
        for(Bird b:arrBird) {
            System.out.println(Sing(b));
        }
*/
/*        System.out.println(sparrow1);
        System.out.println(cuckoo1);
        System.out.println(parrot1);

        PolyString str1=new PolyString("Привет");
        Point[] arr1=new Point[4];
        arr1[0]=new Point(1,5);
        arr1[1]=new Point(2,8);
        arr1[2]=new Point(5,3);
        arr1[3]=new Point(8,9);

        Polyline pLine1=new Polyline(arr1);
        ClosedPolyLine pLine2=new ClosedPolyLine(arr1);
        System.out.println(pLine1);
        System.out.println(pLine2);

//        System.out.println("Polyline {"+"pointsArray="+Arrays.toString(pLine1.getPointsArray())+'}');
        System.out.println(pLine1.length());
        System.out.println(Len(pLine1));
//        System.out.println(pLine1.PolyArrayLength());
        System.out.println(pLine2.length());
        System.out.println(Len(pLine2));
//        System.out.println(pLine2.PolyArrayLength());
        System.out.println("String length="+Len(str1));

*/
/*        arr1[1]=new Point(12,8);
        pLine1.setPointsArray(arr1);
        System.out.println(pLine1);
        System.out.println("Polyline {"+"pointsArray="+Arrays.toString(pLine1.getPointsArray())+'}');
        System.out.println(pLine1.PolyLength());
        System.out.println(pLine1.PolyArrayLength());

        System.out.println("Polyline {"+"arrLine="+Arrays.deepToString(pLine1.getArrLine())+'}');*/
    }
}
interface Singable{
    public abstract String Sing();
}
interface Lenable{
    public abstract int Len();
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