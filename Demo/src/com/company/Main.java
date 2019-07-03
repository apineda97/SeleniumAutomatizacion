package com.company;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;

public class Main {


    public static void main(String[] args) {

        System.out.println("Abrir Automatización");
        System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver");
        WebDriver driver  = new ChromeDriver();
        driver.get("https://qa-blue.omnibnk.com/login");
        //https://www.google.com/
        //https://qa-blue.omnibnk.com/login
        System.out.println("Titulo de la pag: " + driver.getTitle());
        System.out.println("La Url es: " + driver.getCurrentUrl());
        //System.out.println("Source de la Pag: \n" + driver.getPageSource());
        /*driver.get("https://qa-blue.omnibnk.com/login");
        driver.navigate().back();
        driver.navigate().forward();
        driver.close();*/
        //driver.quit();

        driver.findElement(By.id("login_email")).sendKeys("financial_executive_1@omnibnk.com");

        //driver.close();

    }
}

