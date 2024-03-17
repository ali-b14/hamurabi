package hammurabi.docs.matuszek;

import hammurabi.src.main.Hammurabi;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class HammurabiTest {

    Hammurabi ham;

    boolean about(double expected, double actual) {
        return actual > 0.90 * expected && actual < 1.10 * expected;
    }

    @Before
    public void setUp() throws Exception {
        ham = new Hammurabi();
    }

    @Test
    public void testaskHowManyAcresToBuy () {

        Hammurabi hammurabi = new Hammurabi();
        int expectedAcresOwned = 1001;
        int landValue = 19;
        int acresToBuy = 1;


        int actualAcresOwned = hammurabi.askHowManyAcresToBuy();


        assertEquals(expectedAcresOwned, actualAcresOwned);

    }

//    @Test
//    public void plagueDeaths() {
//    }

//    @Test
//    public void testStarvationDeaths() {
//        int deaths = ham.starvationDeaths(100, 1639);
//
//        deaths = ham.starvationDeaths(10, 2500);
//        if (deaths < 0) {
//        }
//
//        assertEquals("Wrong number of starvations deaths.", 1, deaths);
//    }

//    @Test
//    public void testUprising () {
//    }
//
//    @Test
//        public void testImmigrants () {
//    }
//
//    @Test
//        public void testHarvest () {
//    }
//
//    @Test
//        public void testGrainEatenByRats () {
//    }
//
//    @Test
//        public void testNewCostOfLand () {
//    }
}