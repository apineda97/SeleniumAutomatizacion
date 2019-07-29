package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Alertas {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.gecko.driver", "/usr/bin/geckodriver");
        WebDriver driver  = new FirefoxDriver();
        driver.get("http://www.tizag.com/javascriptT/javascriptalert.php");
        Thread.sleep(1000);
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//div[@class='display']//form//input")).click();
        System.out.println(driver.switchTo().alert().getText());
        Thread.sleep(1000);
        driver.switchTo().alert().accept();
    }
}
