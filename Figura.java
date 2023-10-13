import ru.courses.point.Point;

public class Figura implements Figurable {
    Point pointBegin;
    public double Area() {
        return 0;
    }

    public Figura(Point pointBegin) {
        this.pointBegin = pointBegin;
    }
}

class Circle extends Figura{
    int radius;
    public double Area() {
        return Math.PI*this.radius;
    }

    public Circle(Point pointBegin, int radius) {
        super(pointBegin);
        this.radius = radius;
    }
}

class Box extends Figura{
    int xLength;
    public double Area() {
        return this.xLength*2;
    }

    public Box(Point pointBegin, int xLength) {
        super(pointBegin);
        this.xLength = xLength;
    }
}
class Rectangle extends Figura{
    int xLength;
    int yLength;
    public double Area() {
        return this.xLength*2;
    }

    public Rectangle(Point pointBegin, int xLength, int yLength) {
        super(pointBegin);
        this.xLength = xLength;
        this.yLength = yLength;
    }
}
