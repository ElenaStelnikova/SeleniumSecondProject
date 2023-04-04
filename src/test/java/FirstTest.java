import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FirstTest {

    @Test
    public void secondTest() throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://askomdch.com/");
        Thread.sleep(1000);
        Assert.assertEquals(driver.getTitle(), "AskOmDch – Become a Selenium automation expert!");
        driver.findElement(By.xpath("//a[@href='/store']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//a[@href='?add-to-cart=1215']")).click();
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("a.cart-container")).click();
        Thread.sleep(1000);
        String productValidation = driver.findElement(By.xpath("//td[@class='product-name']")).getText();
        Assert.assertEquals(productValidation, "Blue Shoes");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//a[@href='https://askomdch.com/checkout/']")).click();

        WebElement firstName = driver.findElement(By.xpath("//input[@name='billing_first_name']"));
        firstName.sendKeys("Sam");
        Thread.sleep(1000);

        WebElement lastName = driver.findElement(By.xpath("//input[@name='billing_last_name']"));
        lastName.sendKeys("Smith");
        Thread.sleep(1000);

        WebElement streetAddress = driver.findElement(By.xpath("//input[@name='billing_address_1']"));
        streetAddress.sendKeys("1200 Washington street");
        Thread.sleep(1000);

        WebElement city = driver.findElement(By.xpath("//input[@name='billing_city']"));
        city.sendKeys("Los Angeles");
        Thread.sleep(1000);

        WebElement zipCode = driver.findElement(By.xpath("//input[@name='billing_postcode']"));
        zipCode.sendKeys("90111");
        Thread.sleep(1000);

        WebElement phone = driver.findElement(By.xpath("//input[@name='billing_phone']"));
        phone.sendKeys("333 555 66 77");

        WebElement email = driver.findElement(By.xpath("//input[@name='billing_email']"));
        email.sendKeys("samsmith@gmail.com");
        Thread.sleep(1000);

        driver.findElement(By.xpath("//button[@name='woocommerce_checkout_place_order']")).click();


        Thread.sleep(3000);
        driver.quit();
    }

    @Test
    public void firstTest() throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com/");
        Thread.sleep(1000);
        WebElement element = driver.findElement(By.xpath("//input[@name='q']"));
        element.sendKeys("Selenium");
        Thread.sleep(3000);
        driver.findElement(By.cssSelector("input.gNO89b")).click();
        Thread.sleep(3000);
        driver.quit();

    }
}
