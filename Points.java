import java.util.Arrays;

public class Points {
    Object[][] objArr=new Object[][]{};

    public Points(Object[][] objArr) {
        this.objArr = objArr;
    }

    @Override
    public String toString() {
        String resString="";
        for(int i=0;i<this.objArr.length;i++) {
            resString=resString+objArr[i][0]+" "+objArr[i][1]+"; ";
        }
        return resString;
    }
}

