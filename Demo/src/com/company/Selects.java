package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class Selects {


    public static void main(String[] args) throws InterruptedException {

        System.out.println("Abrir Automatización");

        System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver");
        WebDriver driver  = new org.openqa.selenium.chrome.ChromeDriver();
        driver.get("https://zonavirtual.credivalores.com:20443/(S(ngrt51yzdv2nrcojfxoo5fjb))/Web/Registro/wfmRegistro");
        org.openqa.selenium.JavascriptExecutor js = (org.openqa.selenium.JavascriptExecutor) driver;
        Thread.sleep(5000L);
        driver.manage().window().maximize();
        js.executeScript("window.scrollBy(0,800)");
        Select seleccionar = new Select(driver.findElement(By.name("ctl00$ctl00$ContentPlaceHolder1$contenidoPrincipal$ddldepartamento")));
        seleccionar.selectByValue("18");
        Thread.sleep(5000L);
        js.executeScript("window.scrollBy(0,800)");
        seleccionar.selectByValue("19");
        //seleccionar.selectByVisibleText("TOLIMA");
        //Thread.sleep(20000);
        //seleccionar.selectByIndex(2);
    }
}

