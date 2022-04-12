import org.testng.annotations.Test;

public class GroupBy2 {


    @Test
    public void grouoBy2_One()
    {
        System.out.println("grouoBy2 one");
    }

    @Test
    public void grouoBy2_Two()
    {
        System.out.println("grouoBy2 Two");
    }

    @Test(groups = {"smoke"})
    public void grouoBy2_Three()
    {
        System.out.println("grouoBy2 Three");
    }
}
