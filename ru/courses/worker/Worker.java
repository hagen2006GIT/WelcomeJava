package ru.courses.worker;

class Worker {
    String name;
    Depart depart;

    protected  Worker(String name, Depart depart) {
        setName(name);
        setDepart(depart);
    }

    protected  void setName(String name) {
        this.name = name;
    }

    protected  void setDepart(Depart depart) {
        this.depart = depart;
    }

    @Override
    public String toString() {
        return name+" работает в отделе "+depart.title+", начальник которого "+depart.boss.name;
    }
}
