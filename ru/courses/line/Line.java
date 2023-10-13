package ru.courses.line;
import ru.courses.fraction.Fraction;
import ru.courses.point.*;

public class Line {
    public Point pointBegin;
    public Point pointEnd;

    public Line(Point p1, Point p2) {
        this(p1.getX(),p1.getY(),p2.getX(),p2.getY());
    }
    public Line(int x1, int y1,int x2, int y2) {
        this.pointBegin=new Point(x1,y1);
        this.pointEnd=new Point(x2,y2);
    }
    @Override
    public String toString() {
        return "Линия от {"+ pointBegin.getX() +":"+pointBegin.getY()+"} до "
                +"{"+pointEnd.getX() +":"+pointEnd.getY()+"}";
    }
    public int Length(){
        return (int) Math.sqrt((this.pointBegin.getX()+this.pointEnd.getY())*2+(this.pointBegin.getX()+this.pointEnd.getY())*2);
    }
    @Override
    public boolean equals(Object obj) {
        Line lTmp=(Line)obj;
        return(this.pointBegin.equals(lTmp.pointBegin)
                && this.pointEnd.equals(lTmp.pointEnd)
        );
    }
    @Override
    protected Object clone() throws CloneNotSupportedException {
        Line lTmp=new Line(new Point(),new Point(2,2));
        lTmp.pointBegin=this.pointBegin;
        lTmp.pointEnd=this.pointEnd;
        return lTmp;
    }
}

