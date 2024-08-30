package com.jquery;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Resizable {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://jqueryui.com/resizable/");
        driver.switchTo().frame(0);

        WebElement element=driver.findElement(By.xpath("//div[contains(@class,' ui-icon-gripsmall-diagonal-se')]"));
       
        Actions act = new Actions(driver);
        act.clickAndHold(element)
        .moveByOffset(100, 100)
        .release(element)
        .build();
        act.perform();
       // act.dragAndDropBy(element,200,200).build().perform();

        driver.quit();
    }
}
