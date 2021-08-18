package page;

import driver.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {
    //public WebElement newRestaurantsTab = Driver.webDriver.findElement(By.xpath("//*[@data-content-id='new-restaurants']"));
    public WebElement favoriteTab = Driver.webDriver.findElement(By.xpath("//*[@data-content-id='favorites']"));
    public WebElement newRestaurantsTab = Driver.webDriver.findElement(By.xpath("//a[@data-content-id='new-restaurants']"));

//    WebDriverWait wait = new WebDriverWait(Driver.webDriver, 10);
//    public WebElement firstRestaurantElm = wait.until(
//           ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"new-restaurants\"]/div[1]/div[1]/a")));
    public WebElement firstRestaurantElm = newRestaurantsTab.findElement(By.xpath("//*[@id=\"new-restaurants\"]/div[1]/div[1]/a"));

    public void clickRestaurantsTab() {
        newRestaurantsTab.click();

        firstRestaurantElm.click();
    }
}
