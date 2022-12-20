package Day01_driverMethodlar;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_DriverMethodları {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        driver.manage().window().maximize();

        System.out.println("maximize "+driver.manage().window().getSize());

        Thread.sleep(1000);

        driver.manage().window().fullscreen();

        System.out.println("fullscreen "+driver.manage().window().getSize());

        //browser'i istediğimiz konuma getirmek
        driver.manage().window().setPosition(new Point(100,100));

        Thread.sleep(2000);

        driver.quit();
    }
}
