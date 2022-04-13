import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameterization {

    @Parameters({"username", "last name"})
    @Test
    public void printUserName(String username, String lastname)
    {
        System.out.println("Hello  " + username + lastname);
    }

    /*
    paratmer can be given at suite level and at test level
    for suite level we give it after suite tag and
    for test level we give it after test tag and before classes tag
     */
}
