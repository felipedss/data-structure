package cci.arraystring;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class OneWayTest {

    @DataProvider
    public static Object[][] dataProvider() {
        return new Object[][]{
                {"pale", "ple", true},
                {"pales", "pale", true},
                {"pale", "bale", true},
                {"pale", "bake", false},
                {"apple", "aple", true},
        };
    }

    @Test(dataProvider = "dataProvider")
    public void test(String a, String b, boolean expected) {
        assertEquals(expected, OneWay.check(a, b));
    }
}
