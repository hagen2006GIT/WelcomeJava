public class ClosedPolyLine extends Polyline implements Lenable{
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
            sumLen+=(int) Math.sqrt((this.arrLine[i][0].x
                    +this.arrLine[i][1].x)*2
                    +(this.arrLine[i][0].y
                    +this.arrLine[i][1].y)*2);
        }
        sumLen+=(int) Math.sqrt((this.arrLine[0][0].x
                +this.arrLine[0][1].x)*2
                +(this.arrLine[0][0].y
                +this.arrLine[0][1].y)*2);
        return sumLen;
    }
    public int length(){
        int sumLen=0;
        for(int i=0;i<this.pointsArray.length-1;i++) {
            sumLen+=(int) Math.sqrt((this.pointsArray[i].x
                    +this.pointsArray[i+1].x)*2
                    +(this.pointsArray[i].y
                    +this.pointsArray[i+1].y)*2);
        }
        sumLen+=(int) Math.sqrt((this.arrLine[0][0].x
                +this.arrLine[0][1].x)*2
                +(this.arrLine[0][0].y
                +this.arrLine[0][1].y)*2);
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
