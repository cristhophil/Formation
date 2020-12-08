package test.java;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class FirefoxTest {

    @Test
    public void startFirefoxDriver() {
        //Récupération du nom du driver
        String path = System.setProperty("webdriver.gecko.driver", "C:\\Users\\Ovalie Tech\\Desktop\\Formation Tests\\geckodriver.exe");
        //Initialisation de l'instance du driver
        WebDriver driver = new FirefoxDriver();

        //Lancement avec la fenêtre maximisée
        driver.manage().window().maximize();

        //Lancement du navigateur
        driver.get("http://demo.guru99.com/test/newtours/");

        //signup an account by using signup class
        SignUpMercury signUp = new SignUpMercury();
        signUp.registerAccount(driver);

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        //Fermeture du navigateur
        //driver.quit();
    }

}
