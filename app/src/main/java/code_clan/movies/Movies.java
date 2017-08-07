package code_clan.movies;

/**
 * Created by R.Murzakov on 07/08/2017.
 */

public class Movies {
    private String name;
    private String genre;
    private int currentRanking;

    public Movies(String name, String genre, int currentRanking){
        this.name = name;
        this.genre = genre;
        this.currentRanking = currentRanking;
    }
    public void setName(String name){
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setGenre(String genre){
        this.genre = genre;
    }
    public String getGenre() {
        return this.genre;
    }

    public int getCurrentRanking() {
        return currentRanking;
    }

    public void setCurrentRanking(int currentRanking) {
        this.currentRanking = currentRanking;
    }

    public String toString(){
        return "Title: " + this.name + ", Genre: " + this.genre + ", Ranking: " + Integer.toString(this.currentRanking );
    }
}
