package Day01_driverMethodlar;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_driver_get {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/drivers/chromedriver.exe");

        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.amazon.com");

        String actualResult=driver.getTitle();

        if (actualResult.contains("amazon"))
        {
            System.out.println("test passed");
        }else
        {
            System.out.println("title does not contain the word Amazon ");
            System.out.println(driver.getTitle());
        }




        Thread.sleep(2000);



        driver.close();
    }
}
