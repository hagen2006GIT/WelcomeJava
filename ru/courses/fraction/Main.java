package ru.courses.fraction;

public class Main implements Cloneable{
    public static void main(String[] args) throws CloneNotSupportedException {
        Fraction f1=new Fraction(3,4);
        Fraction f2=new Fraction(3,5);
        System.out.println(f1.equals(f2));
        f2= (Fraction) f1.clone();
        System.out.println(f1==f2);
    }
}
