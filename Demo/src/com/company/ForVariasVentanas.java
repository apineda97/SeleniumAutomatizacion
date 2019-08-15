package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.Iterator;
import java.util.Set;

public class ForVariasVentanas {

    public static void main(String[] args) throws InterruptedException {

        System.out.println("Abrir Automatización");
        System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://qaclickacademy.com/practice.php");
        Thread.sleep(2000);
        driver.manage().window().maximize();
        WebElement casillasDriver = driver.findElement(By.id("gf-BIG"));
        WebElement columnaDriver = casillasDriver.findElement(By.xpath("//td[1]//ul[1]"));

        for (int contador = 0; contador<columnaDriver.findElements(By.tagName("a")).size(); contador++) {
            String clickLink = Keys.chord(Keys.CONTROL, Keys.ENTER);
            columnaDriver.findElements(By.tagName("a")).get(contador).sendKeys(clickLink);
            Thread.sleep(3000);

        }
            Set<String> numeroPestañas = driver.getWindowHandles();
            Iterator<String> ite = numeroPestañas.iterator();
            while (ite.hasNext()) {
                driver.switchTo().window(ite.next());
                System.out.println(driver.getTitle());
            }
    }
}
