package Search_test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
 public class Search
 {

     public static void main(String [] args) throws InterruptedException {
         WebDriverManager.chromedriver().setup();
         WebDriver driver = new ChromeDriver();
         driver.get("https://www.google.com/");
         driver.manage().window().maximize();
         Thread.sleep(2000);
         driver.findElement(By.id("input")).sendKeys("java");
         Thread.sleep(10000);
         List<WebElement> list = driver.findElements(By.xpath("//ul[@role='listbox']//li/descendant::div[@class='sbl1']"));
         System.out.println(list.size());

     }


 }