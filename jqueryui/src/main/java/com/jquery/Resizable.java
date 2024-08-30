package com.jquery;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Resizable {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window();
        driver.get("https://jqueryui.com/resizable/");
        driver.switchTo().frame(0);

        driver.quit();
    }
}
