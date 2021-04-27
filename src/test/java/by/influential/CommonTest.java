package by.influential;


import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class CommonTest extends BaseTest {

    @Test
    public void SignInBookingTest() {
        driver.get("https://www.booking.com/");
        SignInBooking signInBooking = PageFactory.initElements(driver, SignInBooking.class);

        signInBooking.clickButtonSignIn();

        signInBooking.inputEmail();




        System.out.println();
    }


    @Test
    public void signUp() {

        driver.get("https://dictionary.cambridge.org/");

        //WebElement classHeader = driver.findElement(By.id("main-nav"));
        //classHeader.findElement(By.className("hdb lpt-10 lpb-10 lmr-25  vh-a ")).click();
        //  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //WebDriverWait wait = new WebDriverWait(driver, 10);

        //driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);

        //  List<WebElement> listLi = driver.findElements(By.xpath("//ul[@class='hul-u hul-u0 hax hvt tb lmb-0 lml-10']/li"));

        driver.findElement(By.xpath("//a[@href='/dictionary/']")).click();
        // driver.findElement(By.xpath("//li[@class='hdib']//a[@class='hdb lpt-10 lpb-10 lmr-25  vh-a ']")).click();

        //   driver.findElement((By.xpath("//a[@href='http://www.cambridge.org/elt/corpus/']"))).click();

        // заносим все вкладки в лист
//        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
// меняем вкладку в гугл хроме
//        driver.switchTo().window(tabs.get(1));

        // driver.findElement((By.xpath("//a[@id='choice-teacher']"))).click();

        System.out.println();

//  ps axu | grep chromedriver -  найти все процессы хромдрайвера
        // kill 4444 - убить процесс 4444

        //sendKeys - вводим строку
        driver.findElement(By.xpath("//h1[@class='fs']")).sendKeys("dfsdf");
    }

    @Test
    public void testScreenplay1() {
        driver.get("https://dictionary.cambridge.org/");
        CambridgeSite cambridgeSite = PageFactory.initElements(driver, CambridgeSite.class);
        cambridgeSite.clickButtonDictionary();
        driver.findElement(By.xpath("//h1[@class='fs']"));

        Assert.assertTrue(driver.findElement(By.xpath("//h1[@class='fs']")).getText().equals("Dictionaries"));

        System.out.println();
    }


}
