package ru.courses.sauce;

public class enum2 {
    static double op(Numbers n,int x,int y){
        return n.op(x,y);
    }
}
enum Numbers {
    ONE{
        double op(int x,int y){
            return x+y;
        }
    },TWO{
        double op(int x,int y){
            return x-y;
        }
    },THREE{
        double op(int x,int y){
            return x*y;
        }
    },FOR {
        double op(int x,int y){
            return x/y;
        }
    };
    double op(int x,int y){
        return 0;
    };
}