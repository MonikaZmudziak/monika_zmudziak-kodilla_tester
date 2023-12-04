package com.kodilla.selenium.allegro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class AllegroCssSelectors {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\selenium-drivers\\chrome\\chromedriver.exe");  	// [1]
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.allegro.pl/");


        WebElement alertButton = driver.findElement(By.xpath("//button[@data-testid=\"accept_home_view_action\"]"));
        alertButton.click();

        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.invisibilityOfElementLocated((By.id("#dialog-content"))));


        WebElement inputField = driver.findElement(By.cssSelector("form > input"));
        inputField.sendKeys("Mavic mini");
        inputField.submit();
        Thread.sleep(10);

        WebElement categoryCombo = driver.findElement(By.cssSelector("div > select"));
        categoryCombo.click();

        WebElement searchField = driver.findElement(By.cssSelector("button[data-role='search-button']"));;
        searchField.click();

        List<WebElement> elements = driver.findElements(By.cssSelector("section > article"));
       for (WebElement e : elements){
       System.out.println("Information about product: "+ e.getText());
       }
    }
}

