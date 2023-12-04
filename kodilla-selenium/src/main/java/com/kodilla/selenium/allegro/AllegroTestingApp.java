package com.kodilla.selenium.allegro;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
 import org.openqa.selenium.support.ui.Select;

public class AllegroTestingApp {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\selenium-drivers\\chrome\\chromedriver.exe");  	// [1]
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.allegro.pl/");


        WebElement alertButton = driver.findElement(By.xpath("//button[@data-testid=\"accept_home_view_action\"]"));
        alertButton.click();

        WebElement inputField = driver.findElement(By.xpath("//input[@class=\"m7er_k4 mgn2_14 mp0t_0a m0qj_5r m9tr_5r mli8_k4 mx7m_1 m911_co mnyp_co mdwl_co mlkp_6x mefy_5r mm2b_0 mldj_0 mtag_2 msbw_2 msts_pt mgmw_wo mr3m_1 mli2_1 mh85_0 mjyo_6x mse2_40 mqu1_40 mp4t_0 m3h2_0 mryx_0 munh_0 mvrt_8 mg9e_0 mj7a_0 mh36_0 _535b5_Sviv7\" and @name=\"string\"]"));
        inputField.sendKeys("Mavic mini");
        inputField.submit();

        WebElement categoryCombo = driver.findElement(By.xpath("//option[@class=\"mgmw_wo\" and @value=\"/kategoria/elektronika\"]"));
        categoryCombo.click();

        WebElement searchField = driver.findElement(By.name("submit"));;
        searchField.click();
    }
}
