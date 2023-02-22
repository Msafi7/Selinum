import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {
    public static void main(String[] args) throws InterruptedException {

        // tell your project where the webdriver is located.
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");

        // creating an instance of webdriver.


        WebDriver driver=new ChromeDriver();
        //open the website facebook.com, we copy the Url and past it in code.
        driver.get("https://www.facebook.com/");
        // get the current url that is there in the browser.
        String URL = driver.getCurrentUrl();
        // priny out the url
        System.out.println(URL);

        // get the title fo the webpage.
        String title=driver.getTitle();
        System.out.println("The title of this page is "+ title);


        // to slow down for 3000.
        Thread.sleep(3000);
         //closing browser
        driver.quit();





    }
}
