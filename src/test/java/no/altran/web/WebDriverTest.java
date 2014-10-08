package no.altran.web;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import java.net.MalformedURLException;
import static org.junit.Assert.assertEquals;

public class WebDriverTest {
    @Test
    public void run() throws MalformedURLException {
        // Create a new instance of the html unit driver
        // Notice that the remainder of the code relies on the interface,
        // not the implementation.
        WebDriver driver = new HtmlUnitDriver();
        //WebDriver driver = new ChromeDriver(DesiredCapabilities.chrome());

        // And now use this to visit Google
        driver.get("http://localhost:9996/useradmin/");



        // Find the text input element by its name
        driver.findElement(By.id("user_session_login")).sendKeys("admin");
        driver.findElement(By.id("user_session_password")).sendKeys("admin");
        driver.findElement(By.name("commit")).click();


        // Check the title of the page
        assertEquals("jalla", driver.getTitle());

        /*
        while (System.currentTimeMillis() < end) {
            WebElement resultsDiv = driver.findElement(By.className("gssb_e"));

            // If results have been returned, the results are displayed in a drop down.
            if (resultsDiv.isDisplayed()) {
              break;
            }
        }

         */

        driver.quit();
    }
}