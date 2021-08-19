package page;

import com.thoughtworks.gauge.Gauge;
import driver.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import static org.assertj.core.api.Assertions.assertThat;

public class RestaurantDetailPage extends BasePage {
    public WebElement favButton = Driver.webDriver.findElement(By.className("favorite-button"));
    public WebElement restaurantName = Driver.webDriver.findElement(By.className("restaurantName"));

    public void clickFavButton() {
        favButton.click();
    }

    public void checkfavbuttontext(String favtext) {

        WebDriverWait wait = new WebDriverWait(Driver.webDriver, 10);
        waitFor(5);
        WebElement userNameInfo = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.className("favorite-button")));
        Gauge.writeMessage(userNameInfo.getText() + " xczxcxxxxx");
        assertThat(userNameInfo.getText()).contains(favtext);
    }

}
