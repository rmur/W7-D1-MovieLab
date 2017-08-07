package code_clan.movies;

import java.util.ArrayList;

/**
 * Created by R.Murzakov on 07/08/2017.
 */

public class Ranking {
    private ArrayList<Integer> ranking;

    public Ranking(){
        ranking = new ArrayList<Integer>();
    }

    public int getLength() {
        return ranking.size();
    }
}
