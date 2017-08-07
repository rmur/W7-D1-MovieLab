package code_clan.movies;



import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertNotNull;

/**
 * Created by R.Murzakov on 07/08/2017.
 */

public class TestMovie {
    Movie movie1;
    Movie movie2;
    Movie movie3;
    Movie movie4;
    Movie movie5;
    Movie movie6;
    Movie movie7;
    Movie movie8;
    Movie movie9;
    Movie movie10;
    Ranking ranking;

    @Before
    public void before(){
        movie1 = new Movie("Star Wars", "Science Fiction", 8);
        movie2 = new Movie("War-Z", "Comedy", 10);
        movie3 = new Movie("Resident Evil", "Horror", 9);
        movie4 = new Movie("Sherlock Holmes", "Detective/Action", 7);
        movie5 = new Movie("Kung-fu Panda", "Comedy", 6);
        movie6 = new Movie("Antz", "Fiction", 5);
        movie7 = new Movie("War and Peace", "History", 4);
        movie8 = new Movie("Fight Club", "Action", 3);
        movie9 = new Movie("Rock'n Rolla", "Action", 2);
        movie10 = new Movie("Batman Forever", "Action", 1);
        ranking = new Ranking();
    }

    @Test
    public void testMovie(){
        assertEquals("Star Wars",movie1.getName() );
    }

    @Test
    public void testGenre(){
        assertEquals("Science Fiction", movie1.getGenre()) ;
    }

    @Test
    public void testRating(){
        assertEquals(8, movie1.getCurrentRanking());
    }

    @Test
    public void testToString(){
        assertEquals("Title: Star Wars, Genre: Science Fiction, Ranking: 8", movie1.toString());
    }

    @Test
    public void testArray(){
        assertNotNull(ranking.getLength());
    }
}
