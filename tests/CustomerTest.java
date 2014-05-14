import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;

public class CustomerTest extends TestCase {

    private final String CUSTOMER_NAME = "John Smith";
    private final String MOVIE_TITLE = "Back to the Future";
    private final int RENTAL_DAYS = 90;
    private Customer customer;

    @Before
    public void setUp() throws Exception {
        customer = new Customer(CUSTOMER_NAME);
    }

    @Test
    public void testAddRental() throws Exception {
        customer.addRental(new Rental(new Movie(MOVIE_TITLE, Movie.REGULAR), RENTAL_DAYS));
    }

    @Test
    public void testGetName() throws Exception {
        assertEquals(CUSTOMER_NAME, customer.getName());
    }

    @Test
    public void testStatement() throws Exception {
        assertNotNull(customer.statement());
    }
}