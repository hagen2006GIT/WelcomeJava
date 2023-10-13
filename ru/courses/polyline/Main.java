package ru.courses.polyline;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        ru.courses.point.Point[] arr1=new ru.courses.point.Point[3];
        arr1[0]=new ru.courses.point.Point(1,5);
        arr1[1]=new ru.courses.point.Point(2,8);
        arr1[2]=new ru.courses.point.Point(5,3);
        ru.courses.point.Point[] arr2=new ru.courses.point.Point[2];
        arr2[0]=new ru.courses.point.Point(1,5);
        arr2[1]=new ru.courses.point.Point(2,8);

        Polyline pl1=new Polyline(arr1);
        Polyline pl2=new Polyline(arr2);
        System.out.println(pl1);
        System.out.println(pl2);
        System.out.println(pl1.equals(pl2));
    }
}
