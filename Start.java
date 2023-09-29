public class Start {
    public static void main(String[] args){
// class "Point"
        Point point1x=new Point(1,3);
        Point point1y=new Point(5,8);
        Point point2x=new Point(10,11);
        Point point2y=new Point(11,19);
// class "Line"
        Line line1=new Line(point1x,point1y);
        Line line2=new Line(point2x,point2y);
        Line line3=new Line(point1y.x,point1y.y, point2x.x, point2x.y);
//        System.out.println("line1: " + line1);
//        System.out.println("line2: " + line2);
        System.out.println("line3: " + line3);
        System.out.println("Длина line1 = " + line1.Length());
        System.out.println("Длина line2 = " + line2.Length());
        System.out.println("Длина line3 = " + line3.Length());
        System.out.println("Длина всех линий = " + (line1.Length()+line2.Length()+line3.Length()));
        line3.pointBegin.x=20;
        line3.pointEnd.y=15;
        System.out.println("line3 (после изменения): " + line3);
        System.out.println("Длина line3 (после изменения)= " + line3.Length());
    }
}
