package com.company;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

public class ScreenShot {

    @Test (timeOut = 4000, enabled = false)
    public static void main(String[] args) throws InterruptedException, IOException {
        System.out.println("Abrir Automatización");
        System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver");
        WebDriver driver = new ChromeDriver();
        Thread.sleep(1000);
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.get("https://www.google.com/");

        File screen = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(screen, new File("/home/apineda/Escritorio/pantallaPrueba.png"));
    }

    @Test(priority = 1, enabled = true)
    public void test01 () throws InterruptedException, IOException {
        System.out.println("Abrir Automatización");
        System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver");
        WebDriver driver = new ChromeDriver();
        Thread.sleep(1000);
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.get("https://www.google.com/");
        File screen = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(screen, new File("/home/apineda/Escritorio/pantallaPrueba.png"));
        System.out.println("Prueba ok");
    }

    @BeforeMethod
    public void test02 () throws InterruptedException {
        System.out.println("Abrir Automatización");
        System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://qaclickacademy.com/practice.php");
        Thread.sleep(2000);
        driver.manage().window().maximize();

        driver.findElement(org.openqa.selenium.By.id("checkBoxOption3")).click();
        String textCheck = driver.findElement(org.openqa.selenium.By.xpath("//div[@id='checkbox-example']//label[3]")).getText();
        System.out.println(textCheck);
        org.openqa.selenium.support.ui.Select seleccionar = new org.openqa.selenium.support.ui.Select(driver.findElement(org.openqa.selenium.By.id("dropdown-class-example")));
        seleccionar.selectByVisibleText(textCheck);
        driver.findElement(org.openqa.selenium.By.id("name")).sendKeys(textCheck);
        driver.findElement(org.openqa.selenium.By.id("alertbtn")).click();
        String mesajeAlerta = driver.switchTo().alert().getText();
        if (mesajeAlerta.contains(textCheck)) {
            System.out.println("Si lo contiene");
        } else {
            System.out.println("NO lo contiene");
        }
    }
}

