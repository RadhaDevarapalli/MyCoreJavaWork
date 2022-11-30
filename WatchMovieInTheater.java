package com.corejava.examples;

import java.sql.SQLOutput;

public class WatchMovieInTheater {

    public String parking(String vehicle){

        System.out.println("Rana came to theater on  "+vehicle);
        return vehicle;
    }

    public String securityCheck(){
        return "Security check not completed";
    }

    public int buyTickets(int noOfTickets){
        System.out.println("I bought "+noOfTickets+"  Tickets");
        return noOfTickets;
    }

    public boolean didYouShowTickets(){
       return true;
    }

    public String enterTheater(){
            putYourMobileInSilent();
            System.out.println("I am watching the movie");
            return "I am watching the movie";
    }

    public String movieCompleted(){
        System.out.println("Movie is Good I will give 4 * Rating");
        return "Movie is Good I will give 4 * Rating";
    }

    public boolean putYourMobileInSilent(){
      return true;
    }


    public static void main(String[] args) {

        WatchMovieInTheater movieInTheater = new WatchMovieInTheater();

        movieInTheater.parking( "Two wheeler");
        movieInTheater.securityCheck();
        int i = movieInTheater.buyTickets(0);
        if(i>0){
            movieInTheater.didYouShowTickets();
            movieInTheater.putYourMobileInSilent();
            movieInTheater.enterTheater();
            movieInTheater.movieCompleted();
        }
        else{
            System.out.println("You did not buy tickets");
        }

    }


}
