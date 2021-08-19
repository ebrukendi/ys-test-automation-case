package page;

import com.thoughtworks.gauge.Gauge;
import driver.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import static org.assertj.core.api.Assertions.assertThat;

public class RestaurantDetailPage extends BasePage {
    public WebElement addFavButton = Driver.webDriver.findElement(By.cssSelector(".favorite-button.add"));

}
