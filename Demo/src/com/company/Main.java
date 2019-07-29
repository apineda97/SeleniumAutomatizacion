package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class Main{


    public static void main(String[] args) {



        System.out.println("Abrir Automatización");
        System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver");
        WebDriver driver  = new ChromeDriver();
        driver.get("https://qa-blue.omnibnk.com/login");
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
        //https://www.google.com/
        //https://qa-blue.omnibnk.com/login
        System.out.println("Titulo de la pag: " + driver.getTitle());
        System.out.println("La Url es: " + driver.getCurrentUrl());
        //System.out.println("Source de la Pag: \n" + driver.getPageSource());
        /*driver.get("https://qa-blue.omnibnk.com/login");
        driver.navigate().back();
        driver.navigate().forward();      //*[@id="login_login"]
        driver.close();*/
        //driver.quit();

        driver.findElement(By.xpath("//*[@id='login_email']")).sendKeys("financial_executive_1@omnibnk.com");
        driver.findElement((By.xpath("//input[@id='login_password']"))).sendKeys("Poral1.");
        driver.findElement(By.linkText("¿Olvidaste tu contraseña?")).click();
        driver.navigate().back();
        driver.findElement(By.id("login_email")).sendKeys("financial_executive_1@omnibnk.com");
        driver.findElement(By.id("login_password")).sendKeys("Portal1.");
        driver.findElement(By.xpath("//*[@id=\"login_login\"]")).click();
        driver.findElement(By.xpath("")).click();


        //driver.findElement(By.linkText("Ejecutivos")).click();
    }
}

