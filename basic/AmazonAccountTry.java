package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import java.sql.SQLOutput;

public class AmazonAccountTry {

    public static void main(String[] args) {

   System.setProperty("webdriver.gecko.driver","C:\\Users\\Saeed\\Desktop\\WebAutomation\\Driver\\chromedriver_win32\\geckodriver.exe");
        WebDriver driverFox = new FirefoxDriver();
        //Opening WebPage with FireFox
        driverFox.get("http://www.amazon.com");
        //Searching For couple of things using id locator below;

        driverFox.findElement(By.id("twotabsearchtextbox")).sendKeys("MacBookPro 15");
        // Using ClassName becuase ID was not there...
        driverFox.findElement(By.className("nav-input")).click();
        //Clicking the 15" macbook in gray color using the link text locator
        driverFox.findElement(By.linkText("Apple MacBook Pro (15\" Retina, Touch Bar, 2.6GHz 6-Core Intel Core i7, 16GB RAM, 512GB SSD) - Space Gray (Latest Model)")).click();
        // Selecting the i-9 series using id as id is available with this element
//        driverFox.findElement(By.id("a-autoid-18-announce")).click(); // giving some problem in selecting i-9
        // make a amazon account
        //driverFox.findElement(By.className("nav-line-2")).click();// javascript error not letting go through

        // adding to cart using xpath>>> best to use xpath cause its unique here
        driverFox.findElement(By.xpath("//*[@id=\"add-to-cart-button\"]")).click();

        // Adding more stuff using css selector
        driverFox.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys("Aeron Chair");
        // clicking search button
        driverFox.findElement(By.className("nav-input")).click(); //tried to use xpath but that was too absolute so didnt work then switch to classpath
        //Selecting a Chair based on xpath
        driverFox.findElement(By.linkText("Herman Miller Aeron Chair, Size B, Graphite")).click();
        // Selecting different Chair using partial link text selector
        driverFox.findElement(By.partialLinkText("Task Chair: Tilt Limiter/Seat Angle - PostureFit SL -")).click();

        //adding to cart using id locator
//        driverFox.findElement(By.id("add-to-cart-button")).click();
        // tried  manually doing it :(
        //driverFox.findElement(By.id("siNoCoverage-announce")).click();
        // but javascript is not letting it pass
        // proceeding to checkout
//        driverFox.findElement(By.id("hlb-ptc-btn")).click();

        // going to cart

        driverFox.findElement(By.id("nav-cart-count")).click();

        driverFox.findElement(By.linkText("Sign in")).click();

        driverFox.findElement(By.id("createAccountSubmit")).click();

        driverFox.findElement(By.id("ap_customer_name")).sendKeys("XYZ");
        driverFox.findElement(By.id("ap_email")).sendKeys("XYZ@gmil.com");
        driverFox.findElement(By.id("ap_password")).sendKeys("LearNingJava8!!!");
        driverFox.findElement(By.id("ap_password_check")).sendKeys("LearNingJava8!!!");
        driverFox.findElement(By.id("continue")).click();


        System.out.println("Thats our first Case, Need to learn how to handle popups and select check box " +
                " and drop down boxes.....locators are not defined there must be a way.... cause  i tried cssSelector and " +
                " xpath but they lost in the hierarchy....");

        System.out.println("Process finished with exit code 0");




    }
}
