//package com.kodilla.selenium.login;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeOptions;
//
//public class LoginTestingApp {
//    public static void main(String[] args) {
//        System.setProperty("webdriver.chrome.driver", "C:\\selenium-drivers\\chrome\\chromedriver.exe");
//        ChromeOptions.chromeOptions = new ChromeOptions();
//        chromeOptions.addArguments("--remonte-allow-origins=*");
//        WebDriver driver = new ChromeDriver();
//        driver.get("https://kodilla.com/pl/test/login/");
//
//        WebElement emailField = driver.findElement(By.xpath("//html/body/section/form/div[1]/input"));
//        emailField.sendKeys("testuser@gmail.com");
//        WebElement passwordField = driver.findElement(By.name("//html/body/section/form/div[2]/input"));
//        emailField.sendKeys("Haslo");
//
//
//    }
//}
