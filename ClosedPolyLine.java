import ru.courses.point.Point;
import ru.courses.polyline.Polyline;

/*public class ClosedPolyLine extends Polyline implements Lenable{
    public ClosedPolyLine(Point[] arrPoints) {
        super(arrPoints);
    }
    public ClosedPolyLine(int arrSize) {
        super(arrSize);
    }
    public ClosedPolyLine() {
        super();
    }

    public int PolyArrayLength(){
        int sumLen=0;
        for(int i=0;i<this.arrLine.length;i++) {
            sumLen+=(int) Math.sqrt((this.arrLine[i][0].getX()
                    +this.arrLine[i][1].getX())*2
                    +(this.arrLine[i][0].getY()
                    +this.arrLine[i][1].getY())*2);
        }
        sumLen+=(int) Math.sqrt((this.arrLine[0][0].getX()
                +this.arrLine[0][1].getX())*2
                +(this.arrLine[0][0].getY()
                +this.arrLine[0][1].getY())*2);
        return sumLen;
    }
    public int length(){
        int sumLen=0;
        for(int i=0;i<this.pointsArray.length-1;i++) {
            sumLen+=(int) Math.sqrt((this.pointsArray[i].getX()
                    +this.pointsArray[i+1].getX())*2
                    +(this.pointsArray[i].getY()
                    +this.pointsArray[i+1].getY())*2);
        }
        sumLen+=(int) Math.sqrt((this.arrLine[0][0].getX()
                +this.arrLine[0][1].getX())*2
                +(this.arrLine[0][0].getY()
                +this.arrLine[0][1].getY())*2);
        return sumLen;
    }
    public String toString() {
        String res="Линия [";
        for(int i=0;i<this.pointsArray.length;i++) {
            res=res + "T" + i;
            if(i<this.pointsArray.length-1) res=res+",";
        }
        return res+",T"+0+"]";
    }
}
*/