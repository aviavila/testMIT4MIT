import com.aventstack.extentreports.ExtentReporter;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;

public class TESTCASE {
    public static WebDriver driver;
    private ExtentReporter reporterType;
    ExtentSparkReporter spark = new ExtentSparkReporter("MIT4MITstr.html");
    ExtentReports extent = new ExtentReports();

    @BeforeAll

    static void setUpBeforeClass() throws Exception {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\AVI\\Desktop\\אוטומציה 210120\\tigbur2\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        Thread.sleep(3000);

    }

    @AfterAll
    static void tearDownAfterClass() throws Exception {
        ExtentReports extent = new ExtentReports();
        extent.flush();
        Thread.sleep(5000);
        driver.quit();


    }

    @Test
    void testUpToolBar() throws InterruptedException, IOException {
        extent.attachReporter(spark);
        ExtentTest test = extent.createTest("testUpToolBar");
        driver.get("https://www.mit4mit.co.il/");
        Thread.sleep(5000);
        driver.findElement(By.xpath("/html/body/div[2]/a[1]/img\n")).click();
        boolean a = driver.getPageSource().contains("https://www.mit4mit.co.il/");
        if (a) {

            System.out.println("yes");
        }
        else   {
            System.out.println("no");
        }

        ExtentTest node = test.createNode("logo mit4mit");
        node.pass("Pass");
        driver.findElement(By.xpath("/html/body/div[17]/a[4]/div/svg\n")).click();
        boolean b = driver.getPageSource().contains("https://www.mit4mit.co.il/cats/");
        if (b) {

            System.out.println("yes");
        }
        else   {
            System.out.println("no");
        }
        driver.findElement(By.xpath("/html/body/div[17]/a[3]/div/svg\n")).click();
        boolean c = driver.getPageSource().contains("https://www.mit4mit.co.il/campaigns/");
        if (c) {

            System.out.println("yes");
        }
        else   {
            System.out.println("no");
        }
        driver.findElement(By.xpath("/html/body/div[17]/a[2]/div/svg\n")).click();
        boolean d = driver.getPageSource().contains("https://www.mit4mit.co.il/blog/");
        if (d) {

            System.out.println("yes");
        }
        else   {
            System.out.println("no");
        }
        driver.findElement(By.xpath("/html/body/div[17]/a[1]/div/svg\n")).click();



    }

    @Test
    void testWelcomePage() throws InterruptedException {

        driver.get("https://www.mit4mit.co.il/");
        Thread.sleep(5000);

    }

    @Test
    void testRightToolBar() throws InterruptedException {

        driver.get("https://www.mit4mit.co.il/");
        Thread.sleep(5000);

    }

    @Test
    void testServiceProvider() throws InterruptedException {

        driver.get("https://www.mit4mit.co.il/");
        Thread.sleep(5000);

    }

    @Test
    void testServiceProviderUpToolBar() throws InterruptedException {

        driver.get("https://www.mit4mit.co.il/");
        Thread.sleep(5000);

    }

    @Test
    void testBenefitsAndPromotions() throws InterruptedException {

        driver.get("https://www.mit4mit.co.il/");
        Thread.sleep(5000);

    }

    @Test
    void testInspirePage() throws InterruptedException {

        driver.get("https://www.mit4mit.co.il/");
        Thread.sleep(5000);

    }

    @Test
    void testServicePage() throws InterruptedException {

        driver.get("https://www.mit4mit.co.il/");
        Thread.sleep(5000);

    }

    @Test
    void testsigninPage() throws InterruptedException {

        driver.get("https://www.mit4mit.co.il/");
        Thread.sleep(5000);

    }

    @Test
    void testBottomToolBarPage() throws InterruptedException {

        driver.get("https://www.mit4mit.co.il/");
        Thread.sleep(5000);

    }

    @Test
    void testWebPlannerPage() throws InterruptedException {

        driver.get("https://www.mit4mit.co.il/");
        Thread.sleep(5000);

    }

    @Test
    void testAccessibilityPage() throws InterruptedException {

        driver.get("https://www.mit4mit.co.il/");
        Thread.sleep(5000);

    }


}
