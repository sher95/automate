import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.chrome.ChromeDriver;

public class automate {

    public static void main(String[] args) throws InterruptedException {


        String picture = "C:\\Users\\Frank\\Desktop\\20200923_134105.jpg";
        //To run chrome driver
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Frank\\Desktop\\chromedriver.exe");
        //For use opened chrome  in localhost
        ChromeOptions options = new ChromeOptions();
        options.setExperimentalOption("debuggerAddress", "localhost:9014");

        //creating object for web
        WebDriver driver = new ChromeDriver(options);
        driver.findElement(By.xpath("//*[@id='app']/div/main/div/div[3]/div/div[1]/div/div/div[1]/div[2]/a/div")).click();


        driver.findElement(By.xpath("//*[@id=\'app\']/div/main/div/div[3]/div/div[1]/div/div[1]/div[2]/div/div/div[9]/div/div[1]")).click();

        driver.findElement(By.xpath("//*[@id=\'app\']/div/main/div/div[3]/div/div[1]/div/div[1]/div[2]/div/div/div[1]/div/div[5]")).click();

        driver.findElement(By.cssSelector("#app > div > main > div > div.container.d-block.white.container--fluid.fill-height.grid-list-md > div > div:nth-child(1) > div > div:nth-child(1) > div.col-sm-12.col-md-6.col-lg-6.col-xl-4.col > div > div > div:nth-child(2) > div > div:nth-child(3)")).click();

        driver.findElement(By.xpath("//*[@id=\'app\']/div[3]/div/div/div[1]/div/span[4]")).click();

        //Uploading pictures
        WebElement upload1 = driver.findElement(By.cssSelector("#app > div.v-application--wrap > main > div > div.container.d-block.white.container--fluid.fill-height.grid-list-md > div > div:nth-child(1) > div > div:nth-child(1) > div.col-sm-12.col-md-6.col-lg-6.col-xl-4.col > div > div > div:nth-child(4) > div > div.container > div > div.one > label.field__file-wrapper > div"));
        upload1.sendKeys(picture);

        WebElement upload2 = driver.findElement(By.xpath("//*[@id=\'app\']/div[1]/main/div/div[3]/div/div[1]/div/div[1]/div[2]/div/div/div[4]/div/div[3]/div/div[1]/label[2]/div"));
        upload2.sendKeys("C:\\Users\\Frank\\Desktop\\20201209_214010.jpg");

        WebElement upload3 = driver.findElement(By.xpath("//*[@id=\'app\']/div[1]/main/div/div[3]/div/div[1]/div/div[1]/div[2]/div/div/div[4]/div/div[3]/div/div[1]/label[2]/div"));
        upload3.sendKeys("C:\\Users\\Frank\\Desktop\\20201209_213943.jpg");

        Thread.sleep(2000);
        //submit
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/main/div/div[3]/div/div[1]/div/div[1]/div[2]/div/div/div[4]/div/div[3]/div/button")).click();
        //go to bank
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/main/div/div[3]/div/div[1]/div/div[1]/div[2]/div/div/div[5]/div/div[2]")).click();
        //choose city
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/main/div/div[3]/div/div[1]/div/div[1]/div[2]/div/div/div[6]/div/div[2]/div/div[1]/div/div")).click();
        Thread.sleep(1000);

        WebElement targ =driver.findElement(By.xpath("//*[text()='Tashkent']"));
        Actions s = new Actions(driver);
        s.click(targ);
        s.build().perform();

        Thread.sleep(1000);
        driver.findElement((By.xpath("//*[@id=\"app\"]/div[1]/main/div/div[3]/div/div[1]/div/div[1]/div[2]/div/div/div[6]/div/div[2]/div/div[3]"))).click();
        Thread.sleep(1000);
        driver.findElement((By.xpath("//*[@id=\"app\"]/div[1]/main/div/div[3]/div/div[1]/div/div[1]/div[2]/div/div/div[6]/div/div[2]/div/button"))).click();
        Thread.sleep(1000);

        //sms
        WebElement sms =driver.findElement(By.cssSelector("#app > div.v-application--wrap > main > div > div.container.d-block.white.container--fluid.fill-height.grid-list-md > div > div:nth-child(1) > div > div:nth-child(1) > div.col-sm-12.col-md-6.col-lg-6.col-xl-4.col > div > div > div:nth-child(8) > div > div.container > div > span:nth-child(5) > div > div > div > div"));
        sms.sendKeys("998977318424");
        Thread.sleep(1000);

        //PIN code
        WebElement pin =driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/main/div/div[3]/div/div[1]/div/div[1]/div[2]/div/div/div[8]/div/div[2]/div/span[4]/div/div/div"));
        pin.sendKeys("1111");
        Thread.sleep(8000);
        //click submit
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/main/div/div[3]/div/div[1]/div/div[1]/div[2]/div/div/div[8]/div/div[2]/div/button")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[4]/div/div/div[1]/div[2]/button")).click();

    }
}
