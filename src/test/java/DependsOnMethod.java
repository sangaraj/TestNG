import org.testng.annotations.Test;

public class DependsOnMethod {

    // Before executing A if we want any other methods we can use attribute called dependsOnMethod

    @Test
    public void A()
    {
        System.out.println("This is A");
    }

    @Test(dependsOnMethods = {"C","A"})
    public void B()
    {
        System.out.println("This is B");
    }

    @Test
    public void C()
    {
        System.out.println("This is C");
    }
}
