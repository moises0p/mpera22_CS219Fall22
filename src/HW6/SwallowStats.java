package HW6;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class SwallowStats {


    public static void swallow_stats() {

        //connect to the web page of speeds
        URL url = null;    //null is the "nothing value"
        Scanner s = null;
        String path = "http://10.60.15.25/~ehar/cs219/swallow-speeds.txt";

        try {
            url = new URL(path); // create a URL object for the path
            s = new Scanner(url.openConnection().getInputStream());
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        double sum = 0.0;
        int count = 0;
        double max = Double.NEGATIVE_INFINITY;
        double min = Double.POSITIVE_INFINITY;
        while (true) {
            if (!s.hasNextLine()) {
                break;
            }
            String line = s.nextLine(); //read a line of the website

            if (line.indexOf("#") == -1 && line.length() != 0) { //modify condition

                sum += Double.parseDouble(line);

                if (Double.parseDouble(line) > max) { //modify condition
                    max = Double.parseDouble(line);
                }
                if (Double.parseDouble(line) < min) { //modify condition
                    min = Double.parseDouble(line);
                }
                count++;
            }
        }


        System.out.printf("Maximum swallow speeds is %.2f\n", max);
        System.out.printf("Minimum swallow speeds is %.2f\n", min);
        System.out.printf("Average swallow speeds is %.2f\n", sum / count);

    } // avg swallow speed

    public static void main(String[] args) {
        swallow_stats();
    }


}