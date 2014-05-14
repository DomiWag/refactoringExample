import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;

public class MovieTest extends TestCase {

    private final String MOVIE_NAME = "Back to the Future";
    private final int PRICE_CODE = Movie.REGULAR;
    private final int NEW_PRICE_CODE = Movie.NEW_RELEASE;
    private Movie movie;

    @Before
    public void setUp() throws Exception {
        movie = new Movie(MOVIE_NAME, PRICE_CODE);
    }

    @Test
    public void testGetPriceCode() throws Exception {
        assertEquals(PRICE_CODE, movie.getPriceCode());
    }

    @Test
    public void testSetPriceCode() throws Exception {
        movie.setPriceCode(NEW_PRICE_CODE);
        assertEquals(NEW_PRICE_CODE, movie.getPriceCode());
    }

    @Test
    public void testGetTitle() throws Exception {
        assertEquals(MOVIE_NAME, movie.getTitle());
    }
}