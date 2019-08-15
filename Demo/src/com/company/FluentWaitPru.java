package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import java.time.Duration;
import java.util.function.Function;

public class FluentWaitPru {

    public static void main(String[] args) throws InterruptedException {

        System.out.println("Abrir Automatización");
        System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");
        Thread.sleep(2000);
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//button[contains(text(),'Start')]")).click();

        Wait <WebDriver> wait = new FluentWait <WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(30))
                .pollingEvery(Duration.ofSeconds(3))
                .ignoring(NoSuchElementException.class);

        WebElement foo  = wait.until(new Function<WebDriver, WebElement>() {
            @Override
            public WebElement apply(WebDriver driver) {
                if (driver.findElement(By.id("finish")).isDisplayed()) {
                    return driver.findElement(By.id("finish"));
                } else {
                    return null;
                }
            }
        });
        System.out.println(driver.findElement(By.id("finish")).getText());
    }
}
