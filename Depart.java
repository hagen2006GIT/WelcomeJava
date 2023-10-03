
public class Depart {
    String title;
    Worker boss;

    public void setBoss(Worker boss) {
        if(boss.depart!=this) throw new IllegalArgumentException("Руководитель должен также работать в "+this.title);
        this.boss = boss;
    }
}
