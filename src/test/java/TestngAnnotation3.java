import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestngAnnotation3 {
    @Test
    public void TestngAnnotation3method1()
    {
        System.out.println("This is TestngAnnotation3 method1");
    }

    @BeforeSuite
    public void beforeSuite()
    {
        System.out.println("I am before suit");
    }
    @AfterSuite
    public void afterSuite()
    {
        System.out.println("I am after suit");
    }

    /*
    Before and after suite will excute before and after all the classes that are given in under <suite> </suite>
    tag in the xml file
     */
}

