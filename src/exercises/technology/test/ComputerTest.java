package exercises.technology.test;

import exercises.technology.main.Computer;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ComputerTest {

    Computer testComputer;

    @Before
    public void createComputerObject() {testComputer = new Computer("Mac", 6, 250);}

    @Test
    public void testOsSetCorrectly() {
        assertEquals("Mac", testComputer.getOs());
    }

    @Test
    public void testRamSetCorrectly() {
        assertEquals(6, testComputer.getRam());
    }

}
