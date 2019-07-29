package com.company;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {

    public static void main(String[] args) throws InterruptedException {

        System.out.println("Abrir Automatización");
        System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver");
        WebDriver driver  = new ChromeDriver();
        driver.get("http://qaclickacademy.com/practice.php");
        Thread.sleep(2000);
        driver.manage().window().maximize();
        driver.findElement(By.id("checkBoxOption1")).click();
        Assert.assertTrue(driver.findElement(By.id("checkBoxOption1")).isSelected());
        if (driver.findElement(By.id("checkBoxOption1")).isSelected()) {
            System.out.println("Esta seleccionado: " + driver.findElement(By.id("checkBoxOption1")).isSelected());
        }

        Thread.sleep(2000);
        driver.findElement(By.id("checkBoxOption1")).click();
        Assert.assertFalse(driver.findElement(By.id("checkBoxOption1")).isSelected());
        if (!driver.findElement(By.id("checkBoxOption1")).isSelected()) {
            System.out.println("NO esta seleccionado: " + driver.findElement(By.id("checkBoxOption1")).isSelected());
        }

        System.out.println(driver.findElements(By.xpath("//input[@type='checkbox']")).size());

        driver.close();

        }
    }
