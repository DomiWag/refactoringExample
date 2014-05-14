import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;

public class RentalTest extends TestCase {

    private final String MOVIE_TITLE = "Back to the Future";
    private final int DAYS_RENTED = 90;
    private Movie movie;
    private Rental rental;

    @Before
    public void setUp() throws Exception {
        movie = new Movie(MOVIE_TITLE, Movie.REGULAR);
        rental = new Rental(movie, DAYS_RENTED);
    }

    @Test
    public void testGetDaysRented() throws Exception {
        assertEquals(DAYS_RENTED, rental.getDaysRented());
    }

    @Test
    public void testGetMovie() throws Exception {
        assertEquals(movie, rental.getMovie());
    }
}