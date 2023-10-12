public class Fraction extends Number{
    private int numerator;
    private int denominator;

    public int intValue(){
        return 0;
    }

    public int intValue(int n){
        return 0;
    }

    @Override
    public long longValue() {
        return 0;
    }

    @Override
    public float floatValue() {
        return 0;
    }

    @Override
    public double doubleValue() {
        return 0;
    }

    ;

    public Fraction(int numerator, int denominator) {
        setNumerator(numerator);
        setDenominator(denominator);
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public void setDenominator(int denominator) {
        if(denominator<0) throw new IllegalArgumentException("Знаменатель должен быть числом положительным");
        this.denominator = denominator;
    }

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }
    public Fraction sum(Fraction f2){
        Fraction res=new Fraction(1,1);
        int a=this.numerator; //числитель дроби 1
        int c=this.denominator; //знаменатель дроби 1
        int b=f2.getNumerator(); //числитель дроби 2
        int d=f2.getDenominator(); //знаменатель дроби 2
        res.setNumerator((a*d)+(b*c));
        res.setDenominator(c*d);
        return res;
    }
    public Fraction minus(Fraction f2){
        Fraction res=new Fraction(1,1);
        int a=this.numerator; //числитель дроби 1
        int c=this.denominator; //знаменатель дроби 1
        int b=f2.getNumerator(); //числитель дроби 2
        int d=f2.getDenominator(); //знаменатель дроби 2
        res.setNumerator((a*d)-(b*c));
        res.setDenominator(c*d);
        return res;
    }
    @Override
    public String toString() {
        return numerator+"/"+denominator;
    }
}
