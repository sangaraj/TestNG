import org.testng.annotations.Test;

public class ExecuteAllCasesWithSpecificKeyword {


    @Test
    public void login_testcase1()
    {
        System.out.println("login test case 1");
    }

    @Test
    public void login_testcase2()
    {
        System.out.println("login test case 2");
    }

    @Test
    public void sign_up_testcase1()
    {
        System.out.println("Sign up test case 1");
    }
}

/*
<class name="ExecuteAllCasesWithSpecificKeyword">
                <methods>
                    <exclude name="login.*"/>
                </methods>
                <methods>
                    <include name="login.*"/>
                </methods>

Based on the inlcude and exclude keywords, we can ask testng to include or exclude the test cases based on
keyword followed by *




*/