package auction;



import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class prueba.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class prueba
{
    private auction.Auction auction1;
    private auction.Person person1;
    private auction.Person person2;

    
    
    

    /**
     * Default constructor for test class prueba
     */
    public prueba()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
        auction1 = new auction.Auction();
        person1 = new auction.Person("david");
        person2 = new auction.Person("miguel");
        auction1.enterLot("cuadro");
        auction1.enterLot("mesa");
        auction1.enterLot("lampara");
        auction1.enterLot("puerta");
        auction1.enterLot("televisor");
        auction1.showLots();
        auction1.showLots();
        auction1.makeABid(1, person1, 10);
        auction1.makeABid(1, person2, 30);
        auction1.makeABid(1, person1, 40);
        auction1.showLots();
        auction1.makeABid(2, person2, 50);
        auction1.makeABid(2, person1, 60);
        auction1.makeABid(3, person2, 100);
        auction1.makeABid(3, person1, 220);
        auction1.makeABid(4, person2, 60);
        auction1.makeABid(4, person1, 600);
        auction1.makeABid(5, person1, 100);
        auction1.makeABid(5, person2, 200);
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }
}
