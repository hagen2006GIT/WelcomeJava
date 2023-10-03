public class Square {
    private Point pointTopAngle;
    private int l;

    public Square(Point pointTopAngle, int l) {
        this.pointTopAngle = pointTopAngle;
        setL(l);
    }
    public void Resize(int x,int y,int l){
        setL(l);
        setPointTopAngle(new Point(x,y));
    }
    public void setPointTopAngle(Point pointTopAngle) {
        this.pointTopAngle = pointTopAngle;
    }
    public void setL(int l) {
        if(l<0) throw new IllegalArgumentException("Длина стороны всегжа положительное число");
        this.l = l;
    }

    @Override
    public String toString() {
        return "Квадрат в точке {"+pointTopAngle.x+";"+pointTopAngle.y+"} со стороной "+l;
    }
}
