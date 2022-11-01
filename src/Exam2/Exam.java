package Exam2;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Arrays;
import java.util.Scanner;

public class Exam {



    public static String [] load_words (String path, int n) {
        URL url = null;    //null is the "nothing value"
        Scanner s = null;

        try {
            url = new URL(path); // create a URL object for the path
            s = new Scanner(url.openConnection().getInputStream());
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        // create an array of strings
        String [] words = new String [n];

        int i=0;
        while (s.hasNextLine()){
            words[i++]=s.nextLine();
        }

        String [] paliwords = new String[9];
        int h = 0;
        for (int j=0; j<words.length; j++){
            if (isPalindrome(words[j])){
                paliwords[h]=words[j];
                h++;
            }
        }


        return paliwords;
    }



    public static String removeSpaces(String s) {
        if (s.length()==0){
            return "";
        } else if (s.charAt(0)== ' '){
            return removeSpaces(s.substring(1));
        } else {
            return s.charAt(0)+removeSpaces(s.substring(1));
        }
    }



    public static String reverse(String s) {
        if (s.length()==0){
            return "";
        } else{
            return reverse(s.substring(1)) + s.charAt(0);
        }
    }


    public static boolean isPalindrome(String s) {
        s=removeSpaces(s);
        return s.equals(reverse(s));
    }







    public static void main(String[] args) {
        String [] words = load_words("http://10.60.15.25/~ehar/cs219/wordle-nyt-solutions.txt",2309);
        Arrays.sort(words);
        for (int i=words.length-1; i>=0; i--){
            System.out.println(words[i]);
        }

    }










}
