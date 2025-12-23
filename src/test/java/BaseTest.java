import DriverFactory.DriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import utils.CSVFile;
import utils.ExcelFile;
import utils.jesonFile;

public class BaseTest {
    WebDriver driver;
    public jesonFile jesonFile;
    public static ExcelFile excelFile;
    public static CSVFile csvFile;

    @BeforeTest
    public void setUp() {
        driver = DriverFactory.getWebDriver("firefox");

        jesonFile=new jesonFile("src/test/resources/data.json");
        excelFile = new ExcelFile("src/test/resources/theData.xlsx","sheet1");
        csvFile = new CSVFile("src/test/resources/data.csv");

    }
}
