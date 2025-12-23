import org.testng.annotations.DataProvider;

public class DataProviderClass {
    @DataProvider(name =  "Login")
    public Object[][] getData() {
        return new Object[][] {{"standard_user","secret_sauce"},};

    }

}

//{"","secret_sauce"},
//        {"standard_user",""},{"1111","1111"},{"##@@","@@##"}