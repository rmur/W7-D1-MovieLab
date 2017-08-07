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



    public String getByRanking(int rating) {
        String name = "";
        for (Movie movie : ranking){
            if (rating == movie.getCurrentRanking()){
                name = movie.getName();
            }
        }
        return name;
    }



}
