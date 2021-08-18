package page;

import driver.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class RestaurantDetailPage {
    public WebElement favButton = Driver.webDriver.findElement(By.className("favorite-button"));
    public WebElement restaurantName = Driver.webDriver.findElement(By.className("restaurantName"));


}
