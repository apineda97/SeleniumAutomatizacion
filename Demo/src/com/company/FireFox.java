package com.company;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class FireFox {


    public static void main(String[] args) {

        System.out.println("Abrir Automatización");
        System.setProperty("webdriver.gecko.driver", "/usr/bin/geckodriver");
        WebDriver driver  = new FirefoxDriver();
        driver.get("https://www.google.com/");
        //https://www.google.com/
        //https://qa-blue.omnibnk.com/login
        System.out.print(driver.getTitle());
    }
}

