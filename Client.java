import java.util.Arrays;
import java.util.Objects;

public class Client {
    private String n; //имя
    private String f; //фамилия
    private String ser; //серия паспорта
    private String num; //номер паспорта
    Account[] arrAcc; //массив счетов

    public Client(String n, String f, String ser, String num) {
        this(n,f,ser,num,new Account[] {});
    }

    public Client(String n, String f, String ser, String num, Account[] arrAcc) {
        this.n = n;
        this.f = f;
        this.ser = ser;
        this.num = num;
        this.arrAcc = arrAcc;
    }

    public void setArrAcc(Account[] arrAcc) {
        this.arrAcc = arrAcc;
    }

    public Account[] getArrAcc() {
        return arrAcc;
    }

    public Account getAcc(String num) {
        for (Account acc: this.arrAcc) {
            if (Objects.equals(acc.getNum(), num)) return acc;
        }
        return null;
    }
    public void restMinus(Account accNum,double sum) {
        for (Account acc: this.arrAcc) {
            if (Objects.equals(acc.getNum(), accNum.getNum())) acc.setRest(acc.getRest()-sum);
        }
    }
    public void restPlus(Account accNum,double sum) {
        for (Account acc: this.arrAcc) {
            if (Objects.equals(acc.getNum(), accNum.getNum())) acc.setRest(acc.getRest()+sum);
        }
    }
    public double getSumRestAccAll() {
        double allRest=0;
        for (Account acc: this.arrAcc) {
            allRest+=acc.getRest();
        }
        return allRest;
    }
    public double getSumRestAccPositive() {
        double allRest=0;
        for (Account acc: this.arrAcc) {
            if(acc.getRest()>0) allRest+=acc.getRest();
        }
        return allRest;
    }
    public Account[] delAcc(String num) {
        Account[] tmpAcc=new Account[this.arrAcc.length-1];
        int i=0;
        for (Account acc: this.arrAcc) {
            if (!Objects.equals(acc.getNum(), num)){
                tmpAcc[i++]=acc;
            }
        }
        return tmpAcc;
    }
    public void addAcc(Account newAcc) {
        Account[] tmpAcc=new Account[this.arrAcc.length+1];
        int i=0;
        for (Account acc: this.arrAcc) {
            tmpAcc[i++]=acc;
        }
        tmpAcc[this.arrAcc.length]=newAcc;
        this.arrAcc=tmpAcc;
    }

    @Override
    public String toString() {
        return "Client{" +
                "n='" + n + '\'' +
                ", f='" + f + '\'' +
                ", ser='" + ser + '\'' +
                ", num='" + num + '\'' +
                ", arrAcc=" + Arrays.toString(arrAcc) +
                '}';
    }
}
