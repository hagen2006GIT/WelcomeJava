package ru.courses.sauce;

public class Souce {
    String name; //название соуса
    Sharpness sharp;

    public Souce(String name, Sharpness sharp) {
        this.name = name;
        this.sharp = sharp;
    }

    @Override
    public String toString() {
        return "Souce{"+name+": "+sharp.sharpOfSouce()+'}';
    }
}
enum Sharpness {
    NORM(1){
        public String sharpOfSouce() {
            return "Нормальной остроты";
        }
    },
    HOT(2){
        public String sharpOfSouce() {
            return "Острый";
        }
    },
    VERYHOT(3){
        public String sharpOfSouce() {
            return "Очччень острый";
        }
    };
    int x;
    Sharpness(int x) {
        this.x = x;
    }
    String sharpOfSouce(){
        return "";
    }
}