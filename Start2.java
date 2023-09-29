import java.util.Arrays;

public class Start2 {
    public static void main(String[] args){
        Point[] arr1=new Point[4];
        arr1[0]=new Point(1,5);
        arr1[1]=new Point(2,8);
        arr1[2]=new Point(5,3);
        arr1[3]=new Point(8,9);

        Polyline pLine1=new Polyline(arr1);
        System.out.println(pLine1);
        System.out.println("Polyline {"+"pointsArray="+Arrays.toString(pLine1.getPointsArray())+'}');
        System.out.println(pLine1.PolyLength());
        System.out.println(pLine1.PolyArrayLength());


        arr1[1]=new Point(12,8);
        pLine1.setPointsArray(arr1);
        System.out.println(pLine1);
        System.out.println("Polyline {"+"pointsArray="+Arrays.toString(pLine1.getPointsArray())+'}');
        System.out.println(pLine1.PolyLength());
        System.out.println(pLine1.PolyArrayLength());

        System.out.println("Polyline {"+"arrLine="+Arrays.deepToString(pLine1.getArrLine())+'}');
    }
}
