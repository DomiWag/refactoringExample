import junit.framework.TestCase;
import org.junit.Before;

public class MovieTest extends TestCase {

    private final String MOVIE_NAME = "Back to the Future";
    private final int PRICE = Movie.REGULAR;
    private Movie movie;

    @Before
    public void setUp() throws Exception {
        movie = new Movie(MOVIE_NAME, PRICE);
    }

    public void testGetPriceCode() throws Exception {
        assertEquals(PRICE, movie.getPriceCode());
    }

    public void testSetPriceCode() throws Exception {
        int NEW_PRICE = Movie.NEW_RELEASE;
        movie.setPriceCode(NEW_PRICE);
        assertEquals(NEW_PRICE, movie.getPriceCode());
    }

    public void testGetTitle() throws Exception {
        assertEquals(MOVIE_NAME, movie.getTitle());
    }
}