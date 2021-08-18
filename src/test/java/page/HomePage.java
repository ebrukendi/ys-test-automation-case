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
    public WebElement city = Driver.webDriver.findElement(By.xpath("//span[@id='select2-ys-areaSelector-container']"));
    public WebElement firstElm = Driver.webDriver.findElement(By.xpath("//li[@class='select2-results__option'][0]"));

//    WebDriverWait wait = new WebDriverWait(Driver.webDriver, 10);
//    public WebElement firstRestaurantElm = wait.until(
//           ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"new-restaurants\"]/div[1]/div[1]/a")));
    //public WebElement firstRestaurantElm = newRestaurantsTab.findElement(By.xpath("//*[@id=\"new-restaurants\"]/div[1]/div[1]/a"));

    public void waitFor(int... timeOut){
        int timeOutI = 2;
        if (timeOut.length != 0){
            timeOutI = timeOut[0];
        }
        try {
            Thread.sleep(timeOutI * 1000L);
        } catch (InterruptedException e1) {
            e1.printStackTrace();
        }
    }

    public void clickRestaurantsTab() {
        newRestaurantsTab.click();
        //WebDriverWait wait = new WebDriverWait(Driver.webDriver, 10);
        waitFor(100);
       // firstRestaurantElm.click();
    }
    public void selectCityandSearchRestaurant() {
        city.click();
        waitFor(100);
        firstElm.click();
    }

}
