package com.company;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;

public class RadioButton {

    public static void main(String[] args) throws InterruptedException {

        System.out.println("Abrir Automatización");
        System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver");
        WebDriver driver  = new ChromeDriver();
        driver.get("http://echoecho.com/htmlforms10.htm");
        Thread.sleep(5000);
        //driver.findElement(By.xpath("//input[@value='Milk']")).click();
        driver.manage().window().maximize();
        int count = driver.findElements(By.xpath("//input[@name='group1']")).size();
        System.out.println(driver.findElements(By.xpath("//input[@name='group1']")).size());
        Thread.sleep(1000);
        for (int i = 0; i<count; i++) {
            driver.findElements(By.xpath("//input[@name='group1']")).get(i).click();
            String text = driver.findElements(By.xpath("//input[@name='group1']")).get(i).getAttribute("value");
            System.out.println(text);
        }
    }
}
