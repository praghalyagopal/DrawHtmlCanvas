import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class DrawhtmlCanvas {
    public static String lineTool ="//input[@class='button line']";
    public static  String canvas ="//*[@id=\"imageTemp\"]";


    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","/Users/dinesh/Downloads/chromedriver");
        WebDriver driver = new ChromeDriver();
        String url = "http://www.htmlcanvasstudio.com/";
        driver.get(url);
        selectLine(driver);
        drawHorizantalLine(driver);
        drawVerticalLine(driver);
        drawRectangle(driver);
        selectEraser(driver);
        useEraser(driver);
    }


    public static void selectLine(WebDriver driver)
    {
        driver.findElement(By.className("button line")).click();
    }
    
    public static void selectRectangle(WebDriver driver)
    {
        driver.findElement(By.className("button rectangle")).click();
    }

    public static void selectEraser(WebDriver driver)
    {
        driver.findElement(By.className("button eraser")).click();
    }

    public static void drawHorizantalLine(WebDriver driver)
    {
        WebElement element = driver.findElement(By.xpath(canvas));
        Actions builder = new Actions(driver);
        Action drawAction = builder.moveToElement(element,225,69)
                .click()
                .moveByOffset(223, 117)
                .doubleClick()
                .build();
        drawAction.perform();
    }

    public static void drawVerticalLine(WebDriver driver)
    {
        WebElement element = driver.findElement(By.xpath(canvas));
        Actions builder = new Actions(driver);
        Action drawAction = builder.moveToElement(element,162,124)
                .click()
                .moveByOffset(304, 122)
                .doubleClick()
                .build();
        drawAction.perform();
    }

    public static void drawRectangle(WebDriver driver)
    {
        WebElement element = driver.findElement(By.xpath(canvas));

        Actions builder = new Actions(driver);
        Action drawAction = builder.moveToElement(element,124,248)
                .click()
                .moveByOffset(382, 365)
                .doubleClick()
                .build();
        drawAction.perform();
    }
    public static void useEraser(WebDriver driver)
    {
        WebElement element = driver.findElement(By.xpath(canvas));
        Actions builder = new Actions(driver);
        Action drawAction = builder.moveToElement(element,225,69)
                .click()
                .moveByOffset(223, 117)
                .doubleClick()
                .build();
        drawAction.perform();
    }
}
