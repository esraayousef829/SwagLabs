import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.annotations.Test;

public class login extends BaseTest {
@Severity(SeverityLevel.CRITICAL)
    @Test(description = "")
    public void negativeSenario() {

        driver.get("https://www.saucedemo.com");
        LoginPage loginPage = new LoginPage(driver);
//        List<Map<String,String>> allData = CSVFile.getAllData();
//
//        String username = allData.get(0).get("username");
//        String password = allData.get(0).get("password");

        loginPage.login((String) jesonFile.getValue("username"),
                (String) jesonFile.getValue("password")) ;
         driver.manage().window().maximize();

//        String username = excelFile.GetSpecficValue(0, 0);
//        String password = excelFile.GetSpecficValue(0, 1);
//        loginPage.login(username, password);



    }
}