import java.util.Objects;

public class Cards {
    public static void main(String[] args){
        int tmp;
        Currency cur1=new Currency("EUR",new RuleCurrency());
        System.out.println("Currency="+cur1.cur);
        for(int i=0;i<10;i++) {
            tmp=AccountNumberGenerator.getNext();
        }
        System.out.println("getAcc = "+AccountNumberGenerator.getAcc());
        AccountNumberGenerator.reset();
        System.out.println("getAcc = "+AccountNumberGenerator.getAcc());
    }
}
class Currency{
    String cur;
    public RuleCurrency rule;

    public Currency(String cur, RuleCurrency rule) {
        this.rule = rule;
        if(!rule.Check(cur)) throw new IllegalArgumentException("code "+cur+" missing from the list of currencies");
        this.cur = cur;
    }
}
class AccountNumberGenerator{
    static int acc=0;
    static int getNext(){
        return ++acc;
    }
    static int getAcc(){
        return acc;
    }
    static void reset(){
        acc=0;
    }
}
class RuleCurrency implements Rule {
    @Override
    public boolean Check(int x) {
        return false;
    }

    @Override
    public boolean Check(String x) {
        return ((Objects.equals(x, "USD"))
                ||(Objects.equals(x, "EUR"))
                ||(Objects.equals(x, "JOY")) //Йена
                ||(Objects.equals(x, "TRY")) //Лира
                ||(Objects.equals(x, "AED")) //Дирхам
                ||(Objects.equals(x, "RUB"))
        );
    }
}
interface Rule{
    boolean Check(int x);
    boolean Check(String x);
}
abstract class Account2{
    int accNum;
    private double komiss;
    private Currency cur;
    double rest;

    public Account2(int accNum, double komiss, Currency cur) {
        this(accNum,komiss,cur,0);
    }

    public Account2(int accNum, double komiss, Currency cur, double rest) {
        this.accNum = accNum;
        this.komiss = komiss;
        this.cur = cur;
        this.rest = rest;
    }
}
class CreditAccount extends Account2{
        int prcStavka;

    public CreditAccount(int accNum, double komiss, Currency cur, int prcStavka) {
        super(accNum, komiss, cur);
        this.prcStavka = prcStavka;
    }

    public CreditAccount(int accNum, double komiss, Currency cur, double rest, int prcStavka) {
        super(accNum, komiss, cur, rest);
        this.prcStavka = prcStavka;
    }
}