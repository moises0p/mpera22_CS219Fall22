package ZipCodeDB;

public class WeatherObservation {

    private double humidity;
    private double windspeed;
    private double temparature;
    private String clouds;

    public WeatherObservation(double humidity, double windspeed, double temparature, String clouds) {
        this.humidity = humidity;
        this.windspeed = windspeed;
        this.temparature = temparature;
        this.clouds = clouds;
    }

    @Override
    public String toString() {
        return "WeatherObservation{" +
                "humidity=" + humidity +
                ", windspeed=" + windspeed +
                ", temparature=" + temparature +
                ", clouds='" + clouds + '\'' +
                '}';
    }




}
