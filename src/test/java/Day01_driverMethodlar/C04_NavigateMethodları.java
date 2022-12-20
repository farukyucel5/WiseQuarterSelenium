package Day01_driverMethodlar;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C04_NavigateMethodları {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/drivers/chromedriver.exe");

        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        driver.navigate().to("https://www.amazon.com");
        driver.get("https://www.wisequarter.com");

        //yeniden amazona gidiyoruz

        driver.navigate().back();

        //tekrar wisequarter

        driver.navigate().forward();


        Thread.sleep(3000);
        driver.quit();
    }
}
