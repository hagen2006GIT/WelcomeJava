
public class Bird implements Singable{
    boolean sing;

    public Bird(boolean sing) {
        this.sing = sing;
    }

    @Override
    public String Sing() {
        return toString();
    }
}
class Sparrow extends Bird{
    public Sparrow(boolean sing) {
        super(sing);
    }
    @Override
    public String toString() {
        return "Sparrow{ чырык }";
    }
}
class Cuckoo extends Bird {
    public Cuckoo(boolean sing) {
        super(sing);
    }
    @Override
    public String toString() {
        int maxCycle=(int) (Math.random()*6)+1;
        StringBuilder res= new StringBuilder("Sparrow{ ку-ку }\n");
        for(int i=1;i<maxCycle;i++) {
            res.append("Sparrow{ ку-ку }\n");
        }
    return res.toString();
    }
}

class Parrot extends Bird {
    String songText;
    public Parrot(boolean sing, String songText) {
        super(sing);
        this.songText = songText;
    }
    @Override
    public String toString() {
        int maxText=(int) (Math.random()*this.songText.length())+1;
        return this.songText.substring(0,maxText);
    }
}