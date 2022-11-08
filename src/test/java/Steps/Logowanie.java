package Steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Logowanie {

    WebDriver driver;

    @Given("Uzytkownik otwiera przegladarke")
    public void testUzytkownikOtwieraPrzegladarke(){
        System.out.println("Uzytkownik otworzyl przegladarke");
        System.setProperty("webdriver.chrome.driver","d:/chromedriver_win32/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
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

    }
    @When("Uzytkownik klika przycisk Login")
    public void uzytkownik_klika_przycisk_login() {
        System.out.println("Uzytkownik klika przycisk Login");

    }
    @Then("Uzytkownik został poprawnie zalogowany")
    public void uzytkownik_został_poprawnie_zalogowany() {
        System.out.println("Uzytkownik zostaje poprawnie zalogowany");
    }
}
