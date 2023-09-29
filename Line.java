public class Line {
    Point pointBegin;
    Point pointEnd;
    public Line(Point p1, Point p2) {
        this(p1.x,p1.y,p2.x,p2.y);
    }
    public Line(int x1, int y1,int x2, int y2) {
        this.pointBegin=new Point(x1,y1);
        this.pointEnd=new Point(x2,y2);
    }
    @Override
    public String toString() {
        return "Линия от {"+ pointBegin.x +":"+pointBegin.y+"} до "
                +"{"+pointEnd.x +":"+pointEnd.y+"}";
    }
    public int Length(){
        return (int) Math.sqrt((this.pointBegin.x+this.pointEnd.x)*2+(this.pointBegin.y+this.pointEnd.y)*2);
    }
}
