package exercises.technology.test;

import exercises.technology.main.Computer;
import exercises.technology.main.SmartPhone;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SmartPhoneTest {

    SmartPhone testPhone;

    @Before
    public void createSmartPhoneObject() {testPhone = new SmartPhone("iOS", 6, 126, "Sprint", 6 );}

    @Test
    public void testOsSetCorrectly() {
        assertEquals("iOS", testPhone.getOs());
    }

    @Test
    public void testServiceProviderSetCorrectly() {
        assertEquals("Sprint", testPhone.getServiceProvider());
    }

}
