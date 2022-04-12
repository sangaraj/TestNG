import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestngAnnotation2 {

    @Test
    public void TestngAnnotation2Method1()
    {
        System.out.println("This is TestngAnnotation2 method1");
    }

    @Test
    public void TestngAnnotation2Method2()
    {
        System.out.println("This is TestngAnnotation2 method2");
    }

    @BeforeTest
    public void beforeTest()
    {
        System.out.println("I am Before Test");
    }

    @AfterTest
    public void afterTest()
    {
        System.out.println("I am After Test");
    }

    /*
    when we use Before and AfterTest, This will excute before and After all the test cases of the all the classes that given
    in <Test></test> tag in the xml file. If there are multiple <test></test> in xml file then it will check classname( in which Before Test and After Test are declared"
     in all <test></test> tags, if classname is present in only <test></test>, then scope of it will be in only that tag
     if classname is present in multiple <test></test> then it will execute befoe and after of all the test cases in all the
     classes that are mentioned in different <Test></test> in entire xml file
     */
}
