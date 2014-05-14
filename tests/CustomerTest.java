import junit.framework.TestCase;
import org.junit.Before;

public class CustomerTest extends TestCase {

    private final String CUSTOMER_NAME = "John Smith";
    private Customer customer;

    @Before
    public void setUp() throws Exception {
        customer = new Customer(CUSTOMER_NAME);
    }

    public void testAddRental() throws Exception {
        String MOVIE_TITLE = "Back to the Future";
        int RENTAL_DAYS = 90;
        customer.addRental(new Rental(new Movie(MOVIE_TITLE, Movie.REGULAR), RENTAL_DAYS));
    }

    public void testGetName() throws Exception {
        assertEquals(CUSTOMER_NAME, customer.getName());
    }

    public void testStatement() throws Exception {
        assertNotNull(customer.statement());
    }

    public void testHtmlStatement() {
        assertNotNull(customer.htmlStatement());
    }
}