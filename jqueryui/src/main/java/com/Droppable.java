package com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Droppable {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window();
        driver.get("https://jqueryui.com/droppable/");
        driver.switchTo().frame(0);

        WebElement ele = driver.findElement(By.id("draggable"));
        WebElement destination = driver.findElement(By.id("droppable"));
        Actions action = new Actions(driver);
        action.dragAndDrop(ele, destination);
        driver.quit();
        
    }
}
