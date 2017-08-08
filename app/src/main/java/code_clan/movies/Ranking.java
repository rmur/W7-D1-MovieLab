package code_clan.movies;

import java.util.ArrayList;

/**
 * Created by R.Murzakov on 07/08/2017.
 */

public class Ranking {
    private ArrayList<Movie> ranking;

    public Ranking(){
        ranking = new ArrayList<>();
    }

    public int getLength() {
        return ranking.size();
    }

    public void add(Movie newMovie){
        ranking.add(newMovie);
    }

    public void update(Movie substitutionMovie){
        ranking.set(substitutionMovie.getCurrentRanking()-1, substitutionMovie );
    }



    public String getByRanking(int rating) {
        String name = "";
        for (Movie movie : ranking){
            if (rating == movie.getCurrentRanking()){
                name = movie.getName();
            }
        }
        return name;
    }

    public String getByName(String name){
        String movieName = "";
        for(Movie movie : ranking){
            if (name == movie.getName() ){
                movieName = movie.toString() ;
            }
        }
        return movieName;
    }



}
