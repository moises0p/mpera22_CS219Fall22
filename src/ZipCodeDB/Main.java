package ZipCodeDB;

public class Main {

    public static void main(String[] args) {
/*
        // z1 is the reference to the object which is the data made up of 6 things, code, state and all that
        Zipcode z1 = new Zipcode("13617", "NY", "Canton", 75.16, 44.59, 11781);

        System.out.println(z1);

        Zipcode z2 = new Zipcode("10454", "NY", "Bronx", 73.91, 40.80, 35994);
        System.out.println(z2);
        // this, refers to the object instance kinda, so like z1 or z2
*/
        Database db = new Database();
/*
        System.out.println(db.findByZip("12901"));
        System.out.println(db.findByZip("hello"));

        System.out.println(db.search("43221"));
*/
        System.out.println(db.findByZip("12901"));
        System.out.println(db.getNorthern());

        WeatherObservation wob = db.search("13617").getWeatherData();
        System.out.println(wob);
        return;
    }

}
