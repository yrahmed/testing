package auto;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class search {
    private static System system;
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver =new ChromeDriver();
        driver.get("https://bookcart.azurewebsites.net/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("/html/body/app-root/app-nav-bar/mat-toolbar/mat-toolbar-row/div[2]/app-search/form/input")).sendKeys("harry");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"mat-option-0\"]/span")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/app-root/div/app-home/div/div[2]/div/div/app-book-card/mat-card/mat-card-content/app-addtocart/button/span[2]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/app-root/app-nav-bar/mat-toolbar/mat-toolbar-row/div[3]/button[1]/mat-icon")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/app-root/div/app-shoppingcart/mat-card/mat-card-header/div[2]/button/span[2]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/app-root/div/app-shoppingcart/mat-card/mat-card/mat-card-content/button/span[2]")).click();
        Thread.sleep(1000);
        driver.quit();
}}
