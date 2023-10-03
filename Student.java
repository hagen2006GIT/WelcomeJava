import java.util.Arrays;

public class Student {
    private String name;
    private int[] arrScore;

    public Student(String name) {
        this(name,new int[]{});
    }

    public Student(String name, int[] arrScore) {
        this.name = name;
        setArrScore(arrScore);
    }

    public void setName(String name) {
        this.name = name;
    }
    private void ChkScore(int[] arrScore){
        for (int i:arrScore) {
            if ((i < 2) || (i > 5)) throw new IllegalArgumentException("Оценки только от 2 до 5");
        }
    }
    public void setArrScore(int[] arrScore) {
        ChkScore(arrScore);
        this.arrScore = arrScore;
    }
    public void addScore(int score) {
        int[] tmpArr=new int[this.arrScore.length + 1];
        if (this.arrScore.length > 0) {
            for (int i = 0; i < this.arrScore.length; i++) {
                tmpArr[i] = this.arrScore[i];
            }
            tmpArr[this.arrScore.length] = score;
        } else tmpArr[0] = score;
//        System.arraycopy(this.arrScore, 0, tmpArr, 0, this.arrScore.length);
        ChkScore(arrScore);
        setArrScore(tmpArr);
    }
    @Override
    public String toString() {
        return this.name+" {"+Arrays.toString(arrScore)+"}";
    }
}
