import org.testng.annotations.Test;

public class ClassThree {

    @Test
    public void ClassThreeTest1()
    {
        System.out.println("This is test1 from class three");
    }

    @Test
    public void ClassThreeTest2()
    {
        System.out.println("This is test2, this should get exclude in xml file");
    }
}
