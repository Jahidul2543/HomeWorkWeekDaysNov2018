package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Home {


    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Saeed\\Desktop\\WebAutomation\\Driver\\chromedriver_win32\\chromedriver.exe");
        System.setProperty("webdriver.gecko.driver","C:\\Users\\Saeed\\Desktop\\WebAutomation\\Driver\\chromedriver_win32\\geckodriver.exe");

        WebDriver driverChrome = new ChromeDriver();

//        WebDriver driverFox = new FirefoxDriver();
//        WebDriver driveChrome2 = new ChromeDriver();

       // driverChrome.get("http://www.google.com");


    driverChrome.get("https://www.ikea.com/ms/en_US/customer-service/contact.html");
        driverChrome.findElement(By.xpath("//*[@id=\"searchContent\"]")).sendKeys("afnan");
        driverChrome.findElement(By.id("searchContent")).sendKeys(" Saeed a quick brown fox jumps over the lazy dog");
        driverChrome.findElement(By.id("inputUnbxdSearch")).click();
        driverChrome.findElement(By.className("desktop-menu__title")).click();
        driverChrome.findElement(By.linkText("Dining tables")).click();
        driverChrome.findElement(By.partialLinkText("Wall-mounted")).click();
        driverChrome.findElement(By.cssSelector("#main > div:nth-child(1) > div:nth-child(1) > a:nth-child(3) > div:nth-child(2) > div:nth-child(1) > img:nth-child(1)")).click();

//        String url = "http://www.google.com";
//        driverFox.get(url);
//
//        driverChrome.quit();
//

//        driverFox.close();

        }

}
