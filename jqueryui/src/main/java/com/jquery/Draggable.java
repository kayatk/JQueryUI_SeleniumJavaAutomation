package com.jquery;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class Draggable {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://jqueryui.com/draggable");
        Actions act = new Actions(driver);
        driver.switchTo().frame(0);
        WebElement ele = driver.findElement(By.xpath("//div[@id='draggable']"));
       // WebElement frame =driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
        
       // action.dragAndDropBy(ele, 100, 100).perform();
       act.clickAndHold(ele).moveByOffset(150, 150).release().build().perform();
       driver.quit();
    }
}
