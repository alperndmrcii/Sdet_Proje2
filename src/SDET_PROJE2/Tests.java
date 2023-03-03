package SDET_PROJE2;
import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Tests extends BaseDriver {

    @Test
    public void Test1() {

        driver.get("https://demowebshop.tricentis.com/");
        WebElement register= driver.findElement(By.xpath("//a[text()='Register']"));
        Actions aksiyonlar=new Actions(driver);

        Action aksiyon=aksiyonlar.moveToElement(register).click().build();
        aksiyon.perform();
        MyFunc.Bekle(2);
        WebElement gender= driver.findElement(By.xpath("//input[@id='gender-female']"));
        aksiyon=aksiyonlar.moveToElement(gender).click().build();
        aksiyon.perform();

        MyFunc.Bekle(2);

        WebElement firstname= driver.findElement(By.xpath("//input[@id='FirstName']"));
        aksiyon=aksiyonlar.moveToElement(firstname).click().sendKeys("Alperen").build();
        aksiyon.perform();
        MyFunc.Bekle(2);

        WebElement lastnname= driver.findElement(By.xpath("//input[@id='LastName']"));
        aksiyon=aksiyonlar.moveToElement(lastnname).click().sendKeys("Demirci").build();
        aksiyon.perform();

        WebElement email= driver.findElement(By.xpath("//input[@id='Email']"));
        aksiyon=aksiyonlar.moveToElement(email).click().sendKeys("alperndemirciii@gmail.com").build();
        aksiyon.perform();

        WebElement password=driver.findElement(By.xpath("//input[@id='Password']"));
        aksiyon=aksiyonlar.moveToElement(password).click().sendKeys("asdasd123").build();
        aksiyon.perform();

        WebElement confirmpass=driver.findElement(By.xpath("//input[@id='ConfirmPassword']"));
        aksiyon=aksiyonlar.moveToElement(confirmpass).click().sendKeys("asdasd123").build();
        aksiyon.perform();

        WebElement registerbtn=driver.findElement(By.xpath("//input[@id='register-button']"));
        aksiyon=aksiyonlar.moveToElement(registerbtn).click().build();
        aksiyon.perform();


        WebElement success=driver.findElement(By.xpath("//*[@class='result']"));
        Assert.assertTrue("Başarılı",success.isDisplayed());


    }
    @Test public void Test2(){


        driver.get("https://demowebshop.tricentis.com/");
        WebElement register= driver.findElement(By.xpath("//a[text()='Register']"));
        Actions aksiyonlar=new Actions(driver);

        Action aksiyon=aksiyonlar.moveToElement(register).click().build();
        aksiyon.perform();
        MyFunc.Bekle(2);
        WebElement gender= driver.findElement(By.xpath("//input[@id='gender-female']"));
        aksiyon=aksiyonlar.moveToElement(gender).click().build();
        aksiyon.perform();

        MyFunc.Bekle(2);

        WebElement firstname= driver.findElement(By.xpath("//input[@id='FirstName']"));
        aksiyon=aksiyonlar.moveToElement(firstname).click().sendKeys("Alperen").build();
        aksiyon.perform();
        MyFunc.Bekle(2);

        WebElement lastnname= driver.findElement(By.xpath("//input[@id='LastName']"));
        aksiyon=aksiyonlar.moveToElement(lastnname).click().sendKeys("Demirci").build();
        aksiyon.perform();

        WebElement email= driver.findElement(By.xpath("//input[@id='Email']"));
        aksiyon=aksiyonlar.moveToElement(email).click().sendKeys("alperndemirciii@gmail.com").build();
        aksiyon.perform();

        WebElement password=driver.findElement(By.xpath("//input[@id='Password']"));
        aksiyon=aksiyonlar.moveToElement(password).click().sendKeys("asdasd123").build();
        aksiyon.perform();

        WebElement confirmpass=driver.findElement(By.xpath("//input[@id='ConfirmPassword']"));
        aksiyon=aksiyonlar.moveToElement(confirmpass).click().sendKeys("asdasd123").build();
        aksiyon.perform();

        WebElement registerbtn=driver.findElement(By.xpath("//input[@id='register-button']"));
        aksiyon=aksiyonlar.moveToElement(registerbtn).click().build();
        aksiyon.perform();

        WebElement error=driver.findElement(By.xpath("//div[@class='validation-summary-errors']"));
        Assert.assertTrue("Bu mail zaten var",error.getText().contains("The specified email already exists"));
    }
}
