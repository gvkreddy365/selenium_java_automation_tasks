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

    
    public static void Task_1_List_ProductTitles() throws InterruptedException{

        Task_1 task_1 = new Task_1(driver);

        task_1.navigateToAmazonPage();

        task_1.amazonSearch("mobiles");

        task_1.listProductTitles();
    }

    
    public static void Task_2_product_search_using_contains() throws InterruptedException{

        Task_2 task_2 = new Task_2(driver);

        task_2.navigateToAmazonPage();

        task_2.amazonSearch("iphone");

        task_2.product_search_using_contains();
    }


    @Test
    public static void Task_3_print_GoogleNews_Headlines() throws InterruptedException{

        Task_3 task_3 = new Task_3(driver);

        task_3.navigateToGoogleNews();

        task_3.printGoogleNewsIndia();

        task_3.printGoogleNewsWorld();
        
    }

    public static void main(String[] args) throws InterruptedException {

        Task_1_List_ProductTitles();

        Task_2_product_search_using_contains();

        Task_3_print_GoogleNews_Headlines();
    }
}