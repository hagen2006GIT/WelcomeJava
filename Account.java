public class Account {
    private String num;
    double rest;
    public Account(String num) {
        this(num,0);
    }
    public Account(String num, double rest) {
        if(num.length()>20) throw new IllegalArgumentException("Максимальная длина номера счета 20 символов");
        this.num = num;
        this.rest = rest;
    }

    public void setRest(double rest) {
        this.rest = rest;
    }

    public String getNum() {
        return num;
    }

    public double getRest() {
        return rest;
    }

    @Override
    public String toString() {
        return "Номер счета="+num+", остаток="+rest;
    }
}
