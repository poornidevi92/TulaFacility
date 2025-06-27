package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LoginPage{

    public static WebDriver driver;

    @Given("navigate to the dev tula software site with valid url")
    public void NavigateToLoginPage() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        System.setProperty("Webdriver.chrome.driver", "E://IntelliJ Java Prgrams and frameworks_poornima//Selenium jars and drivers//Drivers//Chromedriver//Chromedriver//Chromedriver.exe");
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get("https://dev.icsr.in/Devtula");
    }

    @Then("Enter username")
        public void EnterUsername(){
        driver.findElement(By.id("UserName")).sendKeys("VS13249");

        }
        @Then ("Enter password")
                public void EnterPassword(){
        driver.findElement(By.id("Password")).sendKeys("PUNJABpeas@28");

        }
        @Then("click login button")
                public void clickLogin(){
        driver.findElement(By.id("btnlogin")).click();

        }

}





