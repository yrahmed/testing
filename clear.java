package auto;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class clear { private static System system;
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver =new ChromeDriver();
        driver.get("https://bookcart.azurewebsites.net/");
        driver.manage().window().maximize();
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/app-root/div/app-home/div/div[2]/div/div[1]/app-book-card/mat-card/mat-card-content/app-addtocart/button/span[2]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/app-root/div/app-home/div/div[2]/div/div[2]/app-book-card/mat-card/mat-card-content/app-addtocart/button/span[2]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/app-root/app-nav-bar/mat-toolbar/mat-toolbar-row/div[3]/button[1]/mat-icon")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/app-root/div/app-shoppingcart/mat-card/mat-card-header/div[2]/button")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/app-root/div/app-shoppingcart/mat-card/mat-card/mat-card-content/button")).click();
        driver.quit();
}}
