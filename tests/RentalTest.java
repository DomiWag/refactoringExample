import junit.framework.TestCase;
import org.junit.Before;

public class RentalTest extends TestCase {

    private final int DAYS_RENTED = 90;
    private Movie movie;
    private Rental rental;

    @Before
    public void setUp() throws Exception {
        String MOVIE_TITLE = "Back to the Future";
        movie = new Movie(MOVIE_TITLE, Movie.REGULAR);
        rental = new Rental(movie, DAYS_RENTED);
    }

    public void testGetDaysRented() throws Exception {
        assertEquals(DAYS_RENTED, rental.getDaysRented());
    }

    public void testGetMovie() throws Exception {
        assertEquals(movie, rental.getMovie());
    }
}