public class Weather {

    public static double windchill (double t, double mph) {

        return 35.75+0.6215*t+(0.4275*t-35.75)*Math.pow(mph,0.16);

    }



    public static void main(String[]args){

        System.out.println(windchill(32,10));
    }

}
