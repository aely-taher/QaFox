package TestNG;

import org.testng.annotations.*;


public class TestNg {

    @BeforeSuite
    public void testPre1(){
        System.out.println("Before Suite");
    }
    @BeforeClass
    public void testPre2(){
        System.out.println("Before Class");
    }
    @BeforeTest
    public void testPre3(){
        System.out.println("Before Test");
    }
    @BeforeMethod
    public void testPre4(){
        System.out.println("Before Method");
    }

@Test(enabled = false)   // for disable the test
    public void loginTest()
    {
        System.out.println("Login Test");
    }
    @Test(priority = 2)// test method
    public void loginTest1()
    {
        System.out.println("Login Test1");

    }
    @Test(priority = 1)
    public void loginTest2()
    {
        System.out.println("Login Test3");

    }
    @AfterSuite
    public void testPre5(){
        System.out.println("After Suite");
    }
    @AfterClass
    public void testPre6(){
        System.out.println("After Class");
    }
    @AfterTest
    public void testPre7(){
        System.out.println("After Test");
    }
    @AfterMethod
    public void testPre8(){
        System.out.println("After Method");
    }

}
