package com.company;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Test2 {

    public static void main(String[] args) throws InterruptedException {

        System.out.println("Abrir Automatización");
        System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver");
        WebDriver driver  = new ChromeDriver();
        driver.get("https://www.cleartrip.com/");
        Thread.sleep(1000);
        driver.manage().window().maximize();
        Thread.sleep(2000);
        WebElement fromCountry = driver.findElement(By.id("FromTag"));
        WebElement calendario = driver.findElement(By.id("DepartDate"));
        Select seleccionarAdultos = new Select(driver.findElement(By.id("Adults")));
        Select seleccionarNiños = new Select(driver.findElement(By.id("Childrens")));
        fromCountry.click();
        fromCountry.sendKeys("new york");
        Thread.sleep(5000);
        fromCountry.sendKeys(Keys.ARROW_DOWN);
        fromCountry.sendKeys(Keys.ENTER);
        seleccionarNiños.selectByIndex(3);
        seleccionarAdultos.selectByValue("9");
        Thread.sleep(2000);
        Thread.sleep(2000);
        calendario.click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//a[contains(text(),'15')]")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("MoreOptionsLink")).click();
        driver.findElement(By.id("AirlineAutocomplete")).sendKeys("Indigo");
        driver.findElement(By.id("SearchBtn")).sendKeys(Keys.ENTER);
        System.out.println(driver.findElement(By.id("homeErrorMessage")).getText());

        }
    }
