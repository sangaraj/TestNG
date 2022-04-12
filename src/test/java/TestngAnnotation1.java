import org.testng.annotations.*;

public class TestngAnnotation1 {
    @BeforeClass
    public void beforeClass()
    {
        System.out.println("Before Class");
        System.out.println("-------------------------");
    }
    @BeforeMethod
    public void beforeMethod()
    {
        System.out.println("I am before method");
    }

    @Test
    public void TestngAnnotation1Method1()
    {
        System.out.println("This is TestngAnnotation1 method1");
    }

    @Test
    public void TestngAnnotation1Method2()
    {
        System.out.println("This is TestngAnnotation1 method2");
    }


    @AfterMethod
    public void afterMethod()
    {
        System.out.println("I am after method");
    }

    @AfterClass
    public void afterClass()
    {
        System.out.println("Aftet Class");
        System.out.println("-------------------------");
    }

    /*
    Before and After method will execute before and after all the test cases that are declared in that class

    Before and After classe execute before anything is executed in the calss

    So Before/After Class and Before/After method are of the class level

     */
}
