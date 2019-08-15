package com.company;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import java.util.List;

public class FechasFor {

    public static void main(String[] args) throws InterruptedException {

        System.out.println("Abrir Automatización");
        System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.path2usa.com/travel-companions");
        Thread.sleep(2000);
        driver.manage().window().maximize();

        driver.findElement(By.id("travel_date")).click();


        while(driver.findElement(By.cssSelector("[class='datepicker-days'] [class='datepicker-switch']")).getText().contains("November")) {
            driver.findElement(By.cssSelector("[class='datepicker-days'] th[class='next']")).click();
            break;
        }

        List<WebElement> fechas = driver.findElements(By.className("day"));
        int totalDias = driver.findElements(By.className("day")).size();
        for (int contador = 0; contador < totalDias; contador++) {
            String dia = driver.findElements(By.className("day")).get(contador).getText();
            if (dia.equalsIgnoreCase("25")) {
                driver.findElements(By.className("day")).get(contador).click();
                break;
            }
        }
    }
}
