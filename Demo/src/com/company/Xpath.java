package com.company;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import java.util.concurrent.TimeUnit;

import static java.lang.Thread.sleep;

public class Xpath {


    public static void main(String[] args) throws InterruptedException {

        System.out.println("Abrir Automatización");

        System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver");
        WebDriver driver  = new org.openqa.selenium.chrome.ChromeDriver();

        driver.get("https://www.google.com/");
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.MINUTES);
        System.out.println("Titulo de la pag: " + driver.getTitle());
        System.out.println("La Url es: " + driver.getCurrentUrl());
        sleep(5000);
        driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Pruebas");
        System.out.println("Atributo obtenido: " + driver.findElement(By.xpath("//input[@name='q']")).getAttribute("data-ved"));
        sleep(5000);
        driver.findElement(By.xpath("//a[contains(text(),'Gmail')]")).click();
        sleep(5000);
        driver.navigate().back();
        driver.findElement(By.xpath("//input[@name='q']")).sendKeys("El tiempo");
        sleep(9000);
        driver.findElement(By.xpath(" //div[@id='lga']")).click();
        driver.findElement(By.xpath("//div[@class='FPdoLc VlcLAe']//input[@name='btnK']")).click();
        driver.findElement(By.xpath("//h3[contains(text(),'ELTIEMPO.COM: Noticias Principales de Colombia y e')]")).click();
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//div[@class='mas-secciones']")).click();
        driver.findElement(By.xpath("//a[contains(text(),'Galerías')]")).click();

        driver.get("https://zonavirtual.credivalores.com:20443/(S(ngrt51yzdv2nrcojfxoo5fjb))/Web/Registro/wfmRegistro");
        Select seleccionar = new Select(driver.findElement(By.name("ctl00$ctl00$ContentPlaceHolder1$contenidoPrincipal$ddldepartamento")));
        seleccionar.selectByValue("18");
        seleccionar.selectByVisibleText("TOLIMA");
        seleccionar.selectByIndex(2);
    }
}

