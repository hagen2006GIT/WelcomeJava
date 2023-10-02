import java.util.Arrays;

public class City {
    String nameOfCity;
    int fare;
    City[] route;

    public City(String name,int fare2){
        this(name,fare2,new City[]{});
    }
    public City(String name,int fare2,City[] routeArr){
        this.nameOfCity=name;
        this.route=routeArr;
        this.fare=fare2;
    }

    public City getTravel(int n) {
        City tmpCity=this;
        for(int i=0;i<n;i++){
            if(tmpCity.route.length>0) {
                tmpCity=tmpCity.route[0];
//                System.out.println("tmpCity = " + tmpCity);
            } else {
                tmpCity=null;
                break;
            }
        }
        return tmpCity;
    }

    public City[] addRoute(City cityforAdd){
        City[] tmpRouteArr=new City[this.route.length+1];
        if(this.route.length>0) {
            for (int i = 0; i < this.route.length; i++) {
                tmpRouteArr[i] = this.route[i];
            }
            tmpRouteArr[this.route.length]=cityforAdd;
        } else tmpRouteArr[0]=cityforAdd;
//        System.out.println("this.route.length = " + this.route.length);
//        System.out.println(Arrays.toString(tmpRouteArr));
        return tmpRouteArr;
    }
    @Override
    public String toString() {
        String res="City - "+this.nameOfCity+" - "+this.fare+" {\n";
        for(int i=0;i<this.route.length;i++){
            res+="\t"+this.route[i].nameOfCity+"\n";
        }
        res+="}";
        return res;
    }
}
