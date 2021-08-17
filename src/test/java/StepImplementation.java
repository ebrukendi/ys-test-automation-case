import com.thoughtworks.gauge.Gauge;
import com.thoughtworks.gauge.Step;
import driver.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import page.LoginPage;

import static org.assertj.core.api.Assertions.assertThat;


public class StepImplementation  {
    @Step("Go to Yemek Sepeti City Page")
    public void gotoCityPage() throws InterruptedException {
        WebElement cityButton = Driver.webDriver.findElement(By.xpath("//a[@href='/hatay']"));
        cityButton.click();

        Gauge.writeMessage("Page title is %s", Driver.webDriver.getTitle());
    }

    @Step("Enter Login with <Email> and <Password>")
    public void enterEmailAndPassword(String email, String password) throws InterruptedException {
        //WebElement usernameInput = Driver.webDriver.findElement(By.xpath("//input[@id='UserName']"));
        //WebElement passwordInput = Driver.webDriver.findElement(By.xpath("//input[@id='password']"));
        LoginPage loginPage =  new LoginPage();
        //usernameInput.sendKeys(email);
        //passwordInput.sendKeys(password);
        loginPage.setLoginData(email, password);
        loginPage.clickLoginButton();
        //WebElement loginButton = Driver.webDriver.findElement(By.xpath("//button[@id='ys-fastlogin-button']"));
        //loginButton.click();
        Gauge.captureScreenshot();
    }

    @Step("Check <Username> After Login")
    public void checkUsernameAfterLogin(String username) {
        WebDriverWait wait = new WebDriverWait(Driver.webDriver, 10);
        WebElement userNameInfo = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.id("ysUserName")));

        assertThat(userNameInfo.getText()).contains(username);
        Gauge.writeMessage("User logins successful...");
    }

    @Step("Check <ErrorMessage> for failed login")
    public void checkErrorMessageForFailedLogin(String errorMessage) {
        WebDriverWait wait = new WebDriverWait(Driver.webDriver, 10);
        WebElement errorMessageText = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ui-id-1']/div[1]/span/strong")));

        assertThat(errorMessageText.getText()).contains(errorMessage);
        Gauge.writeMessage("User login failed...");
    }

    @Step("Open the Yemeksepeti homepage")
    public void implementation1() {
        String app_url = System.getenv("APP_URL");
        Driver.webDriver.get(app_url + "/");
        assertThat(Driver.webDriver.getTitle()).contains("Yemek Sepeti");
    }

    @Step("Add favorite restaurant")
    public void addFavoriteRestaurant() throws InterruptedException {
        WebElement newRestaurantsTab = Driver.webDriver.findElement(By.xpath("//*[@data-content-id='new-restaurants']"));
        newRestaurantsTab.click();

        WebElement firstRestaurantLink = Driver.webDriver.findElement(By.xpath("//*[@id=\"new-restaurants\"]/div[1]/div[1]/a"));
        firstRestaurantLink.click();

        WebElement favButton = Driver.webDriver.findElement(By.xpath("//*[@id=\"restaurantDetail\"]/div[2]/div[1]/div/div/div[1]"));
        favButton.click();

        String restaurantName = Driver.webDriver.findElement(By.xpath("//*[@id=\"restaurantDetail\"]/div[1]/div/div[2]/div[1]/div/p")).getText();
        Gauge.writeMessage(restaurantName + " to added favorite restaurants");
    }

    @Step("Check selected restaurant in favorite list")
    public void checkSelectedRestaurant() throws InterruptedException {
        WebElement favoriteTab = Driver.webDriver.findElement(By.xpath("//*[@data-content-id='favorites']"));
        favoriteTab.click();
    }

    @Step("Remove favorite restaurant")
    public void removeSelectedRestaurant() throws InterruptedException {

    }
}
