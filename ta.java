package auto;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class ta {
    private static System system;
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver =new ChromeDriver();
        driver.get("https://bookcart.azurewebsites.net/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("/html/body/app-root/div/app-home/div/div[2]/div/div[6]/app-book-card/mat-card/a/img")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/app-root/div/app-book-details/mat-card/mat-card-content/div[2]/div/app-addtocart/button/span[2]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/app-root/app-nav-bar/mat-toolbar/mat-toolbar-row/div[1]/button/span[2]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/app-root/div/app-home/div/div[2]/div/div[5]/app-book-card/mat-card/a/img")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/app-root/div/app-book-details/mat-card/mat-card-content/div[2]/div/app-addtocart/button/span[2]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/app-root/app-nav-bar/mat-toolbar/mat-toolbar-row/div[3]/button[1]/mat-icon")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/app-root/div/app-shoppingcart/mat-card/mat-card-content[1]/table/tbody/tr[1]/td[4]/div/div[3]/button/mat-icon")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/app-root/div/app-shoppingcart/mat-card/mat-card-content[1]/table/tbody/tr[2]/td[4]/div/div[3]/button/mat-icon")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("/html/body/app-root/app-nav-bar/mat-toolbar/mat-toolbar-row/div[1]/button/span[2]")).click();
        Thread.sleep(2000);
        driver.quit();
}}


