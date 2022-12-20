package Day01_driverMethodlar;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C03_DriverMethodları {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/drivers/chromedriver.exe");

        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.amazon.com.tr/ref=nav_logo");

        String pageSource=driver.getPageSource();

        String expectedWord="MEOW";

        if(pageSource.contains(expectedWord))
            System.out.println("passed");
        else
            System.out.println("failed");
    }
}
