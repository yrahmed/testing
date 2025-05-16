package auto;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.sql.Driver;
import java.time.Duration;
import java.util.Optional;
public class web2 {
    private static System system;
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://bookcart.azurewebsites.net/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("/html/body/app-root/app-nav-bar/mat-toolbar/mat-toolbar-row/div[3]/button[2]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/app-root/div/app-login/div/mat-card/mat-card-header/div[2]/button")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"mat-input-2\"]")).sendKeys("yara");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"mat-input-3\"]")).sendKeys("ahmed");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"mat-input-4\"]")).sendKeys("yara164");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"mat-input-5\"]")).sendKeys("Qwertyuiop11");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"mat-input-6\"]")).sendKeys("Qwertyuiop11");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"mat-radio-1-input\"]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/app-root/div/app-user-registration/div/mat-card/mat-card-content/form/mat-card-actions/button/span[2]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"mat-input-7\"]")).sendKeys("yara164");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"mat-input-8\"] ")).sendKeys("Qwertyuiop11");
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("body > app-root > div > app-login > div > mat-card > mat-card-content > form > mat-card-actions > button")).click();
        Thread.sleep(6000);
        // Check Login Success
         WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        try {
            WebElement userIcon = wait.until(ExpectedConditions.visibilityOfElementLocated(
                    By.xpath("/html/body/app-root/app-nav-bar/mat-toolbar/mat-toolbar-row/div[3]/a[1]/span[2]/span")));
            String actualUsername = userIcon.getText();
            if (actualUsername != null && !actualUsername.isEmpty()) {
                System.out.println("✅ تم تسجيل الدخول بنجاح واسم المستخدم ظهر: " + actualUsername);
            } else {
                System.out.println("❌ تم تسجيل الدخول، لكن اسم المستخدم لم يظهر.");
            }
        } finally {
        }
        driver.quit();
    }}










