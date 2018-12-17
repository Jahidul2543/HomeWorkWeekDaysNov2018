package basic;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class AlertHandling {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.gecko.driver","C:\\Users\\Saeed\\Desktop\\WebAutomation\\Driver\\chromedriver_win32\\geckodriver.exe");

        WebDriver driverFox = new FirefoxDriver();

        driverFox.get("http://www.amazon.com");

        driverFox.findElement(By.id("twotabsearchtextbox")).sendKeys("Aeron Chiar");

        driverFox.findElement(By.className("nav-input")).click();

        driverFox.findElement(By.linkText("Herman Miller Aeron Task Chair: Standard Tilt - Zonal Back Support - Fixed Arm - Dark Mineral Vinyl Armpad - Carpet Caster")).click();


        Select qty = new Select(driverFox.findElement(By.id("quantity")));

        qty.selectByVisibleText("3");



       driverFox.findElement(By.id("add-to-cart-button")).click();

        Thread.sleep(5000);

       Alert alert =driverFox.switchTo().alert();
        System.out.println(alert.getText());
       alert.dismiss();
       driverFox.findElement(By.className("a-button-input")).click();


//       driverFox.findElement(By.xpath("/html/body/div[1]/div/header/div/div[2]/div[2]/div/a[5]/span[3]")).click();




    }

}
