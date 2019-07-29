package com.company;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;

public class Bloqueo {

    public static void main(String[] args) throws InterruptedException {
        String bloqueado = null;
        System.out.println("Abrir Automatización");
        System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver");
        WebDriver driver  = new ChromeDriver();
        driver.get("https://www.despegar.com.co/vuelos/aerolineas");
        Thread.sleep(2000);
        driver.manage().window().maximize();
        System.out.println(driver.findElement(By.xpath("//input[@placeholder='Vuelta']")).getAttribute("disabled"));
        driver.findElement(By.xpath("//span[2]//label[1]//i[1]")).click();
        System.out.println(driver.findElement(By.xpath("//input[@placeholder='Vuelta']")).getAttribute("disabled"));
        if (driver.findElement(By.xpath("//input[@placeholder='Vuelta']")).getAttribute("disabled").contains("true")) {
            bloqueado = "true";
        }
        driver.findElement(By.xpath("//span[@class='sbox-3-radio -md sbox-radio-button']//i[@class='radio-circle sbox-radio-circle']")).click();

        if (bloqueado.equals("true")) {
            System.out.println("Esta bloqueado");
            Assert.assertTrue(true);
         } else {
            System.out.println("NO Esta bloqueado");
            Assert.assertTrue(false);
          }

        }
    }
