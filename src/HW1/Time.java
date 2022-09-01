package HW1;

public class Time {

    public static int converter (int h, int m, int s){
        return (h*3600)+(m*60)+(s);

    }







    public static void main(String[]args){
        int hour = 1;
        int minute = 39;
        int second = 40;


        System.out.println("Homework 1");
        System.out.println(hour+":"+minute+":"+second+" is "+ converter(1,39,40) +" seconds since midnight.");
        System.out.println("There are "+ (86400-converter(1,39,40))+ " seconds remaining.");
        System.out.println(Math.round((double)converter(1,39,40)/86400*100)+"% of the day has elapsed.");


    }
}
