package basic;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandlingOSPopUps {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.gecko.driver","C:\\Users\\Saeed\\Desktop\\WebAutomation\\Driver\\chromedriver_win32\\geckodriver.exe");
        WebDriver driverFox = new FirefoxDriver();
//
//        driverFox.get("https://www.rediff.com/");
//
//        driverFox.findElement(By.linkText("Sign in")).click();
//        driverFox.findElement(By.name("proceed")).click();
//
//        Alert alert = driverFox.switchTo().alert();
//
//        Thread.sleep(5000);
//        String text = alert.getText();
//        System.out.println(text);
//        alert.accept();
//
//        if(text.equals("Please enter a valid user name")){
//            System.out.println("test passed!!!");
//        }
//        driverFox.close();
//        WebDriver driverFox2 = new FirefoxDriver();

        driverFox.get("http://html.com/input-type-file/");

        driverFox.findElement(By.id("fileupload")).sendKeys("C:\\Users\\Saeed\\Desktop\\notes\\Collections Framework.docx");


        //driverFox2.findElement(By.className("linkButtonSigninHeader")).click();















    }

}
