package com.company;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;


public class Bucle {

    public static void main(String[] args) throws InterruptedException {

        System.out.println("Abrir Automatización");
        System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver");
        WebDriver driver  = new ChromeDriver();
        System.out.print(driver.getTitle());
        driver.get("http://calculadora.name");
        Thread.sleep(2000L);
        for (int numero = 0; numero < 3; numero++) {
            driver.findElement(By.xpath("//div[contains(text(),'5')]")).click();

        }
        System.out.println(driver.findElement(By.id("input")).getSize());
    }
}
