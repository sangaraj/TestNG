import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderExample {

    @Test(dataProvider = "getData")
    public void printNames(String name, int age)
    {
        System.out.println(name);
        System.out.println(age);
    }


    @DataProvider
    public Object[][] getData()
    {
        Object[][] data = new Object[3][2];
        data[0][0] = "rohit1";
        data[0][1] = 10;

        data[1][0] = "rohit2";
        data[1][1] = 15;

        data[2][0] = "rohit3";
        data[2][1] = 20;

        return data;


    }
}
