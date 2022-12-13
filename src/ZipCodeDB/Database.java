package ZipCodeDB;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Database {

    private ArrayList<Zipcode> codes;

    public Database() {
        // allocate the array list
        this.codes = new ArrayList<>();
        this.load_zips();
    }

    // fill the zipcode array list with real data
    private void load_zips() {
        URL url = null;    //null is the "nothing value"
        Scanner s = null;

        try {
            url = new URL("http://10.60.15.25/~ehar/cs219/zips.txt"); // create a URL object for the path
            s = new Scanner(url.openConnection().getInputStream());
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

       // read zipcode file line by line
        while (s.hasNextLine()){
            String line = s.nextLine();

            String [] parts = line.split(",");

            Zipcode z = new Zipcode(
                    parts[1].substring(1, parts[1].length()-1),
                    parts[2].substring(1, parts[2].length()-1),
                    parts[3].substring(1, parts[3].length()-1),
                    Double.parseDouble(parts[4]),
                    Double.parseDouble(parts[5]),
                    Integer.parseInt(parts[6])
                    );

                    codes.add(z);  // put z at the end of the array list



        } //while

        // sort by the zipcode
        Collections.sort(this.codes);

    } // load_zips

    // write a function to search for zipcode data by a zipcode
    // Return the reference to the object if found
    // null if not found
    public Zipcode findByZip(String code){
        for (Zipcode zipcode : this.codes) {
            if (code.equals(zipcode.getCode())) {
                return zipcode;
            }
        }
        return null;
    }

    // Return the zipcode info of the northern most latitude


    public Zipcode max_latitude(){
        return null;
    }

    private Zipcode bsearch( String target, int low, int high){

        if (low > high) {
            return null;
        }
        int mid = (low + high) / 2;
        if (this.codes.get(mid).getCode().equals(target)){
            return this.codes.get(mid);
        } else if (this.codes.get(mid).getCode().compareTo(target) < 0){
            return bsearch( target, mid+1, high);
        } else {
            return bsearch( target, low, mid-1);
        }

    }

    //provides a simpler interface to the bsearch function
    public Zipcode search (String code){
       //return bsearch(code, 0, codes.size()-1);
        int pos = Collections.binarySearch(this.codes
                ,new Zipcode(code, "", "", 0, 0, 0));

        if (pos != -1){
            return this.codes.get(pos);
        } else {
            return null;
        }

    }

    public Zipcode getNorthern(){
        double latChecker = 0;
        String saver="";
        for (Zipcode zipcode : this.codes) {
            if (Double.parseDouble(zipcode.toString().substring(zipcode.toString().indexOf("lat")+2, zipcode.toString().indexOf(","))) > latChecker) {
                latChecker= Double.parseDouble(zipcode.toString().substring(zipcode.toString().indexOf("lat")+2, zipcode.toString().indexOf(",")));
                saver=zipcode.toString().substring(zipcode.toString().indexOf("code")+2, zipcode.toString().indexOf(","));
            }
        }
        findByZip(saver);
        return null;
    }

    }





