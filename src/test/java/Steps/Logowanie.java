package Steps;

import io.cucumber.java.AfterAll;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.SQLOutput;

public class Logowanie {

    static WebDriver  driver;

    @BeforeAll
    public static void setDriver(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Before
    public void before (){
        System.out.println("Uruchomienie przed kazdym scenariuszem testowym");
    }

    @Given("Uzytkownik otwiera przegladarke")
    public void testUzytkownikOtwieraPrzegladarke(){
        System.out.println("Uzytkownik otworzyl przegladarke");
       //System.setProperty("webdriver.chrome.driver","d:/chromedriver_win32/chromedriver.exe");
        //driver = new ChromeDriver();
       // driver.manage().window().maximize();
    }
    //Given Uzytkownik wpisuje adres "https://the-internet.herokuapp.com/login"
    @Given("Uzytkownik wpisuje adres {string}")
    public void uzytkownik_wpisuje_adres(String url) {
        driver.navigate().to(url);
    }
    //When Uzytkownik wpisuje "tomsmith" w pole username
    @When("Uzytkownik wpisuje {string} w pole username")
    public void uzytkownik_wpisuje_w_pole_username(String nazwaUzytkownika) {
        driver.findElement(By.id("username")).sendKeys(nazwaUzytkownika);
    }
    //And Uzytkownik wpisuje "SuperSecretPassword!" w pole password
    @When("Uzytkownik wpisuje {string} w pole password")
    public void uzytkownik_wpisuje_w_pole_password(String haslo) {
        driver.findElement(By.id("password")).sendKeys(haslo);
    }

    @Given("Uzytkownik wpisuje adres https:\\/\\/the-internet.herokuapp.com\\/login")
    public void uzytkownik_wpisuje_adres_https_the_internet_herokuapp_com_login() {
        System.out.println("Uzytkownik wpisuje adres strony internetowej");
        driver.navigate().to("https://the-internet.herokuapp.com/login");

    }
    @When("Uzytkownik wpisuje poprawny username")
    public void uzytkownik_wpisuje_poprawny_username() {
        System.out.println("Uzytkownik wpisuje poprawny login");
        driver.findElement(By.id("username")).sendKeys("tomsmith");
    }
    @When("Uzytkownik wpisuje poprawne haslo")
    public void uzytkownik_wpisuje_poprawne_haslo() {
        System.out.println("Uzytkownik wpisuje poprawne haslo");
        WebElement inputPassword = driver.findElement(By.id("password"));
        inputPassword.sendKeys("SuperSecretPassword!");


    }
    @When("Uzytkownik klika przycisk Login")
    public void uzytkownik_klika_przycisk_login() {
        System.out.println("Uzytkownik klika przycisk Login");
        driver.findElement(By.className("radius")).click();

    }
    @Then("Uzytkownik został poprawnie zalogowany")
    public void uzytkownik_został_poprawnie_zalogowany() {
        System.out.println("Uzytkownik zostaje poprawnie zalogowany");
        Assert.assertEquals("https://the-internet.herokuapp.com/secure", driver.getCurrentUrl());
        //driver.close();
    }
    @When("Uzytkownik wpisuje niepoprawne haslo")
    public void uzytkownik_wpisuje_niepoprawne_haslo() {
       driver.findElement(By.id("password")).sendKeys("zxcvbnm");
    }
    @Then("Uzytkownik nie został poprawnie zalogowany")
    public void uzytkownik_nie_został_poprawnie_zalogowany(){
        Assert.assertEquals("https://the-internet.herokuapp.com/login", driver.getCurrentUrl());
        //driver.close();
    }
    @AfterAll
    public static void tearDown(){
        driver.close();
    }
}
