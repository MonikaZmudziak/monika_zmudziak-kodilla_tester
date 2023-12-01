package com.kodilla.selenium.search;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StoreSearchExample {
    public static void main(String[] args) {
        //tworzenie Selenium WebDriver i otwieramy stronę
        System.setProperty("webdriver.chrome.driver", "C:\\selenium-drivers\\chrome\\chromedriver.exe");  	// [1]
        WebDriver driver = new ChromeDriver();
        driver.get("https://kodilla.com/pl/test/store");

        //wywolywanie metody findElement(By by). Zwraca ona element typu WebElement na podstawie różnych kryteriów wyszukiwania
        WebElement inputField = driver.findElement(By.name("search")); // [4]
        //do znalezionego elementu wysyłamy zasymulowane przyciśnięcia przycisków klawiatury
        inputField.sendKeys("School");
        //wciśnięcie klawisza Enter
        //inputField.submit();

    }
}