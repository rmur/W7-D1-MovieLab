package code_clan.movies;



import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by R.Murzakov on 07/08/2017.
 */

public class TestMovie {
    Movies movie;

    @Before
    public void before(){
        movie = new Movies("Star Wars", "Science Fiction", 8);
    }

    @Test
    public void testMovie(){
        assertEquals("Star Wars",movie.getName() );
    }

    @Test
    public void testGenre(){
        assertEquals("Science Fiction", movie.getGenre()) ;
    }

    @Test
    public void testRating(){
        assertEquals(8, movie.getCurrentRanking());
    }

    @Test
    public void testToString(){
        assertEquals("Title: Star Wars, Genre: Science Fiction, Ranking: 8", movie.toString());
    }
}
