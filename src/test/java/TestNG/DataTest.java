package TestNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataTest {

    @DataProvider (name = "DataUser")
    public Object[][] dataProvider() {
        return new Object[][]{
                {"Username1", "Password1"},
                {"Username2", "Password2"}
        };
    }
        @Test (dataProvider = "DataUser")
        public void TestCase(String a, String b)
        {
            System.out.println(a);
            System.out.println(b);
        }

    }

