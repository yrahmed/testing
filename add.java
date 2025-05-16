package auto;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class add {
    private static System system;
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver =new ChromeDriver();
        driver.get("https://bookcart.azurewebsites.net/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("/html/body/app-root/div/app-home/div/div[1]/div/app-book-filter/mat-list/mat-list-item[1]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/app-root/div/app-home/div/div[2]/div/div[1]/app-book-card/mat-card/mat-card-content/app-addtocart/button/span[2]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/app-root/div/app-home/div/div[1]/div/app-book-filter/mat-list/mat-list-item[2]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/app-root/div/app-home/div/div[2]/div/div[2]/app-book-card/mat-card/mat-card-content/app-addtocart/button/span[2]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/app-root/div/app-home/div/div[1]/div/app-book-filter/mat-list/mat-list-item[3]/span")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/app-root/div/app-home/div/div[2]/div/div[1]/app-book-card/mat-card/mat-card-content/app-addtocart/button/span[2]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/app-root/div/app-home/div/div[1]/div/app-book-filter/mat-list/mat-list-item[4]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/app-root/div/app-home/div/div[2]/div/div[2]/app-book-card/mat-card/mat-card-content/app-addtocart/button/span[2]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/app-root/div/app-home/div/div[1]/div/app-book-filter/mat-list/mat-list-item[5]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/app-root/div/app-home/div/div[2]/div/div[2]/app-book-card/mat-card/mat-card-content/app-addtocart/button/span[2]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/app-root/div/app-home/div/div[1]/div/app-book-filter/mat-list/mat-list-item[6]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/app-root/div/app-home/div/div[2]/div/div[2]/app-book-card/mat-card/mat-card-content/app-addtocart/button/span[2]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/app-root/app-nav-bar/mat-toolbar/mat-toolbar-row/div[3]/button[1]/mat-icon")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/app-root/app-nav-bar/mat-toolbar/mat-toolbar-row/div[1]/button")).click();
        Thread.sleep(1000);
        driver.quit();
    }
}
