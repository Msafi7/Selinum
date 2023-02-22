import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate {
    public static void main(String[] args) throws InterruptedException {


        //connect to webdriver.

        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        // need to call the method.
        //intitiate the instance of web driver
        WebDriver driver=new ChromeDriver();

        //open google.com
        driver.get("https://www.google.com/");
        //now Navigate to facebook.com
        driver.navigate().to("https://www.facebook.com/");
        // slow down
        Thread.sleep(2000);

    // go back

        driver.navigate().back();
        //slow down
        Thread.sleep(2000);
        // go to facebook
        driver.navigate().forward();
        Thread.sleep(2000);

        //refresh the page
        driver.navigate().forward();
        Thread.sleep(2000);





    }
}
