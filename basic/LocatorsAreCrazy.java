package basic;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class LocatorsAreCrazy {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.gecko.driver","C:\\Users\\Saeed\\Desktop\\WebAutomation\\Driver\\chromedriver_win32\\geckodriver.exe");

        WebDriver driverFox = new FirefoxDriver();
        driverFox.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driverFox.navigate().to("https://www.tutorialspoint.com/selenium/selenium_automation_practice.htm");

        driverFox.manage().window().maximize();
//
//        driverFox.findElement(By.className("icon-search")).click();
//
//        driverFox.findElement(By.id("search-string")).sendKeys("Selenium");
//
//        String value =driverFox.findElement(By.id("search-string")).getAttribute("values");


        driverFox.findElement(By.name("firstname")).sendKeys("Afna");

        driverFox.findElement(By.name("lastname")).sendKeys("Afna");
        driverFox.findElement(By.xpath("//input[@ value = 'Male']")).click();
        /*for(int i = 0; i <=10; i++){

        driverFox.findElement(By.xpath("//input[@ value = 'Male']")).click();

        driverFox.findElement(By.xpath("//input[@value ='Female']")).click();

        driverFox.findElement(By.xpath("//input[@value='Male']")).click();}
*/

        driverFox.findElement(By.xpath("//input[@value = '2']")).click();


/*
        int i = 0;
        while(i<3){
            driverFox.findElement(By.xpath("//input[@value = '1']")).click();
            driverFox.findElement(By.xpath("//input[@value = '2']")).click();
            driverFox.findElement(By.xpath("//input[@value = '3']")).click();
            driverFox.findElement(By.xpath("//input[@value = '4']")).click();
            driverFox.findElement(By.xpath("//input[@value = '5']")).click();
            driverFox.findElement(By.xpath("//input[@value = '6']")).click();
            driverFox.findElement(By.xpath("//input[@value = '7']")).click();
            i++;
        }
*/

        driverFox.findElement(By.xpath("/html/body/div[4]/div[1]/div/div[2]/div[1]/div/div[6]/div/form/table/tbody/tr[5]/td[2]/input")).sendKeys("Dec 18,2018");
        driverFox.findElement(By.xpath("//input[@value='Automation Tester']")).click();
        driverFox.findElement(By.xpath("//input[@value='Selenium IDE']")).click();
        driverFox.findElement(By.xpath("//input[@type='file']")).sendKeys("C:\\Users\\Saeed\\Desktop\\notes\\jdbc notes.docx");

        Select select = new Select(driverFox.findElement(By.name("continents")));

        select.selectByVisibleText("North America");

        Select select1 = new Select(driverFox.findElement(By.name("selenium_commands")));

        select1.selectByVisibleText("WebElement Commands");

        driverFox.findElement(By.name("submit")).click();
        Thread.sleep(3000);
        Alert alert = driverFox.switchTo().alert();

        alert.dismiss();




//        driverFox.findElement(By.linkText("Female")).click();
//
//        driverFox.findElement(By.linkText("Male")).click();


/*

        List<WebElement> allLinks = driverFox.findElements(By.name("name"));


        for(int i = 0; i<allLinks.size();i++){
            System.out.println("The links are "+allLinks.get(i).getAttribute("value"));
        }

*/




        driverFox.close();

    }
}

