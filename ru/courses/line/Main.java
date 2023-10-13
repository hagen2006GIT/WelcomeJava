package ru.courses.line;
import ru.courses.fraction.Fraction;
import ru.courses.point.*;

public class Main{
    public static void main(String[] args) throws CloneNotSupportedException {
        Line l1=new Line(new Point(2,2),new Point(3,3));
        Line l2=new Line(new Point(2,2),new Point(3,3));
        System.out.println(l1);
        System.out.println(l2);
        System.out.println(l1.equals(l2));
        l2= (Line) l1.clone();
        System.out.println(l1==l2);
    }
}
