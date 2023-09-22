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
