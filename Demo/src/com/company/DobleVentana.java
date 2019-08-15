package com.company;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class DobleVentana {

    public static void main(String[] args) throws InterruptedException {

        System.out.println("Abrir Automatización");
        System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/intl/es-419/gmail/about/#");
        Thread.sleep(2000);
        driver.manage().window().maximize();
        driver.findElement(org.openqa.selenium.
                By.xpath("//ul[@class='h-c-header__cta-list header__nav--ltr']//a[contains(@class,'h-c-header__nav-li-link')][contains(text(),'Acceder')]")).click();
        System.out.println(driver.getTitle());
        Set<String> ids = driver.getWindowHandles();
        Iterator<String> it = ids.iterator();
        String primeraPag = it.next();
        String segundaPag = it.next();
        driver.switchTo().window(segundaPag);
        System.out.println(driver.getTitle());
        driver.switchTo().window(primeraPag);
        System.out.println(driver.getTitle());
    }
}
