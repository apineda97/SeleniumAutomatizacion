package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Keys;

public class KeysQA {

    public static void main(String[] args) throws InterruptedException {

        System.out.println("Abrir Automatización");
        System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver");
        WebDriver driver  = new ChromeDriver();
        driver.get("https://www.makemytrip.com/");
        Thread.sleep(5000);
        WebElement source = driver.findElement(By.id("fromCity"));
        //source.clear();
        source.sendKeys("NUM");
        Thread.sleep(2000);
        source.sendKeys(Keys.ARROW_DOWN);
        Thread.sleep(1000);
        driver.findElement(By.xpath("//p[contains(text(),'Amsterdam, Netherlands')]")).click();
        source.sendKeys(Keys.ENTER);

        WebElement destination = driver.findElement(By.id("toCity"));
        //destination.clear();
        Thread.sleep(1000);
        destination.sendKeys("DEL");
        Thread.sleep(2000);
        destination.sendKeys(Keys.ARROW_DOWN);
        Thread.sleep(1000);
        driver.findElement(By.xpath("//p[contains(text(),'Deline, Canada')]")).click();
        destination.sendKeys(Keys.ENTER);
    }
}
