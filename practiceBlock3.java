public class practiceBlock3 {
    public static void main(String[] args){
        guessGame();
        System.out.println(listNums(15));
        System.out.println(reverseListNums(15));
        System.out.println(chet(15));
        System.out.println(pow(2,5));
        System.out.println(numLen(123456));
        System.out.println(equalNum(11121));
        square(4);
        leftTriangle(4);
        rightTriangle(6);
    }
    public static void guessGame() {
        int randomNum = 3;
        int i = 0;
        int x;
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println("What number am I thinking (0 to 9)? :");
        do {
            x = sc.nextInt();
            if (x != randomNum) {
                System.out.println("No, try again");
            } else {
                System.out.println("Yes, it`s " + randomNum);
            }
            i++;
        } while (x != randomNum);
        System.out.println("Количество попыток = "+i);
    }
    public static void rightTriangle(int x){
        for(int i=0;i<x;i++){
            for(int j=0;j<x;j++){
                if(j>=(x-i-1)) {
                    System.out.print("* ");
                } else System.out.print("  ");
            }
            System.out.println();
        }
    }
    public static void leftTriangle(int x){
        for(int i=0;i<x;i++){
            for(int j=0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void square(int x){
        for(int i=0;i<x;i++){
            for(int j=0;j<x;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static boolean equalNum(int x){
        boolean res=true;
        int x2=x;
        int y2;
        int y1=x2%10;;
        while(x2>0) {
            y2=x2%10;
            if(y2!=y1) {
                res=false;
                break;
            }
            x2=x2/10;
        }
        return res;
    }
    public static int numLen(long x){
        int i=0;
        long x2=x;
        while(x2>0) {
            x2=x2/10;
            i++;
        }
        return i;
    }
    public static String listNums(int x){
        StringBuilder res= new StringBuilder();
        for(int i=0;i<x+1;i++){
           res.append(i).append(" ");
        }
        return res.toString();
    }
    public static String reverseListNums(int x){
        StringBuilder res= new StringBuilder();
        for(int i=x;i>=0;i--){
            res.append(i).append(" ");
        }
        return res.toString();
    }
    public static String chet(int x){
        StringBuilder res= new StringBuilder();
        for(int i=0;i<=x;i=i+2){
            res.append(i).append(" ");
        }
        return res.toString();
    }
    public static int pow(int x, int y){
        int res=1;
        for(int i=1;i<=y;i++){
            res=res*x;
        }
        return res;
    }
}
