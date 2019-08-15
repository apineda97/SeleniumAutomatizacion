package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test4 {

    public static void main(String[] args) throws InterruptedException {

        System.out.println("Abrir Automatización");
        System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://qaclickacademy.com/practice.php");
        Thread.sleep(2000);
        driver.manage().window().maximize();

        driver.findElement(By.id("checkBoxOption3")).click();
        String textCheck = driver.findElement(By.xpath("//div[@id='checkbox-example']//label[3]")).getText();
        System.out.println(textCheck);
        Select seleccionar = new Select(driver.findElement(By.id("dropdown-class-example")));
        seleccionar.selectByVisibleText(textCheck);
        driver.findElement(By.id("name")).sendKeys(textCheck);
        driver.findElement(By.id("alertbtn")).click();
        String mesajeAlerta = driver.switchTo().alert().getText();
        if (mesajeAlerta.contains(textCheck)) {
            System.out.println("Si lo contiene");
        } else {
            System.out.println("NO lo contiene");
        }
    }
}
