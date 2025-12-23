import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.security.SecureRandom;
import java.util.List;

public class ProductPage extends BasePage {
    public ProductPage(WebDriver driver) {
        super(driver);
    }

    public  void findProductByName(String ProductName){
        List<WebElement> products = driver.findElements(By.xpath("//button[text()='Add to cart']"));
        for(WebElement product : products){
            String productId = product.getAttribute("id");
            if(productId.toLowerCase().contains(ProductName.toLowerCase())){
                product.click();
                break;
            }

        }
    }
    public  void findProductByName(List<String> ProductName){
        for(int i =0;i<ProductName.size();i++){
            List<WebElement> products = driver.findElements(By.xpath("//button[text()='Add to cart']"));
            for(WebElement product : products){
                String productId = product.getAttribute("id");
                if(productId.toLowerCase().contains(ProductName.get(i).toLowerCase())){
                    product.click();
                    break;
                }
        }


        }
    }







}
