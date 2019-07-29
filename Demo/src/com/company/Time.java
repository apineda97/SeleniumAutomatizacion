package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.Keys;

public class Time {

    public static void main(String[] args) throws InterruptedException {

        System.out.println("Abrir Automatización");
        System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://qaclickacademy.com/practice.php");
        Thread.sleep(2000);
        driver.manage().window().maximize();
        driver.findElement(By.id("mousehover")).click();
        driver.findElement(By.id("mousehover")).sendKeys(Keys.ARROW_DOWN);
        driver.findElement(By.id("mousehover")).sendKeys(Keys.ARROW_DOWN);
        driver.findElement(By.id("mousehover")).sendKeys(Keys.ENTER);
        WebDriverWait waitDrive = new WebDriverWait(driver, 20);
        waitDrive.until(ExpectedConditions.visibilityOfElementLocated(By.id("alertbtn")));
        driver.findElement(By.id("alertbtn")).click();
    }
}
