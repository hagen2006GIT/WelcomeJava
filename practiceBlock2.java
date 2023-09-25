public class practiceBlock2 {

    public static void main(String[] args){
        System.out.println(fraction(3.5));
        System.out.println(sumLastNums(4568));
        System.out.println(charToNum('3'));
        System.out.println(isPositive(-5));
        System.out.println(is2Digits(155));
        System.out.println(isUpperCase('z'));
        System.out.println(isInRange(20,20,20));
        System.out.println(isDivisor(20,11));
        System.out.println(isEqual(2,2,3));
        System.out.println(lastNumSum(lastNumSum(lastNumSum(lastNumSum(5,11),123),14),1));
        System.out.println(abs(-5));
        System.out.println(safeDiv(5,0));
        System.out.println(max(5,10));
        System.out.println(makeDecision(5,1));
        System.out.println(max3(5,10,3));
        System.out.println(sum3(5,10,15));
        System.out.println(sum2(5,1));
        System.out.println(is35(12));
        System.out.println(magic6(12,7));
        System.out.println(age(12));
        System.out.println(day(4));
        printDays("Среда");
    }
    public static void printDays(String x){
        switch(x){
            case "Понедельник":System.out.println("Понедельник");
            case "Вторник":System.out.println("Вторник");
            case "Среда":System.out.println("Среда");
            case "Четверг":System.out.println("Четверг");
            case "Пятница":System.out.println("Пятница");
            case "Суббота":System.out.println("Суббота");
            case "Воскресенье":System.out.println("Воскресенье");
        }
    }
    public static String day(int x){
        String res="это не день недели";
        switch(x){
            case 1:res="Понедельник";break;
            case 2:res="Вторник";break;
            case 3:res="Среда";break;
            case 4:res="Четверг";break;
            case 5:res="Пятница";break;
            case 6:res="Суббота";break;
            case 7:res="Воскресенье";
        }
        return res;
    }
    public static String age(int x){
        String res=null;
        if((x%10==1)&&(x!=11)) res=x+" год";
        else if((x%10>1&&x%10<5)&&(x>11&&x<15)) res=x+" лет";
        else res=x+" года";
        return res;
    }
    public static boolean magic6(int x, int y){
        boolean res=false;
        if((x==6)||(y==6)||(x+y==6)||(abs(x-y)==6)||(abs(y-x)==6)) res=true;
        return res;
    }
    public static boolean is35(int x){
        boolean res;
        res=(x%5==0)||(x%3==0)?true:false;
        if((x%5==0)&&(x%3==0)) res=false;
        return res;
    }
    public static int sum2(int x, int y){
        int res=x+y;
        return (res>9)&&(res<21)?20:res;
    }
    public static boolean sum3(int x, int y, int z){
        return (x+y)==z;
    }
    public static int max3(int x, int y, int z){
        return Math.max(z,Math.max(x,y));
    }
    public static String makeDecision(int x, int y){
        String res = null;
        if(x>y) res=x+ " > " +y;
        if(x<y) res=x+ " < " +y;
        if(x==y) res=x+ " > " +y;
        return res;
    }
    public static int max(int x, int y){
        if(x>=y) return x;
        return y;
    }
    public static int safeDiv(int x, int y){
        int res=0;
        if(y!=0) res=x%y;
        return res;
    }
    public static int abs(int x){
        if(x<0) x=-1*x;
        return x;
    }
    public static int lastNumSum(int a, int b){
        return (a%10)+(b%10);
    }
    public static boolean isEqual (int a, int b, int c){
        return (a==b)&&(b==c)&&(a==c);
    }
    public static boolean isDivisor (int a, int b){
        return (a%b)==0;
    }
    public static boolean isInRange(int a, int b, int num){
        boolean res;
        if(a<b) res = (num>=a) && (num<=b);
        else if(a>b) res = (num>=b) && (num<=a);
        else res = num==b;
        return res;
    }
    public static double fraction(double x){
        int i=(int) x;
        return x-i;
    }
    public static int sumLastNums(int x){
        return x%10 + (x%100)/10;
    }
    public static int charToNum(char x){
        return (int)x;
    }
    public static boolean isPositive(int x){
        return x>0;
    }
    public static boolean is2Digits(int x){
        return (x>9) && (x<100);
    }
    public static boolean isUpperCase(char x){
        return (x>='A') && (x<='Z');
    }
}
