import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterizationTwo {


    @Parameters({"message"})
    @Test
    public void printHello(String message)
    {
        System.out.println( message );

    }
}
