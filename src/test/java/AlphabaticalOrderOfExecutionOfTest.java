import org.testng.annotations.Test;

public class AlphabaticalOrderOfExecutionOfTest {

    @Test
    public void A()
    {
        System.out.println("A");
    }

    @Test
    public void C()
    {
        System.out.println("C");
    }

    @Test
    public void a()
    {
        System.out.println("a");
    }

    @Test
    public void b()
    {
        System.out.println("b");
    }

    @Test
    public void R()
    {
        System.out.println("R");
    }


    /*
    The order of excution of test follow the alphabatical order
     */
}
