package selenium_java_automation_tasks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


class AppTest {
    static WebDriver driver;

    public AppTest()
    {
        System.out.println("Constructor: TestCases");
        WebDriverManager.chromedriver().timeout(30).setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    public void endTest()
    {
        System.out.println("End Test: TestCases");
        driver.close();
        driver.quit();
    }

    @Test
    public static void Task_1_List_ProductTitles() throws InterruptedException{

        Task_1 task_1 = new Task_1(driver);

        task_1.navigateToAmazonPage();

        task_1.amazonSearch("mobiles");

         task_1.listProductTitles();
    }

    public static void main(String[] args) throws InterruptedException {

        Task_1_List_ProductTitles();
    }
}