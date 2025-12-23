import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheakOutPage extends BasePage {
    private final By AddToCartButton = By.id("add-to-cart-sauce-labs-backpack");
    private final By ShoppingCartButton = By.id("shopping_cart");
    private final By checkoutButton =  By.id("checkout");
    private final By FristNameField = By.xpath("//input[@id= 'first-name']");
    private final By LastNameField = By.xpath("//input[@id='last-name']");
    private final By postalCodeField = By.xpath("//input[@id='postal-code']");
    private final By continueButton = By.id("continue");
    private final By finishButton = By.id("finish");

    public  CheakOutPage(WebDriver driver) {
        super(driver);
    }
    public void AddToCardAndCheakOUT(String FristName, String LastName, String postalCode) {
        driver.findElement(AddToCartButton).click();
        driver.findElement(ShoppingCartButton).click();
        driver.findElement(checkoutButton).click();
        driver.findElement(FristNameField).sendKeys(FristName);
        driver.findElement(LastNameField).sendKeys(LastName);
        driver.findElement(postalCodeField).sendKeys(postalCode);
        driver.findElement(continueButton).click();
        driver.findElement(finishButton).click();


    }




}
