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
    Movie movie11;
    Ranking ranking;

    @Before
    public void before(){
        movie1 = new Movie("Star Wars", "Science Fiction", 1);
        movie2 = new Movie("War-Z", "Comedy", 2);
        movie3 = new Movie("Resident Evil", "Horror", 3);
        movie4 = new Movie("Sherlock Holmes", "Detective/Action", 4);
        movie5 = new Movie("Kung-fu Panda", "Comedy", 5);
        movie6 = new Movie("Antz", "Fiction", 6);
        movie7 = new Movie("War and Peace", "History", 7);
        movie8 = new Movie("Fight Club", "Action", 8);
        movie9 = new Movie("Rock'n Rolla", "Action", 9);
        movie10 = new Movie("Batman Forever", "Action", 10);
        movie11 = new Movie("Batman & Jocker", "Action", 7);
        ranking = new Ranking();
        ranking.add(movie1);
        ranking.add(movie2);
        ranking.add(movie3);
        ranking.add(movie4);
        ranking.add(movie5);
        ranking.add(movie6);
        ranking.add(movie7);
        ranking.add(movie8);
        ranking.add(movie9);
        ranking.add(movie10);
        ranking.update(movie11);
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
        assertEquals(1, movie1.getCurrentRanking());
    }

    @Test
    public void testToString(){
        assertEquals("Title: Star Wars, Genre: Science Fiction, Ranking: 1", movie1.toString());
    }

    @Test
    public void testArray(){
        assertNotNull(ranking.getLength());
    }

    @Test
    public void testArray2(){
        assertEquals(10, ranking.getLength() );
    }

    @Test
    public void testArrayByName(){
        assertEquals("Star Wars", ranking.getByRanking(1));
    }

    @Test
    public void testMovieSubstitution(){

        assertEquals("Batman & Jocker", ranking.getByRanking(7));
    }

    @Test
    public void testMovieByName(){
        assertEquals("Title: Star Wars, Genre: Science Fiction, Ranking: 1", ranking.getByName("Star Wars"));
    }

//    @Test
//    public void testReturnMovieNameFromArray() {
//        assertEquals("Star Wars", ranking.getNameAtIndex(0));
//    }
}
