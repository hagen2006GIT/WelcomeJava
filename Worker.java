public class Worker {
    String name;
    Depart depart;

    public Worker(String name, Depart depart) {
        setName(name);
        setDepart(depart);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDepart(Depart depart) {
        this.depart = depart;
    }

    @Override
    public String toString() {
        return name+" работает в отделе "+depart.title+", начальник которого "+depart.boss.name;
    }
}
