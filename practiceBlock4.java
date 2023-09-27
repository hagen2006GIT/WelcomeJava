import java.util.Arrays;

public class practiceBlock4 {
    public static void main(String[] args){
        int[] arr={1,-8,3,4,-5,3,4};
        int[] arr5={7,-4};
        int[] arrP={1,-8,3,4,3,-8,3};
        System.out.println(findFirst(arr,3));
        System.out.println(findLast(arr,3));
        System.out.println(maxAbs(arr));
        System.out.println(countPositive(arr));
        System.out.println(palindrom(arrP));
        reverse(arr);
        System.out.println("returned reverseBack: "+Arrays.toString(reverseBack(arr)));
        System.out.println("returned concat: "+Arrays.toString(concat(arr,arrP)));
        System.out.println(Arrays.toString(findAll(arr,3)));
        System.out.println(Arrays.toString(deleteNegative(arr)));
        System.out.println("массив после преобразования: "+Arrays.toString(add(arr,9,4)));
        System.out.println("массив после преобразования: "+Arrays.toString(add2(arrP,arr5,4)));
    }
    public static int[] add2(int[] arr, int[] ins, int pos){
        int[] arrFind=new int[arr.length+ins.length];
        int n=0;
        System.out.println("массив до преобразования: "+Arrays.toString(arr));
        for (int i=0;i<pos-1;i++) {
            arrFind[i]=arr[i];
            n=i;
        }
        System.out.println("массив до преобразования 1: "+Arrays.toString(arrFind));
        System.out.println("n = "+n);

        for (int j=0;j<ins.length;j++) {
            arrFind[j+pos-1]=ins[j];
        }
        System.out.println("массив до преобразования 2: "+Arrays.toString(arrFind));
        n=n+ins.length+1;
        System.out.println("n = "+n);
        System.out.println("arrFind.length = "+arrFind.length);
        for (int k=pos-1;k<arr.length;k++) {
            System.out.println("k = "+k);
            arrFind[k+ins.length]=arr[k];
        }
        return arrFind;
    }
    public static int[] add(int[] arr, int x, int pos){
        int[] arrFind=new int[arr.length];
        System.out.println("массив до преобразования: "+Arrays.toString(arr));
        for (int i=0;i<arr.length;i++) {
            arrFind[i]=arr[i];
            if (i==pos){
                arrFind[i]=x;
            }
        }
        return arrFind;
    }
    public static int[] deleteNegative(int[] arr){
        int[] arrFind=new int[arr.length];
        int j=0;
        for (int i=0;i<arr.length;i++) {
            if (arr[i]<0){
                arrFind[j]=arr[i];
                j++;
            }
        }
        int[] arrRet=new int[j];
        for (int k=0;k<j;k++) {
            arrRet[k]=arrFind[k];
        }
        return arrRet;
    }
    public static int[] findAll(int[] arr, int x){
        int[] arrFind=new int[arr.length];
        int j=0;
        for (int i=0;i<arr.length;i++) {
            if (arr[i]==x){
                arrFind[j]=i;
                j++;
            }
        }
        int[] arrRet=new int[j];
        for (int k=0;k<j;k++) {
                arrRet[k]=arrFind[k];
            }
        return arrRet;
    }
    public static int[] concat(int[] arr1, int[] arr2){
        int[] arrConcat=new int[arr1.length+arr2.length];
        System.out.println("arrConcat.length = "+arrConcat.length);
        for (int i=0;i<arr1.length;i++) {
            arrConcat[i]=arr1[i];
        }
        System.out.println(Arrays.toString(arrConcat));
        System.out.println("arr2.length = "+arr2.length);
        for (int i=0;i<arr2.length;i++) {
            arrConcat[i+arr1.length]=arr2[i];
        }
        return arrConcat;
    }
    public static int[] reverseBack(int[] arr){
        int[] arr2=new int[arr.length];
        for (int i = arr.length-1; i>=0; i--) arr2[arr.length-1-i]=arr[i];
        return arr2;
    }
    public static void reverse(int[] arr){
        int[] arr2=new int[arr.length];
        for (int i = arr.length-1; i>=0; i--) arr2[arr.length-1-i]=arr[i];
        System.out.println("arr = "+Arrays.toString(arr));
        System.out.println("arr2 = "+Arrays.toString(arr2));
    }
    public static boolean palindrom(int[] arr){
        StringBuilder toLeft = new StringBuilder();
        StringBuilder toRight = new StringBuilder();
        for (int j : arr) toLeft.append(j);
        for (int i = arr.length-1; i>=0; i--) toRight.append(arr[i]);
        System.out.println("toLeft = "+toLeft);
        System.out.println("toRight = "+toRight);
        return toLeft.compareTo(toRight) == 0;
    }
    public static int countPositive(int[] arr){
        int resPositiveCnt=0;
        for (int i=0;i<arr.length;i++) {
            if(arr[i]>0) resPositiveCnt++;
        }
        return resPositiveCnt;
    }
    public static int maxAbs(int[] arr){
        int resMaxValue=Math.abs(arr[0]);
        for (int i = arr.length-1; i>=0; i--) {
            if(Math.abs(arr[i])>resMaxValue) resMaxValue=Math.abs(arr[i]);
        }
        return resMaxValue;
    }
    public static int findLast(int[] arr, int x){
        for (int i = arr.length-1; i>=0; i--) {
            if(arr[i]==x) return i;
        }
        return -1;
    }
    public static int findFirst(int[] arr, int x){
        for (int i=0;i<arr.length;i++) {
            if(arr[i]==x) return i;
        }
        return -1;
    }
}
