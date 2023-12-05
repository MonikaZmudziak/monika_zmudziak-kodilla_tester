package com.kodilla.selenium.pom.homework;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

class KodillaStorePomTest {
    KodillaStorePom kodillaStorePom;

    WebDriver driver;

    @BeforeEach
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(chromeOptions);
        driver.navigate().to("https://kodilla.com/pl/test/store");
        kodillaStorePom = new KodillaStorePom(driver);
    }

    @Test
    public void testKodillaStorePage_NoteBook() {
        String searchedPhrase = "Notebook";
        int numberOfResults = kodillaStorePom.searchForProducts(searchedPhrase).size();

        Assertions.assertEquals(2, numberOfResults);
    }

    @Test
    public void testKodillaStorePage_School() {
        String searchedPhrase = "School";
        int numberOfResults = kodillaStorePom.searchForProducts(searchedPhrase).size();

        Assertions.assertEquals(1, numberOfResults);
    }

    @Test
    public void testKodillaStorePage_Brand() {
        String searchedPhrase = "Brand";
        int numberOfResults = kodillaStorePom.searchForProducts(searchedPhrase).size();

        Assertions.assertEquals(1, numberOfResults);
    }

    @Test
    public void testKodillaStorePage_Business() {
        String searchedPhrase = "Business";
        int numberOfResults = kodillaStorePom.searchForProducts(searchedPhrase).size();

        Assertions.assertEquals(0, numberOfResults);
    }

    @Test
    public void testKodillaStorePage_Powerfull_NoResult() {
        String searchedPhrase = "Powerful";
        int numberOfResults = kodillaStorePom.searchForProducts(searchedPhrase).size();

        Assertions.assertEquals(0, numberOfResults);
        Assertions.assertTrue(kodillaStorePom.getNoResultMessage().contains("nie mamy tego czego szukasz"));
    }

    @ParameterizedTest
    @ValueSource(strings = {"NOTEBOOK", "notebooK", "notebook"})
    public void testKodillaStorePage_CaseInsensitiveTextTest(String searchedPhrase) {

        Assertions.assertTrue(kodillaStorePom.searchForProducts(searchedPhrase).size() >= 0);
    }

    @ParameterizedTest
    @ValueSource(strings = {"NOTEBOOK", "notebooK", "notebook"})
    public void testStoreKodillaPage_CaseInsensitiveTextTestNumberOfProduct(String searchedPhrase) {

        Assertions.assertEquals(2, kodillaStorePom.searchForProducts(searchedPhrase).size());
    }

    @AfterEach
    public void testDown() {
        driver.close();
    }
}