package GithubLogin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class GithubLoginTests {

    private WebDriver driver;
    public void setUp() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver = new ChromeDriver();
        //fetch URL to automate
        driver.get("https://github.com/login");
        Thread.sleep(5000);

        // maximize ta page of your browser while page loads
        driver.manage().window().maximize();

        // get page title
        System.out.println(driver.getTitle());

        // make page wait while url fully loads
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.findElement(By.id("login_field")).sendKeys("Gb-opeyemi");
        driver.findElement(By.id("password")).sendKeys("Opeyemi@99");
        driver.findElement(By.name("commit")).click();
    }
    public static void main(String args[]) throws InterruptedException {
        GithubLoginTests test = new GithubLoginTests();
        test.setUp();
    }


}
