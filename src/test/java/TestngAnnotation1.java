import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestngAnnotation1 {
    @BeforeMethod
    public void beforeMethod()
    {
        System.out.println("I am before method");
    }

    @Test
    public void TestngAnnotation1method1()
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

    /*
    Before and After method will execute before and after all the test cases that are declared in that class
     */
}
