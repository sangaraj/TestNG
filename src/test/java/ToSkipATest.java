import org.testng.annotations.Test;

public class ToSkipATest {
    @Test
    public void A()
    {
        System.out.println("A");
    }

    @Test(enabled = false)
    public void B()
    {
        System.out.println("B");
    }

    // To skip a test we can use enabled= false or we can use exclude method in the xml file


    @Test
    public void C()
    {
        System.out.println("C");
    }

}
