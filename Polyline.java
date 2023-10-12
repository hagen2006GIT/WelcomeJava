import java.util.Arrays;
import java.util.Random;

public class Polyline implements Lenable{
    Point[] pointsArray;
    Point[][] arrLine;
    public Polyline() {
        this(3); //по умолчанию линия состоит из 3 отрезков
    }
    public Polyline(int arrSize){
        this(new Point[arrSize]);
    }
    public Polyline(Point[] arrPoints) {
        Random rand =new Random();
        this.arrLine=new Point[arrPoints.length-1][2];
        this.pointsArray=arrPoints;
        for(int i=0;i<arrPoints.length;i++){
            if(arrPoints[i].x==0 && arrPoints[i].y==0) {
                this.pointsArray[i] = new Point(rand.nextInt(10) + 1, rand.nextInt(10) + 1);
            }
        }
        FillArrLine();
    }

    public Point[][] getArrLine() {
        return arrLine;
    }

    public void FillArrLine() {
        this.arrLine[0][0]=this.pointsArray[0];
        this.arrLine[0][1]=this.pointsArray[1];
        for(int i=1;i<this.pointsArray.length-1;i++) {
            this.arrLine[i][0]=this.arrLine[i-1][1];
            this.arrLine[i][1]=this.pointsArray[i+1];
        }
    }

    public void setPointsArray(Point[] pointsArray) {
        this.pointsArray = pointsArray;
        FillArrLine();
    }

    public Point[] getPointsArray() {
        return pointsArray;
    }
    @Override
    public String toString() {
        String res="Линия [";
        for(int i=0;i<this.pointsArray.length;i++) {
            res=res + "T" + i;
            if(i<this.pointsArray.length-1) res=res+",";
        }
        return res+"]";
    }
    public int length(){
        int sumLen=0;
        for(int i=0;i<this.pointsArray.length-1;i++) {
            sumLen+=(int) Math.sqrt((this.pointsArray[i].x
                                    +this.pointsArray[i+1].x)*2
                                    +(this.pointsArray[i].y
                                    +this.pointsArray[i+1].y)*2);
        }
        return sumLen;
    }
    public int PolyArrayLength(){
        int sumLen=0;
        for(int i=0;i<this.arrLine.length;i++) {
            sumLen+=(int) Math.sqrt((this.arrLine[i][0].x
                    +this.arrLine[i][1].x)*2
                    +(this.arrLine[i][0].y
                    +this.arrLine[i][1].y)*2);
        }
        return sumLen;
    }

    @Override
    public int Len() {
        return length();
    }
}
