

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class ConverterTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class ConverterTest
{
    /**
     * Default constructor for test class ConverterTest
     */
    @Test(timeout=10)
    public void testDecToBin(){
        int d1 = 23;
        String s1 = Converters.decToBin(23);
        System.out.format("%d -> \"%s\"\n", d1, s1);
        assertEquals(s1, "010111");
    }
    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
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
