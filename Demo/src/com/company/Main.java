package com.company;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Main {


    public static void main(String[] args) {

        System.out.println("Abrir Automatización");
        System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver");
        WebDriver driver  = new ChromeDriver();
        driver.get("https://qa-blue.omnibnk.com/login");
        //https://www.google.com/
        //https://qa-blue.omnibnk.com/login
        System.out.print(driver.getTitle());
    }
}

