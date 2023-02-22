import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homework {

    public static void main(String[] args) {


        /*
        1. launch the browser
         2. navigate to amazon website.
        3. print out the title and the url in the console
        4. close the browser
         */

        // Navigate the web driver location

        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");

        // Creating an instance of web-driver.
        WebDriver driver=new ChromeDriver();

        //open google.com ( launcing the browser)
        driver.get("https://www.google.com/");

        // Opening the website and copying Amazon url.
        //Navaigating to Amazon
        driver.navigate().to("https://www.amazon.com/");

        // getting the title for the webpage.
        String title=driver.getTitle();
        System.out.println("The title of this website is "+ title);

        driver.close();






    }
}
