package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GeneralPractice {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.gecko.driver","C:\\Users\\Saeed\\Desktop\\WebAutomation\\Driver\\chromedriver_win32\\geckodriver.exe");

        WebDriver driverFox = new FirefoxDriver();

        driverFox.navigate().to("http://www.google.com");
        driverFox.findElement(By.name("q")).sendKeys("Afnan");
        
        driverFox.findElement(By.name("q")).sendKeys(Keys.ENTER);
        Thread.sleep(3000);
        driverFox.navigate().back();
        driverFox.navigate().forward();
//        driverFox.get("http://www.yahoo.com");
//        for(int i = 0; i<=5; i++) {
//            driverFox.navigate().back();
//            driverFox.navigate().forward();
//        }
//
//        driverFox.navigate().to("http://www.reddit.com");



    }
}
