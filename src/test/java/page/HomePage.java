package page;

import java.io.*;
import java.util.List;

import com.thoughtworks.gauge.Gauge;
import driver.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import static org.assertj.core.api.Assertions.assertThat;

public class HomePage extends BasePage {
    public void writeData(String text) {
        String TestFile = "favRestaurant.txt";
        File FC = new File(TestFile);
        try {
            FC.createNewFile();

            FileWriter FW = new FileWriter(TestFile);
            BufferedWriter BW = new BufferedWriter(FW);
            BW.write(text);
            BW.close();
        } catch (IOException ex) {
            System.out.println(ex.toString());
        }
    }

    public String readData() {
        String line = "";
        try {
            FileReader fr = new FileReader("favRestaurant.txt");
            BufferedReader br = new BufferedReader(fr);

            line = br.readLine();

        } catch (IOException e) {
            e.printStackTrace();
        }

        return line;
    }

    public void searchRestaurantOnStates() {
        clickElement(By.xpath("//span[@id='select2-ys-areaSelector-container']"));

        List<WebElement> localityoptionList = Driver.webDriver.findElements(By.cssSelector("li.select2-results__option"));
        localityoptionList.get(0).click();

        clickElement(By.cssSelector(".search-button"));

        List<WebElement> restaurantList = Driver.webDriver.findElements(By.cssSelector(".ys-item"));

        WebElement restaurantName = restaurantList.get(0).findElement(By.cssSelector(".restaurant-display-name"));
        writeData(restaurantName.getText());
        restaurantName.click();
    }

    public void checkUsername(String username){
        WebDriverWait wait = new WebDriverWait(Driver.webDriver, 10);
        WebElement userNameInfo = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.id("ysUserName")));
        assertThat(userNameInfo.getText()).contains(username);
    }

}
