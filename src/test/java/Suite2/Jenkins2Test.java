package Suite2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class Jenkins2Test {
    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        driver.get("https://www.youtube.com/");
    }

    @Test
    public void test1() {
        assertTrue(driver.getTitle().contains("YouTube"), "The Website doesn't Load Successfully");
        System.out.println("Youtube Website Test Success");
    }

    @AfterMethod
    public void tireDown() {
        driver.quit();
    }

}
