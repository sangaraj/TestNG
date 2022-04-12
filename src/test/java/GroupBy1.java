import org.testng.annotations.Test;

public class GroupBy1 {

    @Test
    public void grouoBy1_One()
    {
        System.out.println("grouoBy1 one");
    }

    @Test
    public void grouoBy1_Two()
    {
        System.out.println("grouoBy1 Two");
    }

    @Test(groups = {"smoke"})
    public void grouoBy1_Three()
    {
        System.out.println("grouoBy1 Three");
    }


    /*
    if we want to execute selected test from differnt classes we use groups
     */
}
