package ch.hslu.plab.sw06;

import ch.hslu.plab.sw03.kontrollstrukturen.MinMax;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.*;

import static org.junit.Assert.*;

public class MinMaxTest {

    Logger logger = LogManager.getLogger(Mercury.class);

    @BeforeClass
    public static void setUpForAll(){
        System.out.println("why is this static?????");
    }

    @AfterClass
    public static void tearDownForAll(){
        System.out.println("why is this static?????");
        System.out.println("bye!");
    }

    @Before
    public void setUp() throws Exception {
        logger.warn("before will be called befor every test is runned. It uses probably more time, but you have every time a clean environment");
    }

    @After
    public void tearDown() throws Exception {
        logger.info("We're done with testing now... tear down...");
    }

    @Test
    public void getMin() throws Exception {
        Assert.assertEquals(-13,MinMax.getMin(1,3,53,23,0,-13));
    }

    @Test
    public void getMax() throws Exception {
        Assert.assertEquals(53,MinMax.getMax(1,3,53,23,0,-13));
    }

    @Test
    public void getMax1() throws Exception {
        Assert.assertEquals(154,MinMax.getMax(1,3,154,53,23,0,-13));
    }

    @Test
    public void getMin1() throws Exception {
        Assert.assertEquals(-11,MinMax.getMin(-11,3,154,53,23,0,-3));
    }

}