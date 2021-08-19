package page;

import driver.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.io.*;

public class BasePage {

    private  WebDriver webDriver;

    public BasePage() {
        this.webDriver = Driver.webDriver;
    }

    public void clickElement(By selector){
        webDriver.findElement(selector).click();
    }

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
}
