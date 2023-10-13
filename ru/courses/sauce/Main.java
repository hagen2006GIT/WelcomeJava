package ru.courses.sauce;

import static ru.courses.sauce.Sharpness.*;
import static ru.courses.sauce.Numbers.*;
public class Main {
    public static void main(String[] args) {
        Souce s1=new Souce("HEINZE", HOT);
        Souce s2=new Souce("HEINZE", VERYHOT);
        Souce s3=new Souce("BAMBUK", NORM);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        int x=2;
        int y=2;
        Numbers n1=ONE;
        Numbers n2=TWO;
        Numbers n3=THREE;
        Numbers n4=FOR;
        System.out.println(n1.op(x,y));
        System.out.println(n2.op(x,y));
        System.out.println(n3.op(x,y));
        System.out.println(n4.op(x,y));
    }
}
