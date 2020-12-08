package test.java;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class LancementChrome {

    @Test
    public void startChrome() {
        //Récupération du nom du driver
        String path = System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver.exe");

        //Initialisation de l'instance du driver
        WebDriver driver = new ChromeDriver();

        //Lancement avec la fenêtre maximisée
        driver.manage().window().maximize();

        //Lancement du navigateur
        driver.get("http://demo.guru99.com/test/newtours/");

        //signup an account by using signup class
        SignUpMercury signUp = new SignUpMercury();
        signUp.registerAccount(driver);

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        //Fermeture du navigateur
        driver.quit();
    }

}
