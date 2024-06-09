package Suite1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class Jenkins1Test {
    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        driver.get("https://www.google.com.eg/");
    }

    @Test
    public void test1() {
        assertTrue(driver.getTitle().contains("Google"), "The Website doesn't Load Successfully");
        System.out.println("Google Website Test Success");

    }

    @AfterMethod
    public void tireDown() {
        driver.quit();
    }

}
